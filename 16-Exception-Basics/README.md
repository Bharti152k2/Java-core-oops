# Exception Handling

Exception handling is a mechanism used to handle abnormal situations that occur during program execution.

Without exception handling:

```text
Exception occurs
      ↓
Program terminates
```

With exception handling:

```text
Exception occurs
      ↓
Exception handled
      ↓
Program can continue
```

---

# 1. What is an Exception?

An exception is an abnormal event that occurs during program execution and can disrupt the normal flow of the program.

Example:

```java
int a = 10;
int b = 0;

int result = a / b;
```

This causes:

```text
ArithmeticException
```

because division by zero is not allowed.

---

# 2. Why Exception Handling?

Exception handling helps us:

- Prevent abnormal program termination.
- Handle runtime problems.
- Display meaningful error messages.
- Maintain the normal flow of the application.
- Separate error-handling logic from normal program logic.

---

# 3. Exception Hierarchy

Java exceptions are part of the `Throwable` hierarchy.

```text
                    Throwable
                       |
             +---------+---------+
             |                   |
             v                   v
           Error              Exception
             |                   |
             |          +--------+---------+
             |          |                  |
             |          v                  v
             |     Checked           RuntimeException
             |     Exceptions              |
             |                         Unchecked
             |                         Exceptions
             |
          Serious problems
```

---

# 4. Error

`Error` represents serious problems that applications generally should not try to handle.

Examples:

```text
OutOfMemoryError
StackOverflowError
```

Example:

```java
void recursiveMethod() {

    recursiveMethod();
}
```

Excessive recursion can eventually cause:

```text
StackOverflowError
```

Errors are generally not considered normal application-level exceptions to recover from.

---

# 5. Exception

`Exception` represents conditions that an application may be able to handle.

Examples:

```text
IOException
SQLException
FileNotFoundException
```

Exceptions can be handled using:

```text
try
catch
finally
```

---

# 6. Checked Exceptions

Checked exceptions are exceptions checked by the compiler.

They generally extend `Exception` but are not subclasses of `RuntimeException`.

Examples:

```text
IOException
SQLException
FileNotFoundException
```

A checked exception must generally be:

```text
Handled
   OR
Declared using throws
```

Example:

```java
void readFile() throws IOException {

}
```

---

# 7. Unchecked Exceptions

Unchecked exceptions are not checked by the compiler in the same way as checked exceptions.

They are subclasses of:

```text
RuntimeException
```

Examples:

```text
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
NumberFormatException
```

Example:

```java
int result = 10 / 0;
```

This produces:

```text
ArithmeticException
```

---

# 8. Checked vs Unchecked

```text
Exception
    |
    +--------------------------+
    |                          |
    v                          v
Checked                   RuntimeException
Exceptions                     |
    |                          |
    v                          v
Compiler checks            Unchecked
handling/declaration       exceptions
```

Examples:

```text
Checked:
IOException
SQLException
FileNotFoundException

Unchecked:
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
```

---

# 9. try-catch

The `try` block contains code that may cause an exception.

The `catch` block handles the exception.

Example:

```java
try {

    int result = 10 / 0;

} catch (ArithmeticException e) {

    System.out.println("Cannot divide by zero");
}
```

Flow:

```text
try
 ↓
Exception occurs
 ↓
Matching catch
 ↓
Exception handled
```

---

# 10. Multiple catch Blocks

Multiple exceptions can be handled using multiple `catch` blocks.

Example:

```java
try {

    // risky code

} catch (ArithmeticException e) {

    // handle arithmetic exception

} catch (NullPointerException e) {

    // handle null pointer exception
}
```

Java checks the catch blocks in order.

Therefore, a more specific exception should generally come before a broader one.

---

# 11. finally

The `finally` block is used for code that should generally execute after the `try`/`catch` processing.

Example:

```java
try {

    System.out.println("Try");

} catch (Exception e) {

    System.out.println("Catch");

} finally {

    System.out.println("Finally");
}
```

