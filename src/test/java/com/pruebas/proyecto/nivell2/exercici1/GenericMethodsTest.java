package com.pruebas.proyecto.nivell2.exercici1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMethodsTest {
    @Test
    void print_givenDifferentTypeOfElements_showsEachElement() {
        Person person = new Person("John", "Smith", 32);
        String text = "This is a short text";
        int randomAge = 44;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try (PrintStream capturedOut = new PrintStream(output)) {
            System.setOut(capturedOut);
            new GenericMethods().printElements(person, text, randomAge);
        } finally {
            System.setOut(originalOut);
        }

        String newLine = System.lineSeparator();
        assertEquals(
                "Value 1: Person{name='John', surname='Smith', age=32}" + newLine
                        + "Value 2: This is a short text" + newLine
                        + "Value 3: 44" + newLine,
                output.toString()
        );
    }

    @Test
    void print_givenDifferentTypeOfElementsInDifferentOrder_showsEachElement() {
        Person person = new Person("Elena", "Stock", 19);
        String text = "This is a short text, again";
        int randomAge = 23;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try (PrintStream capturedOut = new PrintStream(output)) {
            System.setOut(capturedOut);
            new GenericMethods().printElements(randomAge, text, person);
        } finally {
            System.setOut(originalOut);
        }

        String newLine = System.lineSeparator();
        assertEquals(
                "Value 1: 23" + newLine
                        + "Value 2: This is a short text, again" + newLine
                        + "Value 3: Person{name='Elena', surname='Stock', age=19}" + newLine,
                output.toString()
        );
    }
}
