package com.pruebas.proyecto.nivell1.exercici2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Erik", "Coolest", 32);
        String text = "This is another text to show";
        int randomAge = 66;

        new GenericMethods().printElements(person, text, randomAge);
    }
}
