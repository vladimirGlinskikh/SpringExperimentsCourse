package kz.zhelezyaka.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.err.println("An exception was caught: " + e);
        }
        context.close();
    }
}
