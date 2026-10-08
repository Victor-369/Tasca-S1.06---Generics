# Exercise 1 — Partially generic method

This exercise demonstrates a generic method in which one parameter has a fixed type and the other two remain generic.

## Requirements

Implement methods that accept three parameters: the first and third should have generic types, while the second should have the fixed type `String`. The
values should be formatted in their original order and printed by `Main`.

## Implementation

`GenericMethods.formatElements()` declares two type parameters, `T` and `V`:

```java
public <T, V> String formatElements(T value1, String value2, V value3)
```

The first and third arguments can therefore have different types, while the second argument must be a `String`. `printElements()` prints the formatted
result returned by `formatElements()`. `Main` demonstrates this with a `Person`, a `String` and an integer. Java boxes the integer to `Integer` when it is
passed to the generic method.

## Tests

`GenericMethodsTest` checks the `String` returned by `formatElements()` for values in order and for different types in the first and third arguments. The
fixed `String` type of the second parameter is enforced by the method signature and checked by the Java compiler; the tests do not capture standard output.

Run the tests from the project root with:

```sh
mvn test
```

## Run

From the project root, compile the project and run the example:

```sh
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell2.exercici1.Main
```
