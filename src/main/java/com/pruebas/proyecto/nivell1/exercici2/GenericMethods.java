package com.pruebas.proyecto.nivell1.exercici2;

public class GenericMethods {
    public <T, U, V> void printElements(T value1, U value2, V value3) {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
        System.out.println("Value 3: " + value3);
    }
}
