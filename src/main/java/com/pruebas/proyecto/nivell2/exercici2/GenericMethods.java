package com.pruebas.proyecto.nivell2.exercici2;

public class GenericMethods {
    @SafeVarargs
    public final <T> void printAll(T... values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println("Value " + (i + 1) + ": " + values[i]);
        }
    }
}
