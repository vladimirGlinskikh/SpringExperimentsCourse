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

    public void returnMagazine() {
        System.out.println("We're returning a magazine in university library");
    }

    public void addBook() {
        System.out.println("We're added a book in university library");
    }

    public void addMagazine() {
        System.out.println("We're added a magazine in university library");
    }
}
