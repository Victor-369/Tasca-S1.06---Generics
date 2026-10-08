package com.pruebas.proyecto.nivell2.exercici1;

public class GenericMethods {
    public <T, V> void printElements(T value1, String value2, V value3) {
        System.out.println(formatElements(value1, value2, value3));
    }

    public <T, V> String formatElements(T value1, String value2, V value3) {
        return "Value 1: " + value1 + System.lineSeparator()
                + "Value 2: " + value2 + System.lineSeparator()
                + "Value 3: " + value3;
    }
}
