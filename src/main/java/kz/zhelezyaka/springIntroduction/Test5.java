package kz.zhelezyaka.springIntroduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        Person anotherPerson = context.getBean("personBean", Person.class);
//
//        System.out.println(person == anotherPerson);
//        person.callYourPet();

//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet anotherCat = context.getBean("catBean", Pet.class);

//        System.out.println(cat == anotherCat);

        context.close();
    }
}
