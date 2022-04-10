package kz.zhelezyaka.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Glinskikh Vladimir",
                3, 7.8);
        Student student2 = new Student("Romanov Nokolay",
                4, 8.8);
        Student student3 = new Student("Kim Lubov",
                2, 9.5);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Starting work method getStudents()");
        System.out.println("Information from method getStudents(): ");
        System.out.println(students);
        return students;
    }
}
