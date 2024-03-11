package com.Abstraction.B;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();

        System.out.println();
        System.out.println("Mushuk natijalari :");

        System.out.println("Ovozi : " + cat.sound());
        System.out.println("Nomi : " + cat.getName());

        System.out.println();
        System.out.println("Kuchuk natijalari :");

        System.out.println("Ovozi : " + dog.sound());
        System.out.println("Nomi : " + dog.getName());

        System.out.println();
        System.out.println("O'rdak natijalari :");

        System.out.println("Ovozi : " + duck.sound());
        System.out.println("Nomi : " + duck.getName());
    }
}
