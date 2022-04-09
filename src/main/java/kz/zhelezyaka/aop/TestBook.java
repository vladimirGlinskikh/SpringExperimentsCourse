package kz.zhelezyaka.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBook {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary",
                UniversityLibrary.class);
        Book book = context.getBean("book", Book.class);

        universityLibrary.getBook();
        universityLibrary.addBook("Vladimir", book);
        universityLibrary.addMagazine();
//        universityLibrary.returnMagazine();
//        System.out.println("---------------");
//        universityLibrary.addBook();
//        System.out.println("---------------");

        context.close();
    }
}
