package kz.zhelezyaka.hibernateOneToManyBiRelationsExample;

import kz.zhelezyaka.hibernateOneToManyBiRelationsExample.entity.Department;
import kz.zhelezyaka.hibernateOneToManyBiRelationsExample.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Department department1 = new Department("IT", 400, 1300);
//            Department department2 = new Department("HR", 500, 1200);
//            Employee employee1 = new Employee("Vladimir", "Glinskikh", 700);
//            Employee employee2 = new Employee("Andrey", "Shatalov", 600);
//            Employee employee3 = new Employee("Svetlana", "Svetikova", 800);
//
//            department1.addEmployeeToDepartment(employee1);
//            department1.addEmployeeToDepartment(employee2);
//            department2.addEmployeeToDepartment(employee3);
//
//            session.beginTransaction();
//            session.save(department1);
//            session.save(department2);
//
//            session.getTransaction().commit();
//            System.out.println("Transaction was well done");

            session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 1);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Show employees of the department");
            System.out.println(department.getEmployees());

            session.getTransaction().commit();
            System.out.println("Transaction was well done");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 3);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Transaction was well done");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Transaction was well done");
        } finally {
            session.close();
            factory.close();
        }
    }
}
