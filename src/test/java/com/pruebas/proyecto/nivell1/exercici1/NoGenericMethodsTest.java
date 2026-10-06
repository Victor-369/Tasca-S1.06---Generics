package com.pruebas.proyecto.nivell1.exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NoGenericMethodsTest {
    @Test
    void constructorStoresEachArgumentInItsCorrespondingElement() {
        NoGenericMethods values = new NoGenericMethods("Red", "Green", "Blue");

        assertAll(
                () -> assertEquals("Red", values.getElement1()),
                () -> assertEquals("Green", values.getElement2()),
                () -> assertEquals("Blue", values.getElement3())
        );
    }

    @Test
    void constructorAcceptsValuesInDifferentOrder() {
        NoGenericMethods values = new NoGenericMethods("Blue", "Red", "Green");

        assertAll(
                () -> assertEquals("Blue", values.getElement1()),
                () -> assertEquals("Red", values.getElement2()),
                () -> assertEquals("Green", values.getElement3())
        );
    }
}
