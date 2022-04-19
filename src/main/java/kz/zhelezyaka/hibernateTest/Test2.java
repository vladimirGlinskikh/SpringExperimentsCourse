package kz.zhelezyaka.hibernateTest;

import kz.zhelezyaka.hibernateTest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employeeList = session.createQuery("from Employee ")
//                    .getResultList();

            List<Employee> employeeList =
                    session.createQuery("from Employee where name = 'Vladimir'")
                            .getResultList();

            for (Employee e : employeeList) {
                System.out.println(e);
            }

            session.getTransaction().commit();
            System.out.println("Transaction was well done");
        } finally {
            factory.close();
        }
    }
}
