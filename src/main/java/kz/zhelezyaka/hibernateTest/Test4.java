package kz.zhelezyaka.hibernateTest;

import kz.zhelezyaka.hibernateTest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
            session.createQuery("delete Employee " +
                    "where name = 'Alexandr'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Transaction was well done");
        } finally {
            factory.close();
        }
    }
}
