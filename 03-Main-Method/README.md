# Main Method

The `main()` method is the entry point of a Java application.

When a Java application is executed, the JVM looks for the `main()` method to start program execution.

The standard main method is:

```java
public static void main(String[] args)
```

---

## 1. Breaking Down the Main Method

```java
public static void main(String[] args)
```

Each part has a specific meaning.

### `public`

`public` is an access modifier.

It allows the JVM to access the `main()` method from outside the class.

### `static`

`static` means the method belongs to the class rather than to an object.

The JVM can call the `main()` method without creating an object of the class.

### `void`

`void` means the method does not return a value.

### `main`

`main` is the special method name recognized by the JVM as the entry point of the application.

### `String[]`

`String[]` represents an array of String objects.

It is used to receive command-line arguments.

### `args`

`args` is simply the name of the parameter.

The name can technically be changed:

```java
public static void main(String[] arguments)
```

The important part is the type:

```java
String[]
```

---

## 2. How Program Execution Starts

Consider:

```java
public class MainMethod {

    public static void main(String[] args) {

        System.out.println("Program started");
        System.out.println("Program is executing");
    }
}
```

The basic flow is:

```text
Run Java Application
        |
        v
       JVM
        |
        v
Find main() method
        |
        v
Execute main()
        |
        v
Program execution
```

---

## 3. Why is `main()` Static?

The JVM needs to start the program before any object has been created.

Because `main()` is static, the JVM can invoke it using the class itself.

Conceptually:

```text
Class
  |
  v
static main()
  |
  v
Program starts
```

No object is required to call the static `main()` method.

---

## 4. Why is `main()` Public?

The JVM needs to access the `main()` method from outside the class.

Therefore, the standard entry point is declared as:

```java
public
```

---

## 5. Why is `main()` Void?

The JVM does not expect the `main()` method to return a value.

Therefore:

```java
void
```

is used.

---

## 6. Why `String[] args`?

`String[] args` allows the program to receive command-line arguments.

Example:

```java
public static void main(String[] args)
```

If arguments are provided while running the program, they are stored in the `args` array.

Example:

```text
java MainMethod Hello Java
```

The arguments are conceptually:

```text
args[0] = "Hello"
args[1] = "Java"
```

---

## 7. `args` is Just a Parameter Name

The name `args` is not mandatory.

This is also valid:

```java
public static void main(String[] arguments)
```

The following are also valid parameter names:

```java
public static void main(String[] values)
```

```java
public static void main(String[] data)
```

The important part is:

```java
String[]
```

The JVM recognizes the method based on the required main-method signature.

---

## 8. Static Methods

A static method belongs to the class rather than to an individual object.

Example:

```java
public class StaticMethod {

    static void display() {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {

        display();
    }
}
```

Since `display()` is static, it can be called directly from another static method in the same class.

---

## 9. Calling a Non-Static Method

A non-static method belongs to an object.

Therefore, an object is required to call it.

Example:

```java
public class MethodCall {

    void display() {
        System.out.println("Non-static method called");
    }

    public static void main(String[] args) {

        MethodCall obj = new MethodCall();

        obj.display();
    }
}
```

The flow is:

```text
main()
  |
  v
Create Object
  |
  v
obj
  |
  v
obj.display()
  |
  v
Non-static method executes
```

---

## 10. Static vs Non-Static Method

| Static Method | Non-Static Method |
|---|---|
| Belongs to the class | Belongs to an object |
| Does not require an object to call it | Requires an object to call it |
| Can be called using the class name | Usually called using an object |
| `main()` is static | Regular methods are generally non-static unless declared `static` |

Example:

```java
ClassName.staticMethod();
```

For a non-static method:

```java
ClassName obj = new ClassName();
obj.nonStaticMethod();
```

---

# Main Method Execution Diagram

```text
                 Java Program
                      |
                      v
                     JVM
                      |
                      v
              Finds main() method
                      |
                      v
        public static void main(String[] args)
                      |
          +-----------+-----------+
          |                       |
          v                       v
      Static                 String[] args
     method                  Command-line
   can be called              arguments
   without object
          |
          v
    Program starts
```

---

# Key Takeaways

- `main()` is the entry point of a Java application.
- The standard signature is:

```java
public static void main(String[] args)
```

- `public` allows the JVM to access the method.
- `static` allows the JVM to call the method without creating an object.
- `void` means the method does not return a value.
- `main` is the method name recognized as the application entry point.
- `String[]` represents an array of Strings.
- `args` is the parameter name used to store command-line arguments.
- The name `args` can be changed.
- Static methods belong to the class.
- Non-static methods belong to objects and normally require an object to be called.

## One-Line Revision

`public` → Access | `static` → Class-level | `void` → No return value | `main` → Entry point | `String[] args` → Command-line arguments