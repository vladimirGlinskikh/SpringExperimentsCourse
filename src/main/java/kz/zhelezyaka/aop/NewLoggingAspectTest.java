package kz.zhelezyaka.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewLoggingAspectTest {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary library = context.getBean("universityLibrary", UniversityLibrary.class);
        final String bookName = library.returnBook();
        System.out.println("In library returned a book " + bookName);
        context.close();
        System.out.println("Method main ends");
    }
}
