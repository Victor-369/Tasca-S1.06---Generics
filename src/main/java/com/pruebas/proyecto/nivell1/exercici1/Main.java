package com.pruebas.proyecto.nivell1.exercici1;

public class Main {
    public static void main(String[] args) {
        generateFirstExample();
        generateSecondExample();
    }

    public static void generateFirstExample() {
        NoGenericMethods noGenericMethods1 = new NoGenericMethods("Red", "Green", "Blue");

        System.out.println("First order: Red, Green, Blue");
        System.out.println("Element 1: " + noGenericMethods1.getElement1());
        System.out.println("Element 2: " + noGenericMethods1.getElement2());
        System.out.println("Element 3: " + noGenericMethods1.getElement3());
    }

    public static void generateSecondExample() {
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("Blue", "Red", "Green");

        System.out.println("\nSecond order: Blue, Red, Green\n");
        System.out.println("Element 1: " + noGenericMethods2.getElement1());
        System.out.println("Element 2: " + noGenericMethods2.getElement2());
        System.out.println("Element 3: " + noGenericMethods2.getElement3());
    }
}
