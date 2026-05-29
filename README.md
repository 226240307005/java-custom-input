# Java Custom Input

A custom input utility package built in Java that simplifies
reading different data types from the user.

## About
This project provides a simple and clean way to take
user input in Java without repeating Scanner boilerplate code.
It works similarly to Python's `input()` function.

## Features
- Read `int`, `float`, `double`, `char`, `String`, `Word` easily
- Clean and reusable methods — just like Python's `input()`
- Beginner-friendly code
- No need to create Scanner objects repeatedly

## How to Use

```java
// Step 1: Import the package
import custominput.*;

// Step 2: Extend the class for the data type you want
public class Main extends CharInput {

    public static void main(String[] args) {
        // Step 3: Use input() method directly
        // Syntax: datatype varName = input("message");
        char chr = input("Enter a character: ");
        System.out.println("You entered: " + chr);
    }
}
```

## Technologies Used
- Java (Packages)
- Scanner Class

## Author
**Yash K Bhavsar**  
GitHub: [Click me](https://github.com/226240307005)
