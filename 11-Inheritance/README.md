# Inheritance

Inheritance is one of the four pillars of Object-Oriented Programming.

The four pillars are:

```text
Encapsulation
Abstraction
Inheritance
Polymorphism
```

Inheritance allows one class to acquire properties and behavior from another class.

It promotes:

- Code reusability
- Method reuse
- Hierarchical relationships
- Extensibility

---

# 1. Basic Terminology

Consider:

```java
class Animal {
}

class Dog extends Animal {
}
```

Here:

```text
Animal → Parent / Superclass / Base class

Dog → Child / Subclass / Derived class
```

The keyword used for class inheritance is:

```java
extends
```

---

# 2. Basic Inheritance

```text
        Parent
          |
          v
        Child
```

Example:

```java
class Animal {

    void eat() {

        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() {

        System.out.println("Dog barks");
    }
}
```

The `Dog` class can use the inherited `eat()` method.

```java
Dog dog = new Dog();

dog.eat();
dog.bark();
```

---

# 3. Single Inheritance

One child class inherits from one parent class.

```text
    Animal
       |
       v
      Dog
```

Example:

```java
class Animal {
}

class Dog extends Animal {
}
```

This is called **single inheritance**.

---

# 4. Multilevel Inheritance

Inheritance occurs across multiple levels.

```text
       Animal
          |
          v
        Mammal
          |
          v
          Dog
```

Example:

```java
class Animal {
}

class Mammal extends Animal {
}

class Dog extends Mammal {
}
```

`Dog` indirectly inherits from `Animal` through `Mammal`.

---

# 5. Hierarchical Inheritance

Multiple child classes inherit from the same parent.

```text
            Animal
           /      \
          v        v
        Dog       Cat
```

Example:

```java
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
```

Both `Dog` and `Cat` inherit from `Animal`.

---

# 6. Multiple Inheritance

Multiple inheritance means a class directly inherits from more than one parent class.

For example:

```text
       A       B
        \     /
         \   /
           C
```

Java does **not** support multiple inheritance of classes.

This is not allowed:

```java
class C extends A, B {
}
```

---

# 7. Why Java Does Not Support Multiple Class Inheritance

One major problem is ambiguity.

Suppose:

```java
class A {

    void show() {

        System.out.println("A");
    }
}

class B {

    void show() {

        System.out.println("B");
    }
}
```

If a class could inherit from both:

```text
A       B
 \     /
   C
```

then:

```java
C object = new C();

object.show();
```

Which `show()` should execute?

```text
A.show()
or
B.show()
```

This is an example of the **diamond problem / ambiguity**.

Java avoids this for classes by allowing a class to extend only one class.

---

# 8. Multiple Inheritance Through Interfaces

Java can achieve multiple inheritance of type through interfaces.

Example:

```java
interface A {

    void showA();
}

interface B {

    void showB();
}

class C implements A, B {

    public void showA() {

        System.out.println("A");
    }

    public void showB() {

        System.out.println("B");
    }
}
```

A class can implement multiple interfaces:

```java
class C implements A, B
```

Therefore:

```text
        A          B
         \        /
          \      /
            C
```

---

# 9. Method Inheritance

A subclass can use accessible methods inherited from its parent.

Example:

```java
class Parent {

    void show() {

        System.out.println("Parent method");
    }
}

class Child extends Parent {
}
```

Now:

```java
Child child = new Child();

child.show();
```

The method is inherited from `Parent`.

---

# 10. Constructor and Inheritance

Constructors are **not inherited** by subclasses.

However, when a child object is created, the parent constructor executes first.

Example:

```java
class Parent {

    Parent() {

        System.out.println("Parent constructor");
    }
}

class Child extends Parent {

    Child() {

        System.out.println("Child constructor");
    }
}
```

Creating:

```java
Child child = new Child();
```

produces:

```text
Parent constructor
Child constructor
```

This happens because the child constructor implicitly calls:

```java
super();
```

when no explicit constructor invocation is written.

---

# 11. `super` Keyword

`super` refers to the immediate parent class.

It can be used to:

