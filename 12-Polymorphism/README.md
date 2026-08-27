# Polymorphism

Polymorphism is one of the four pillars of Object-Oriented Programming.

The four pillars are:

```text
Encapsulation
Abstraction
Inheritance
Polymorphism
```

The word polymorphism means:

```text
Poly → Many
Morph → Forms
```

Therefore:

```text
Polymorphism → One thing, many forms
```

In Java, polymorphism allows the same method name or reference to behave differently depending on the situation.

---

# 1. Types of Polymorphism

Java polymorphism is mainly divided into:

```text
                 Polymorphism
                       |
            +----------+----------+
            |                     |
            v                     v
      Compile-Time             Runtime
      Polymorphism           Polymorphism
            |                     |
            v                     v
     Method Overloading      Method Overriding
```

---

# 2. Compile-Time Polymorphism

Compile-time polymorphism is commonly achieved using:

```text
Method Overloading
```

The compiler decides which overloaded method should be called based on the method arguments.

Example:

```java
void add(int a, int b) {
    System.out.println(a + b);
}

void add(int a, int b, int c) {
    System.out.println(a + b + c);
}
```

The method name is the same:

```text
add
```

But the parameter lists are different.

---

# 3. Method Overloading

Method overloading means defining multiple methods with:

```text
Same Method Name
        +
Different Parameter List
```

The parameters can differ by:

- Number of parameters
- Type of parameters
- Order of parameters

Example:

```java
void display(int number) {
    System.out.println(number);
}

void display(String name) {
    System.out.println(name);
}
```

Both methods are named:

```text
display
```

But Java can differentiate them because their parameter lists are different.

---

# 4. Overloading Cannot Differ Only by Return Type

This is invalid:

```java
int show() {
    return 10;
}

double show() {
    return 10.5;
}
```

Java cannot overload methods using only different return types.

The parameter list must be different.

---

# 5. Runtime Polymorphism

Runtime polymorphism is commonly achieved using:

```text
Method Overriding
```

The actual method that executes is determined at runtime based on the actual object.

Example:

```java
Animal animal = new Dog();

animal.sound();
```

The reference type is:

```text
Animal
```

The actual object is:

```text
Dog
```

Therefore, if `Dog` overrides `sound()`, the `Dog` version executes.

---

# 6. Method Overriding

Method overriding happens when a child class provides its own implementation of an inherited method.

Example:

```java
class Animal {

    void sound() {

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}
```

The child method overrides the parent method.

---

# 7. `@Override`

`@Override` is an annotation used to indicate that a method is intended to override a method from a superclass or implement a method from an interface.

Example:

```java
@Override
void sound() {

    System.out.println("Dog barks");
}
```

It helps the compiler detect mistakes.

For example, if you accidentally write a method that does not correctly match the parent method, the compiler can report an error.

---

# 8. Dynamic Method Dispatch

Dynamic Method Dispatch is the mechanism through which Java selects an overridden instance method at runtime.

Example:

```java
Animal animal;

animal = new Dog();

animal.sound();
```

Java checks the actual object:

```text
Actual Object → Dog
```

Therefore:

```text
Dog.sound()
```

executes.

Later:

```java
animal = new Cat();

animal.sound();
```

Now:

```text
Actual Object → Cat
```

Therefore:

```text
Cat.sound()
```

executes.

The same reference can produce different behavior depending on the actual object.

---

# 9. Parent Reference and Child Object

This is a very important concept:

```java
Parent reference = new Child();
```

Example:

```java
Animal animal = new Dog();
```

Diagram:

```text
Reference Type          Actual Object
     Animal      ───→       Dog
```

The reference type determines what members are accessible at compile time.

For overridden instance methods, the actual object's implementation determines which method executes at runtime.

---

# 10. Example of Runtime Polymorphism

```text
                Animal
                   |
          +--------+--------+
          |                 |
          v                 v
         Dog               Cat
          |                 |
       sound()           sound()
          |                 |
          +--------+--------+
                   |
                   v
          Animal Reference
                   |
             Runtime Decision
                   |
          Dog / Cat Method
```

Code:

```java
Animal animal;

animal = new Dog();
animal.sound();

animal = new Cat();
animal.sound();
```

Output:

```text
Dog barks
Cat meows
```

---

# 11. Method Overloading vs Method Overriding

| Method Overloading | Method Overriding |
|---|---|
| Same class commonly used | Parent-child relationship required |
| Same method name | Same method signature |
| Different parameters | Matching inherited method |
| Compile-time polymorphism | Runtime polymorphism |
| Inheritance not required | Inheritance required |
| Method selection happens at compile time | Overridden instance method selection happens at runtime |

---

# 12. Rules of Method Overloading

### Rule 1

Method name can be the same.

### Rule 2

Parameter lists must be different.

### Rule 3

Parameters can differ by number, type, or order.

### Rule 4

Changing only the return type is not enough.

---

# 13. Rules of Method Overriding

### Rule 1

There must be an inherited method available to override.

### Rule 2

The overriding method must have a compatible signature.

### Rule 3

The child provides its own implementation.

### Rule 4

Use `@Override` to help detect mistakes.

### Rule 5

Overridden instance methods participate in runtime polymorphism.

---

# 14. Important Note About `static` Methods

`static` methods are not overridden in the same way as instance methods.

They are hidden, not dynamically dispatched.

Example:

```java
class Parent {

    static void show() {

        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void show() {

        System.out.println("Child");
    }
}
```

The selected static method depends on the reference type, not runtime dynamic dispatch.

---

# 15. Important Note About `private` Methods

Private methods are not inherited by subclasses.

Therefore, they cannot be overridden in the normal sense.

---

# 16. Polymorphism Diagram

```text
                    Polymorphism
                          |
              +-----------+-----------+
              |                       |
              v                       v
         Compile-Time              Runtime
              |                       |
              v                       v
         Overloading              Overriding
              |                       |
              v                       v
       Compiler decides      Actual object decides
```

---

# Key Takeaways

- Polymorphism means one thing can take many forms.
- Java mainly demonstrates polymorphism through overloading and overriding.
- Method overloading is compile-time polymorphism.
- Method overriding is runtime polymorphism.
- Overloading uses the same method name with different parameters.
- Return type alone cannot overload a method.
- Overriding happens when a child provides its own implementation of an inherited method.
- `@Override` helps detect overriding mistakes.
- Runtime polymorphism uses parent references pointing to child objects.
- The actual object determines which overridden instance method executes.
- Dynamic Method Dispatch happens at runtime.
- Static methods are hidden rather than dynamically overridden.
- Private methods cannot be overridden because they are not inherited.

## One-Line Revision

**Polymorphism → Many Forms | Overloading → Compile Time | Overriding → Runtime | Actual Object Decides Overridden Method**