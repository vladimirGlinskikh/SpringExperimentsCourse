package kz.zhelezyaka.hibernateTest;

import kz.zhelezyaka.hibernateTest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Employee set salary = 900 " +
                    " where name = 'Vladimir'").executeUpdate();

//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(1300);

            session.getTransaction().commit();
            System.out.println("Transaction was well done");
        } finally {
            factory.close();
        }
    }
}
