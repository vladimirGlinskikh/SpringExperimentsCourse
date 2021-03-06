package kz.zhelezyaka.hibernateTest;

import kz.zhelezyaka.hibernateTest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Alexandr", "Semenov",
                    "Soul", 1000);
            session.beginTransaction();
            session.save(employee);

            int myId = employee.getId();
            Employee employeeGetId = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employeeGetId);
            System.out.println("Transaction was well done");
        } finally {
            factory.close();
        }
    }
}
