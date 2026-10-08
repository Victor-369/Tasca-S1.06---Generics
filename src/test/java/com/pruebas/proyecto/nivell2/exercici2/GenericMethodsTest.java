package com.pruebas.proyecto.nivell2.exercici2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMethodsTest {
    @Test
    void print_givenDifferentTypeOfElements_showsEachElement() {
        Person person = new Person("John", "Smith", 32);
        String text = "This is a short text";

        String result = new GenericMethods().formatAll(person, text, 44);

        assertEquals(
                "Value 1: " + person + System.lineSeparator()
                        + "Value 2: " + text + System.lineSeparator()
                        + "Value 3: 44" + System.lineSeparator(),
                result
        );
    }

    @Test
    void print_givenDifferentTypeOfElementsInDifferentOrder_showsEachElement() {
        Person person = new Person("Elena", "Stock", 19);
        String text = "This is a short text, again";

        String result = new GenericMethods().formatAll(33, text, person);
        assertEquals(
                "Value 1: 23" + System.lineSeparator()
                        + "Value 2: This is a short text, again" + System.lineSeparator()
                        + "Value 3: Person{name='Elena', surname='Stock', age=19}" + System.lineSeparator(),
                result
        );
    }
}
