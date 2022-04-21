package kz.zhelezyaka.hibernateOneToOneRelationsExample;

import kz.zhelezyaka.hibernateOneToOneRelationsExample.entity.Detail;
import kz.zhelezyaka.hibernateOneToOneRelationsExample.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee(
//                    "Vladimir",
//                    "Glinskikh",
//                    "IT", 700);
//
//            Detail detail = new Detail(
//                    "Kostanay",
//                    "+77017895671",
//                    "spring@gmail.com");
//            employee.setEmployeeDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Transaction was well done");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee(
//                    "Nikolay",
//                    "Romanov",
//                    "Sales", 500);
//
//            Detail detail = new Detail(
//                    "Kostanay",
//                    "+77017895673",
//                    "springNikolay@gmail.com");
//            employee.setEmployeeDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Transaction was well done");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 3);
            session.delete(employee);
            session.getTransaction().commit();
            System.out.println("Transaction was well done");
        } finally {
            session.close();
            factory.close();
        }
    }
}
