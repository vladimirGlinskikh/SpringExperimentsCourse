package kz.zhelezyaka.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We're taking a book from university library");
        System.out.println("-------------------------------------------");
    }

    public void returnBook() {
        System.out.println("We're returning a book in university library");
        System.out.println("--------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("We're taking a magazine from university library");
        System.out.println("-----------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We're returning a magazine in university library");
        System.out.println("------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We're added a book in university library");
        System.out.println("----------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We're added a magazine in university library");
        System.out.println("--------------------------------------------");
    }
}
