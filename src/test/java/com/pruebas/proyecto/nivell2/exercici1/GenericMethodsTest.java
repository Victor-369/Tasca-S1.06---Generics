package com.pruebas.proyecto.nivell2.exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericMethodsTest {
    @Test
    void formatElements_givenDifferentTypeOfElements_showsEachElement() {
        Person person = new Person("John", "Smith", 32);
        String text = "This is a short text";
        int randomAge = 44;

        String result = new GenericMethods().formatElements(person, text, randomAge);
        assertTrue(result.contains("John"));
        assertTrue(result.contains("Smith"));
        assertTrue(result.contains("32"));
        assertTrue(result.contains("This is a short text"));
        assertTrue(result.contains("44"));
    }

    @Test
    void formatElements_givenDifferentTypeOfElementsInDifferentOrder_showsEachElement() {
        Person person = new Person("Elena", "Stock", 19);
        String text = "This is a short text, again";
        int randomAge = 23;

        String result = new GenericMethods().formatElements(randomAge, text, person);
        assertTrue(result.contains("Elena"));
        assertTrue(result.contains("Stock"));
        assertTrue(result.contains("19"));
        assertTrue(result.contains("This is a short text, again"));
        assertTrue(result.contains("23"));
    }
}
