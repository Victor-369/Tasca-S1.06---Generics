# Exercise 2 — Generic method with multiple parameters

This exercise demonstrates passing values of different types to a generic method and printing them in their original order.

## Requirements

Create a `Person` class with `name`, `surname` and `age` attributes. Implement a generic `printElements()` method that accepts three arguments and prints
each one. Call it from `Main` with a `Person`, a `String` and a numeric value, and demonstrate that the argument order can vary.

## Implementation

`Person` stores the person's name, surname and age. Its `toString()` method formats those fields so the object can be printed with its data.

`GenericMethods.printElements()` prints the three arguments with labels. `Main` calls it with a `Person`, a `String` and an `int`; Java boxes the primitive
integer for the generic method. The method declares a separate type parameter for each argument, so the arguments can have different types without
requiring Java to infer one common type for all three.

## Tests

`GenericMethodsTest` captures standard output and checks the printed values and their order for mixed-type arguments, including when the arguments are
passed in a different order. Run the tests from the project root with:

```sh
mvn test
```

## Run

From the project root, compile the project and run the example:

```sh
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici2.Main
```
