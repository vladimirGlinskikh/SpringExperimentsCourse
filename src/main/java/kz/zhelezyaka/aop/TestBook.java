package kz.zhelezyaka.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBook {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary",
                UniversityLibrary.class);
        universityLibrary.getBook();
        System.out.println("---------------");
        universityLibrary.returnBook();
        System.out.println("---------------");
        universityLibrary.getMagazine();
        System.out.println("---------------");
        System.out.println();

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",
                SchoolLibrary.class);
        schoolLibrary.getBook();
        System.out.println("---------------");
        schoolLibrary.returnBook();

        context.close();
    }
}
