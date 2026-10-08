package com.pruebas.proyecto.nivell1.exercici2;

public class GenericMethods {
    public <T, U, V> void printElements(T value1, U value2, V value3) {
        System.out.println(formatElements(value1, value2, value3));
    }

    public <T, U, V> String formatElements(T value1, U value2, V value3) {
        return "Value 1: " + value1 + System.lineSeparator()
                + "Value 2: " + value2 + System.lineSeparator()
                + "Value 3: " + value3;
    }
}
