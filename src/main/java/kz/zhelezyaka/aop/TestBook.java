package kz.zhelezyaka.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBook {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();
        context.close();
    }
}
