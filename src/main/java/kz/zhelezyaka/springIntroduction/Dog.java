package kz.zhelezyaka.springIntroduction;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Wow-wow");
    }
}
