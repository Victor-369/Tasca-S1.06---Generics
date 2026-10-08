# Exercise 2 — Generic method with multiple parameters

This exercise demonstrates passing values of different types to a generic method, formatting them in their original order and printing the formatted
result from `Main`.

## Requirements

Create a `Person` class with `name`, `surname` and `age` attributes. Implement generic methods that accept three arguments and show each one with a label.
Call the printing method from `Main` with a `Person`, a `String` and a numeric value, and demonstrate that the argument order can vary.

## Implementation

`Person` stores the person's name, surname and age. Its `toString()` method formats those fields so the object can be printed with its data.

`GenericMethods.formatElements()` returns the three arguments with labels as a `String`, using a separate type parameter for each argument so they can
have different types. `GenericMethods.printElements()` prints that formatted result, and `Main` calls it with a `Person`, a `String` and an `int`; Java
boxes the primitive integer for the generic method.

## Tests

`GenericMethodsTest` calls `formatElements()` and checks its returned `String` for mixed-type arguments, including when the arguments are passed in a
different order. It does not need to capture standard output. Run the tests from the project root with:

```sh
mvn test
```

## Run

From the project root, compile the project and run the example:

```sh
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici2.Main
```
