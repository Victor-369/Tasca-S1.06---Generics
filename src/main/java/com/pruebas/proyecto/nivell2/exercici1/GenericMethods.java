package com.pruebas.proyecto.nivell2.exercici1;

public class GenericMethods {
    public <T, V> void printElements(T value1, String value2, V value3) {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
        System.out.println("Value 3: " + value3);
    }
}
