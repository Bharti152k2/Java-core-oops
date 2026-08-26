# 05 - Methods

## 📌 Overview

A method is a block of code that performs a specific task.

Methods help us:
- Reuse code
- Divide a program into smaller parts
- Improve readability
- Avoid writing the same code repeatedly

In Java, methods are defined inside a class.

---

## 1. Basic Method

A simple method can be created and called from another method.

### Syntax

```java
returnType methodName() {
    // code
}
```

Example:

```java
public class MethodBasics {

    public static void main(String[] args) {

        greet();
    }

    static void greet() {
        System.out.println("Hello Java");
    }
}
```

Here:

- `static` → method belongs to the class
- `void` → method does not return a value
- `greet` → method name
- `()` → no parameters

---

## 2. Method with Parameters

A method can receive values through parameters.

```java
public class MethodWithParameters {

    public static void main(String[] args) {

        add(10, 20);
    }

    static void add(int a, int b) {

        int sum = a + b;

        System.out.println(sum);
    }
}
```

Here:

- `a` and `b` are parameters
- `10` and `20` are arguments
- Values are passed when the method is called

### Parameter vs Argument

```text
Parameter → variable defined in method declaration

Argument → actual value passed during method call
```

Example:

```java
static void add(int a, int b)
```

`a` and `b` → parameters

```java
add(10, 20);
```

`10` and `20` → arguments

---

## 3. Method with Return Value

A method does not always need to print the result.

It can return a value.

```java
public class MethodWithReturn {

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);
    }

    static int add(int a, int b) {

        return a + b;
    }
}
```

Here:

```java
static int add(int a, int b)
```

`int` means the method returns an integer.

```java
return a + b;
```

returns the calculated value.

---

## 4. `void` vs Return Type

### `void`

Used when the method does not return a value.

```java
static void greet() {

    System.out.println("Hello");
}
```

### Return type

Used when the method returns a value.

```java
static int square(int n) {

    return n * n;
}
```

---

## 5. Static Method

A static method belongs to the class rather than an object.

It can be called directly using the class context.

```java
public class StaticVsInstanceMethod {

    public static void main(String[] args) {

        showMessage();
    }

    static void showMessage() {

        System.out.println("Static method");
    }
}
```

Because `main()` is static, it can directly call another static method.

---

## 6. Instance Method

An instance method belongs to an object.

An object must be created to call it.

```java
public class StaticVsInstanceMethod {

    public static void main(String[] args) {

        StaticVsInstanceMethod obj =
                new StaticVsInstanceMethod();

        obj.showMessage();
    }

    void showMessage() {

        System.out.println("Instance method");
    }
}
```

### Important difference

```text
Static method
    ↓
Belongs to class
    ↓
Can be called without creating an object

Instance method
    ↓
Belongs to object
    ↓
Requires an object to call it
```

---

## 7. Method Overloading

Method overloading means having multiple methods with the same name but different parameter lists.

Example:

```java
public class MethodOverloading {

    static int add(int a, int b) {

        return a + b;
    }

    static int add(int a, int b, int c) {

        return a + b + c;
    }

    static double add(double a, double b) {

        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));

        System.out.println(add(10, 20, 30));

        System.out.println(add(10.5, 20.5));
    }
}
```

The method name is the same:

```text
add()
```

But the parameter lists are different.

---

## 8. How Java Decides Which Overloaded Method to Call

Java looks at the arguments passed to the method.

```java
add(10, 20);
```

calls:

```java
add(int, int)
```

while:

```java
add(10, 20, 30);
```

calls:

```java
add(int, int, int)
```

And:

```java
add(10.5, 20.5);
```

calls:

```java
add(double, double)
```

---

## 9. Important Rules of Method Overloading

Methods can be overloaded by changing:

- Number of parameters
- Data type of parameters
- Order of different parameter types

Example:

```java
add(int, int)
add(int, int, int)
add(double, double)
add(int, double)
```

### Return type alone is NOT enough

This is invalid:

```java
int add(int a, int b) {
    return a + b;
}

double add(int a, int b) {
    return a + b;
}
```

The parameter list is identical, so Java cannot overload methods only by return type.

---

# 🎯 What I Learned

- A method is a reusable block of code.
- Methods are defined inside classes.
- Methods can accept parameters.
- Methods can return values.
- `void` means no value is returned.
- Parameters and arguments are different.
- Static methods belong to the class.
- Instance methods belong to objects.
- Instance methods require an object for normal invocation.
- Method overloading allows methods to have the same name with different parameter lists.
- Return type alone cannot be used for method overloading.

---

# 🧠 Quick Revision Questions

Before moving to the next topic, I should be able to answer:

1. What is a method?
2. Why do we use methods?
3. What is the difference between a parameter and an argument?
4. What does `void` mean?
5. What is a return type?
6. What is the difference between `return` and `System.out.println()`?
7. What is a static method?
8. What is an instance method?
9. Why is `main()` static?
10. What is method overloading?
11. How can methods be overloaded?
12. Can methods be overloaded only by changing the return type?


