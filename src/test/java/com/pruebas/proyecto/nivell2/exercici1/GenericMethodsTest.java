package com.pruebas.proyecto.nivell2.exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMethodsTest {
    @Test
    void print_givenDifferentTypeOfElements_showsEachElement() {
        Person person = new Person("John", "Smith", 32);
        String text = "This is a short text";
        int randomAge = 44;

        String result = new GenericMethods().formatElements(person, text, randomAge);
        assertEquals(
                "Value 1: " + person + System.lineSeparator()
                        + "Value 2: " + text + System.lineSeparator()
                        + "Value 3: " + randomAge,
                result
        );
    }

    @Test
    void print_givenDifferentTypeOfElementsInDifferentOrder_showsEachElement() {
        Person person = new Person("Elena", "Stock", 19);
        String text = "This is a short text, again";
        int randomAge = 23;

        String result = new GenericMethods().formatElements(randomAge, text, person);
        assertEquals(
                "Value 1: " + randomAge + System.lineSeparator()
                        + "Value 2: " + text + System.lineSeparator()
                        + "Value 3: " + person,
                result
        );
    }
}
