# Classes and Objects

Java is an object-oriented programming language.

Classes and objects are the basic building blocks of object-oriented programming in Java.

---

## 1. Class

A **class** is a blueprint or template used to create objects.

A class can contain:

- Variables
- Methods
- Constructors
- Blocks
- Nested classes
- Other members

Example:

```java
class Student {

    String name;
    int age;

    void study() {
        System.out.println("Student is studying");
    }
}
```

Here, `Student` is a class.

It defines what data and behavior a Student object can have.

### Simple Definition

**Class = Blueprint or template for creating objects.**

---

## 2. Object

An **object** is an instance of a class.

An object is created using the `new` keyword.

Example:

```java
Student s1 = new Student();
```

Here:

- `Student` → Class type
- `s1` → Reference variable
- `new` → Creates a new object
- `Student()` → Constructor call

### Simple Definition

**Object = Instance of a class.**

---

## 3. Creating an Object

General syntax:

```java
ClassName referenceVariable = new ClassName();
```

Example:

```java
Student student1 = new Student();
```

The `new` keyword creates an object in memory.

The reference variable stores the reference to that object.

---

## 4. Class and Object Relationship

```text
             Class
        Student Blueprint
              |
      +-------+-------+
      |       |       |
      v       v       v
   Object   Object   Object
    s1        s2       s3
```

One class can be used to create multiple objects.

Each object can have its own state.

---

## 5. Instance Variables

Variables declared inside a class but outside methods are called **instance variables** when they are associated with objects.

Example:

```java
class Student {

    String name;
    int age;
}
```

Here:

- `name` is an instance variable
- `age` is an instance variable

Each object gets its own copy of instance variables.

Example:

```java
Student s1 = new Student();
Student s2 = new Student();

s1.name = "Rahul";
s2.name = "Amit";
```

The two objects have different values for `name`.

---

## 6. Instance Methods

A method that operates on the state of an object is commonly called an **instance method**.

Example:

```java
class Student {

    String name;

    void displayName() {
        System.out.println(name);
    }
}
```

The method can be called using an object:

```java
Student s1 = new Student();

s1.name = "Rahul";

s1.displayName();
```

---

## 7. Multiple Objects

A single class can create multiple objects.

Example:

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
```

All three objects are created from the same class, but they are separate objects.

They can have different states.

```text
Student Class
     |
     +------> s1
     |         name = Rahul
     |
     +------> s2
     |         name = Amit
     |
     +------> s3
               name = Priya
```

---

## 8. Reference Variable

In:

```java
Student s1 = new Student();
```

`s1` is a **reference variable**.

It refers to the created `Student` object.

Conceptually:

```text
s1
 |
 v
Student Object
```

The variable does not contain the complete object itself.

It holds a reference to the object.

---

## 9. Object Reference

Two reference variables can refer to the same object.

Example:

```java
Student s1 = new Student();

Student s2 = s1;
```

Now both references point to the same object.

```text
s1 ─────┐
        |
        v
     Object
        ^
        |
s2 ─────┘
```

Changes made through one reference can be observed through the other reference.

---

## 10. Object State and Behavior

An object generally represents:

### State

The data stored by the object.

Example:

```text
name
age
marks
```

### Behavior

The actions that the object can perform.

Example:

```text
study()
display()
calculateMarks()
```

So an object can be viewed as:

```text
Object
  |
  +---- State
  |      |
  |      +-- name
  |      +-- age
  |
  +---- Behavior
         |
         +-- study()
         +-- display()
```

---

## 11. `new` Keyword

The `new` keyword is used to create objects.

Example:

```java
Student s1 = new Student();
```

The `new` keyword:

- Creates an object
- Allocates memory for the object
- Returns a reference to the newly created object

---

## 12. Class vs Object

| Class | Object |
|---|---|
| Blueprint/template | Instance of a class |
| Defines structure and behavior | Represents an actual entity |
| Does not represent a specific instance | Represents a specific instance |
| Used to create objects | Created from a class |
| Example: `Student` | Example: `s1` |

---

# Class and Object Diagram

```text
                  CLASS
                Student
                   |
          +--------+--------+
          |                 |
       Data              Behavior
          |                 |
       name              study()
       age               display()
          |
          v
     Creates Objects
          |
    +-----+-----+-----+
    |           |     |
    v           v     v
   s1          s2    s3
 Rahul         Amit  Priya
   20           21    19
```

---

# Key Takeaways

- A class is a blueprint or template for creating objects.
- An object is an instance of a class.
- Objects are commonly created using the `new` keyword.
- A reference variable refers to an object.
- Instance variables store object-specific state.
- Instance methods define behavior associated with an object.
- One class can create multiple objects.
- Different objects can have different states.
- Multiple reference variables can refer to the same object.
- The `new` keyword creates an object and returns its reference.
- Objects have state and behavior.
- Classes define what objects can contain and do.

## One-Line Revision

**Class → Blueprint | Object → Instance | `new` → Creates Object | Reference → Refers to Object**