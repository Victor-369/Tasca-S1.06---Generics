package com.pruebas.proyecto.nivell2.exercici2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericMethodsTest {
    @Test
    void formatAll_givenDifferentTypeOfElements_showsEachElement() {
        Person person = new Person("John", "Smith", 36);
        String text = "This is a short text";
        int randomAge = 18;

        String result = new GenericMethods().formatAll(person, text, randomAge);
        assertTrue(result.contains("John"));
        assertTrue(result.contains("Smith"));
        assertTrue(result.contains("36"));
        assertTrue(result.contains("This is a short text"));
        assertTrue(result.contains("18"));
    }

    @Test
    void formatAll_givenDifferentTypeOfElementsInDifferentOrder_showsEachElement() {
        Person person = new Person("Diana", "Emert", 20);
        String text = "This is a short text, again";
        int randomAge = 20;

        String result = new GenericMethods().formatAll(randomAge, text, person);
        assertTrue(result.contains("Diana"));
        assertTrue(result.contains("Emert"));
        assertTrue(result.contains("20"));
        assertTrue(result.contains("This is a short text, again"));
        assertTrue(result.contains("20"));
    }

    @Test
    void formatAll_givenNoArguments_returnsEmptyString() {
        assertEquals("", new GenericMethods().formatAll());
    }

    @Test
    void formatAll_givenOneArgument_returnsOneLabeledLine() {
        assertEquals(
                "Value 1: Only value" + System.lineSeparator(),
                new GenericMethods().formatAll("Only value")
        );
    }

    @Test
    void formatAll_givenMoreThanThreeArguments_numbersEveryElement() {
        assertEquals(
                "Value 1: first" + System.lineSeparator()
                        + "Value 2: 2" + System.lineSeparator()
                        + "Value 3: third" + System.lineSeparator()
                        + "Value 4: 4" + System.lineSeparator(),
                new GenericMethods().formatAll("first", 2, "third", 4)
        );
    }
}
