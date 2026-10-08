package com.pruebas.proyecto.nivell2.exercici2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMethodsTest {
    @Test
    void print_givenDifferentTypeOfElements_showsEachElement() {
        Person person = new Person("John", "Smith", 32);
        String text = "This is a short text";
        int randomAge = 18;

        String result = new GenericMethods().formatAll(person, text, randomAge);

        assertEquals(
                "Value 1: " + person + System.lineSeparator()
                        + "Value 2: " + text + System.lineSeparator()
                        + "Value 3: " + randomAge + System.lineSeparator(),
                result
        );
    }

    @Test
    void print_givenDifferentTypeOfElementsInDifferentOrder_showsEachElement() {
        Person person = new Person("Elena", "Stock", 19);
        String text = "This is a short text, again";
        int randomAge = 20;

        String result = new GenericMethods().formatAll(randomAge, text, person);
        assertEquals(
                "Value 1: " + randomAge + System.lineSeparator()
                        + "Value 2: This is a short text, again" + System.lineSeparator()
                        + "Value 3: Person{name='Elena', surname='Stock', age=19}" + System.lineSeparator(),
                result
        );
    }

    @Test
    void format_givenNoArguments_returnsEmptyString() {
        assertEquals("", new GenericMethods().formatAll());
    }

    @Test
    void format_givenOneArgument_returnsOneLabeledLine() {
        assertEquals(
                "Value 1: Only value" + System.lineSeparator(),
                new GenericMethods().formatAll("Only value")
        );
    }

    @Test
    void format_givenMoreThanThreeArguments_numbersEveryElement() {
        assertEquals(
                "Value 1: first" + System.lineSeparator()
                        + "Value 2: 2" + System.lineSeparator()
                        + "Value 3: third" + System.lineSeparator()
                        + "Value 4: 4" + System.lineSeparator(),
                new GenericMethods().formatAll("first", 2, "third", 4)
        );
    }
}
