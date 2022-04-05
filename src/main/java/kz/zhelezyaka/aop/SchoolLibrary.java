package kz.zhelezyaka.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We're taking a book from school library");
    }

    public void returnBook() {
        System.out.println("We're returning a book in school library");
    }
}
