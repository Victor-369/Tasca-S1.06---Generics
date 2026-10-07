package com.pruebas.proyecto.nivell2.exercici2;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMethodsTest {
    @Test
    void print_givenDifferentTypeOfElements_showsEachElement() {
        Person person = new Person("John", "Smith", 32);
        String text = "This is a short text";

        String output = captureOutput(() -> new GenericMethods().printAll(person, text, 44));

        String newLine = System.lineSeparator();
        assertEquals(
                "Value 1: Person{name='John', surname='Smith', age=32}" + newLine
                        + "Value 2: This is a short text" + newLine
                        + "Value 3: 44" + newLine,
                output
        );
    }

    @Test
    void print_givenDifferentTypeOfElementsInDifferentOrder_showsEachElement() {
        Person person = new Person("Elena", "Stock", 19);
        String text = "This is a short text, again";

        String output = captureOutput(() -> new GenericMethods().printAll(23, text, person));

        String newLine = System.lineSeparator();
        assertEquals(
                "Value 1: 23" + newLine
                        + "Value 2: This is a short text, again" + newLine
                        + "Value 3: Person{name='Elena', surname='Stock', age=19}" + newLine,
                output
        );
    }

    @Test
    void print_givenOneArgument_printsThatArgument() {
        String output = captureOutput(() -> new GenericMethods().printAll("Only value"));

        assertEquals("Value 1: Only value" + System.lineSeparator(), output);
    }

    @Test
    void print_givenNoArguments_printsNothing() {
        String output = captureOutput(() -> new GenericMethods().printAll());

        assertEquals("", output);
    }

    private String captureOutput(Runnable action) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try (PrintStream capturedOut = new PrintStream(output)) {
            System.setOut(capturedOut);
            action.run();
        } finally {
            System.setOut(originalOut);
        }

        return output.toString();
    }
}
