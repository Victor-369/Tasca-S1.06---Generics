package com.pruebas.proyecto.nivell2.exercici2;

public class GenericMethods {
    @SafeVarargs
    public final <T> void printAll(T... values) {
        System.out.println(formatAll(values));
    }

    @SafeVarargs
    public final <T> String formatAll(T... values) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            result.append("Value ")
                    .append(i + 1)
                    .append(": ")
                    .append(values[i])
                    .append(System.lineSeparator());
        }

        return result.toString();
    }
}
