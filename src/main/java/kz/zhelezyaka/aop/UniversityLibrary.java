package kz.zhelezyaka.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We're taking a book from university library");
    }

    public void returnBook() {
        System.out.println("We're returning a book in university library");
    }

    public void getMagazine() {
        System.out.println("We're taking a magazine from university library");
    }
}