Typical flow:

```text
try
 ↓
catch (if exception)
 ↓
finally
```

`finally` is commonly used for cleanup operations.

---

# 12. throw

`throw` is used to explicitly throw an exception.

Example:

```java
throw new ArithmeticException("Invalid operation");
```

Example:

```java
if (age < 18) {

    throw new IllegalArgumentException("Age must be 18 or above");
}
```

Think:

```text
throw
  ↓
Actually throws an exception
```

---

# 13. throws

`throws` is used in a method declaration to indicate that the method may pass an exception to its caller.

Example:

```java
void readFile() throws IOException {

}
```

Think:

```text
throws
   ↓
Declares that a method may throw an exception
```

---

# 14. throw vs throws

| `throw` | `throws` |
|---|---|
| Used inside method/block | Used in method declaration |
| Actually throws an exception | Declares possible exceptions |
| Throws one exception object at a time | Can declare multiple exception types |
| `throw new Exception()` | `method() throws Exception` |

Example:

```java
throw new IOException();
```

vs

```java
void read() throws IOException {

}
```

---

# 15. Custom Exception

Java allows us to create our own exception classes.

Example:

```java
class AgeException extends Exception {

    AgeException(String message) {

        super(message);
    }
}
```

Then:

```java
throw new AgeException("Invalid age");
```

Custom exceptions are useful when application-specific conditions need meaningful exception types.

---

# 16. BufferedReader

`BufferedReader` is a class used to read text efficiently from a character input stream.

It belongs to:

```java
java.io
```

Example:

```java
BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

String name = br.readLine();
```

`readLine()` reads one complete line as a `String`.

---

# 17. BufferedReader Flow

```text
Keyboard
   |
   v
System.in
   |
   v
InputStreamReader
   |
   v
BufferedReader
   |
   v
readLine()
   |
   v
String
```

---

# 18. Why BufferedReader Can Involve Exceptions

Reading input using `BufferedReader` can involve `IOException`.

Therefore, the code may need:

```java
try-catch
```

or:

```java
throws IOException
```

Example:

```java
public static void main(String[] args) throws IOException {

    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

    String name = br.readLine();

    System.out.println(name);
}
```

---

# 19. Exception Handling Flow

```text
                 Program
                    |
                    v
              Risky Operation
                    |
              +-----+-----+
              |           |
           No Error     Error
              |           |
              v           v
          Continue      catch
                          |
                          v
                    Handle Exception
                          |
                          v
                       finally
                          |
                          v
                       Continue
```

---

# 20. Important Keywords

Java exception handling mainly uses:

```text
try
catch
finally
throw
throws
```

Remember:

```text
try     → risky code
catch   → handles exception
finally → cleanup/final processing
throw   → explicitly throws exception
throws  → declares possible exception
```

---

# Key Takeaways

- Exception handling manages abnormal situations during program execution.
- `Throwable` is the root class for Java's error/exception hierarchy.
- `Error` represents serious problems generally outside normal application recovery.
- `Exception` represents conditions that applications can often handle.
- Checked exceptions are checked by the compiler.
- Unchecked exceptions are subclasses of `RuntimeException`.
- `try` contains code that may cause an exception.
- `catch` handles an exception.
- Multiple `catch` blocks can handle different exception types.
- `finally` is used for cleanup/final processing.
- `throw` explicitly throws an exception.
- `throws` declares exceptions that a method may pass to its caller.
- Custom exceptions can be created by extending `Exception` or another suitable exception class.
- `BufferedReader` is used to read character data efficiently.
- `BufferedReader.readLine()` returns input as a `String`.
- `BufferedReader` operations can involve `IOException`.
- Exception handling helps prevent unexpected termination and keeps error-handling logic organized.

## One-Line Revision

**try → Risky Code | catch → Handle | finally → Cleanup | throw → Throw Now | throws → Declare | Checked → Compiler Checked | Unchecked → RuntimeException**