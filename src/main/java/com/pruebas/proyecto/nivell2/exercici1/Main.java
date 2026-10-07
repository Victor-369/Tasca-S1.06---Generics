package com.pruebas.proyecto.nivell2.exercici1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Oscar", "Ram", 56);
        String text = "This is another text to show";
        int randomAge = 78;

        new GenericMethods().printElements(person, text, randomAge);
    }
}
