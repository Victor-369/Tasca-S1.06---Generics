# Java Generics Exercises

This project contains four Java exercises on generic methods and type-safe parameter handling. The examples progress from a class without generics to
methods with independently typed parameters, a fixed `String` parameter, and generic varargs.

## Exercises

| Level | Exercise | Example |
| --- | --- | --- |
| 1 | Store three values in a non-generic class | `NoGenericMethods` |
| 1 | Print three values using independent generic types | `GenericMethods.printElements()` |
| 2 | Combine generic parameters with a fixed `String` parameter | `GenericMethods.printElements()` |
| 2 | Print a variable number of values with generic varargs | `GenericMethods.printAll()` |

Each exercise has its own `Main` class and a corresponding test class under `src/test/java`. The exercise-specific README files describe their
requirements, implementation, tests and run commands.

## Requirements

- Java 25
- Maven

## Test

Run all tests from the project root:

```sh
mvn test
```