- Access parent variables
- Call parent methods
- Call parent constructors

Example:

```java
class Parent {

    int number = 10;
}

class Child extends Parent {

    int number = 20;

    void show() {

        System.out.println(super.number);
    }
}
```

Output:

```text
10
```

---

# 12. What Is Not Inherited?

Constructors are not inherited.

Private members are not directly accessible in the subclass.

Example:

```java
class Parent {

    private int value = 10;
}

class Child extends Parent {

    void show() {

        // System.out.println(value); // Not allowed
    }
}
```

The private member belongs to the parent class and cannot be directly accessed by the child.

The parent can expose controlled access through methods.

---

# 13. Access and Inheritance

Access to inherited members depends on their access modifier.

```text
              Same Class
                   |
                   v
               private
                   |
                   X
             Child classes
```

In general:

| Modifier | Same Class | Same Package | Subclass Other Package | Other Classes |
|---|---|---|---|---|
| `private` | Yes | No | No | No |
| default | Yes | Yes | No* | No |
| `protected` | Yes | Yes | Yes, through inheritance | No |
| `public` | Yes | Yes | Yes | Yes |

`default` means package-private.

---

# 14. IS-A Relationship

Inheritance represents an **IS-A** relationship.

Example:

```text
Dog IS-A Animal
Car IS-A Vehicle
Manager IS-A Employee
```

Therefore:

```java
class Dog extends Animal
```

means:

```text
Dog IS-A Animal
```

---

# 15. HAS-A vs IS-A

Inheritance represents:

```text
IS-A
```

Composition/association commonly represents:

```text
HAS-A
```

Example:

```text
Dog IS-A Animal

Car HAS-A Engine
```

So:

```java
class Dog extends Animal {
}
```

is inheritance.

Whereas:

```java
class Car {

    Engine engine;
}
```

represents a HAS-A relationship.

---

# 16. Inheritance Diagram

```text
                       Inheritance
                            |
             +--------------+--------------+
             |              |              |
             v              v              v
          Single        Multilevel     Hierarchical
             |              |              |
             v              v              v
          A → B         A → B → C       A → B
                                         A → C

                            |
                            v
                    Multiple Class
                    Inheritance
                         ❌
                            |
                            v
                     Multiple Interfaces
                         ✅
```

---

# 17. Inheritance and Code Reusability

One of the major benefits of inheritance is code reuse.

Without inheritance:

```text
Dog → eat()
Cat → eat()
Cow → eat()
```

The same code may be repeated.

With inheritance:

```text
             Animal
            /  |  \
           /   |   \
         Dog  Cat  Cow
            |
            v
          eat()
```

The common behavior can be placed in the parent.

---

# 18. Important Rules

### Rule 1

Use `extends` for class inheritance.

### Rule 2

A Java class can directly extend only one class.

### Rule 3

Java does not support multiple inheritance of classes.

### Rule 4

A class can implement multiple interfaces.

### Rule 5

Constructors are not inherited.

### Rule 6

Parent constructors execute before child constructors.

### Rule 7

Private members cannot be directly accessed by subclasses.

### Rule 8

Inheritance represents an IS-A relationship.

### Rule 9

Inheritance supports code reuse.

---

# Key Takeaways

- Inheritance is one of the four pillars of OOP.
- It allows a subclass to acquire accessible members from a superclass.
- `extends` is used for class inheritance.
- Parent class is also called superclass/base class.
- Child class is also called subclass/derived class.
- Single inheritance has one parent and one child.
- Multilevel inheritance has multiple levels.
- Hierarchical inheritance has multiple children sharing one parent.
- Java does not support multiple inheritance of classes.
- Java supports multiple interface implementation.
- The diamond problem is one reason multiple class inheritance is avoided.
- Constructors are not inherited.
- Parent constructors execute before child constructors.
- `super` refers to the immediate parent class.
- Private members cannot be directly accessed by subclasses.
- Inheritance represents an IS-A relationship.
- Inheritance promotes code reuse.

## One-Line Revision

**Inheritance → Child acquires accessible Parent behavior → `extends` → Code Reuse → IS-A Relationship**