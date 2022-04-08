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
        universityLibrary.getMagazine();
        System.out.println("---------------");
//        universityLibrary.returnMagazine();
//        System.out.println("---------------");
//        universityLibrary.addBook();
//        System.out.println("---------------");

        context.close();
    }
}
