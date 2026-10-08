package com.pruebas.proyecto.nivell1.exercici1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods noGenericMethods1 = new NoGenericMethods("Red", "Green", "Blue");
        printFirstExample(noGenericMethods1);

        NoGenericMethods noGenericMethods2 = new NoGenericMethods("Blue", "Red", "Green");
        printSecondExample(noGenericMethods2);
    }

    public static void printFirstExample(NoGenericMethods noGenericMethods) {
        System.out.print("\n");
        System.out.println("First order: Red, Green, Blue");
        System.out.println("Element 1: " + noGenericMethods.getElement1());
        System.out.println("Element 2: " + noGenericMethods.getElement2());
        System.out.println("Element 3: " + noGenericMethods.getElement3());
    }

    public static void printSecondExample(NoGenericMethods noGenericMethods) {
        System.out.print("\n");
        System.out.println("Second order: Blue, Red, Green");
        System.out.println("Element 1: " + noGenericMethods.getElement1());
        System.out.println("Element 2: " + noGenericMethods.getElement2());
        System.out.println("Element 3: " + noGenericMethods.getElement3());
    }
}
