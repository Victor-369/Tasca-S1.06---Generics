# Exercise 2 — Generic varargs

This exercise demonstrates a generic method that accepts a variable number of arguments.

## Requirements

Adapt the previous exercise so that `printAll()` accepts any number of generic arguments, including values of different types, and prints them in order.

## Implementation

`GenericMethods.printAll()` declares a generic varargs parameter:

```java
@SafeVarargs
public final <T> void printAll(T... values);
```

`Main` calls the method with a `Person`, a `String` and an integer. Java boxes the integer to `Integer`. The arguments may have different types; Java infers a
common type for the values in each call.

Generic varargs are implemented with an array whose component type is not reified at runtime. This can lead to heap pollution, where the array contains
values of a type that does not match its apparent component type, and can cause unchecked warnings. `@SafeVarargs` suppresses the warning for this method;
it does not make an unsafe implementation safe. It is appropriate here because the method only reads and prints the values; it does not store values in or
expose the array. The annotation should only be used when the method implementation is safe in this way.

## Tests

`GenericMethodsTest` captures standard output and checks that mixed-type arguments are printed in order, including when their order changes. It also
checks calls with one argument and with no arguments. The shared `captureOutput()` helper runs each method call while standard output is
captured. Run the tests from the project root with:

```sh
mvn test
```

## Run

From the project root, compile the project and run the example:

```sh
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell2.exercici2.Main
```
