# Exercise 2 — Generic varargs

This exercise demonstrates a generic method that accepts a variable number of arguments.

## Requirements

Adapt the previous exercise so that the generic varargs methods accept any number of arguments, including values of different types, and format them in
order. `Main` demonstrates printing the result.

## Implementation

`GenericMethods.formatAll()` declares a generic varargs parameter and returns the labeled values as a `String`:

```java
@SafeVarargs
public final <T> String formatAll(T... values);
```

`printAll()` prints the result of `formatAll()`. `Main` calls it with a `Person`, a `String` and an integer. Java boxes the integer to `Integer`. The
arguments may have different types; Java infers a common type for the values in each call. `formatAll()` returns an empty string when called without
arguments and appends a line separator after each formatted value.

Generic varargs are implemented with an array whose component type is not reified at runtime. This can lead to heap pollution, where the array contains
values of a type that does not match its apparent component type, and can cause unchecked warnings. `@SafeVarargs` suppresses the warning for each
annotated method; it does not make an unsafe implementation safe. It is appropriate here because the methods only read the values to build or print the
result, and do not store values in or expose the array. The annotation should only be used when the method implementation is safe in this way.

## Tests

`GenericMethodsTest` checks the string returned by `formatAll()` for mixed-type arguments, including when their order changes, and for zero, one and more
than three arguments. These tests compare the returned value directly and do not capture standard output. Run the tests from the project root with:

```sh
mvn test
```

## Run

From the project root, compile the project and run the example:

```sh
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell2.exercici2.Main
```
