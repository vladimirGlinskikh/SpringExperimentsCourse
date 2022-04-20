package kz.zhelezyaka.hebernateRelationsExample;

import kz.zhelezyaka.hebernateRelationsExample.entity.Employee;
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
            session.beginTransaction();

            session.getTransaction().commit();
            System.out.println("Transaction was well done");
        } finally {
            factory.close();
        }
    }
}
