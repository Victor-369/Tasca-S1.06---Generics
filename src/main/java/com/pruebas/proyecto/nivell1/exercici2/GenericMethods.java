package com.pruebas.proyecto.nivell1.exercici2;

public class GenericMethods {
    public <T> void printElements(T value1, T value2, T value3) {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
        System.out.println("Value 3: " + value3);
    }
}
