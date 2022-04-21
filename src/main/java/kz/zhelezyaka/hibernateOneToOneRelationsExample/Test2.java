package kz.zhelezyaka.hibernateOneToOneRelationsExample;

import kz.zhelezyaka.hibernateOneToOneRelationsExample.entity.Detail;
import kz.zhelezyaka.hibernateOneToOneRelationsExample.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Employee employee = new Employee(
//                    "Olesya",
//                    "Shvec",
//                    "HR", 750);
//
//            Detail detail = new Detail(
//                    "Almaty",
//                    "+77017895670",
//                    "springOlesya@gmail.com");
//
//            employee.setEmployeeDetail(detail);
//            detail.setEmployee(employee);
//
//            session.beginTransaction();
//            session.save(detail);
//            session.getTransaction().commit();
//
//            System.out.println("Transaction was well done");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 5);
//            System.out.println(detail.getEmployee());
//            session.getTransaction().commit();
//
//            System.out.println("Transaction was well done");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 5);
            session.delete(detail);
            session.getTransaction().commit();

            System.out.println("Transaction was well done");
        } finally {
            session.close();
            factory.close();
        }
    }
}
