# Exercise 1 — Class without generics

This exercise introduces the basic idea behind generics by implementing a class that stores three values without declaring a type parameter.

## Requirements

Create a `NoGenericMethods` class with a constructor that accepts three arguments of the same type, and provide `getElement1()`, `getElement2()` and
`getElement3()` methods to retrieve them. Values can be supplied in different orders; each is stored in the element matching its constructor position.

## Implementation

`NoGenericMethods` stores three `String` values in separate fields. Its constructor assigns each argument to its matching field, and the getter methods
return those values.

`Main` demonstrates two different argument orders using the same three colour strings, then prints the value returned by each getter. This provides a
non-generic example to compare with a generic implementation.

## Tests

`NoGenericMethodsTest` checks that all three constructor arguments are returned by their corresponding getters, including when the values are supplied in a
different order. Run the tests from the project root with:

```sh
mvn test
```

## Run

From the project root, compile the project and run the example:

```sh
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici1.Main
```
