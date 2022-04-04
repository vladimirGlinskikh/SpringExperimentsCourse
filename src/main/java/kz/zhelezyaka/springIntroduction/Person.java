package kz.zhelezyaka.springIntroduction;

import org.springframework.beans.factory.annotation.Value;

public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public Person(Pet pet) {
        System.out.println("Person bean is created in constructor with parameter");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: we're set up pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my pet!");
        pet.say();
    }
}
