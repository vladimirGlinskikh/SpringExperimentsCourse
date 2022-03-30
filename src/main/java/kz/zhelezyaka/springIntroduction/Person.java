package kz.zhelezyaka.springIntroduction;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");
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
