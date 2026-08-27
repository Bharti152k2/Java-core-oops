# Constructors

A constructor is a special member of a class that is used to initialize an object.

A constructor is automatically called when an object is created using `new`.

Example:

```java
Student student = new Student();
```

When this statement executes:

```text
new Student()
     |
     v
Student Constructor
     |
     v
Object Initialized
```

---

# 1. Constructor Rules

A constructor:

- Has the same name as the class.
- Does not have a return type.
- Is automatically called when an object is created.
- Is mainly used to initialize object state.
- Can be overloaded.
- Can call another constructor using `this()`.
- Can call the parent constructor using `super()`.

Example:

```java
class Student {

    Student() {

        System.out.println("Constructor called");
    }
}
```

---

# 2. Constructor vs Method

A constructor and method are different.

| Constructor | Method |
|---|---|
| Same name as class | Can have any valid name |
| No return type | Has a return type or `void` |
| Initializes objects | Performs behavior/operations |
| Called automatically during object creation | Usually called explicitly |
| Cannot be inherited | Methods can be inherited |
| Can be overloaded | Can be overloaded |

---

# 3. Default Constructor

If no constructor is written in a class, Java provides a default constructor automatically.

Example:

```java
class Student {

}
```

Conceptually, the compiler provides:

```java
Student() {

}
```

Therefore:

```java
Student student = new Student();
```

works.

Important:

> The compiler provides a default constructor only when you do not declare any constructor yourself.

---

# 4. User-Defined No-Argument Constructor

A programmer can explicitly create a constructor with no parameters.

Example:

```java
class Student {

    Student() {

        System.out.println("Student created");
    }
}
```

This is a **no-argument constructor**.

It is different from the compiler-provided default constructor because this one is explicitly written by the programmer.

---

# 5. Parameterized Constructor

A constructor that accepts parameters is called a parameterized constructor.

Example:

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
```

Object creation:

```java
Student student = new Student("Bharti", 24);
```

The constructor initializes:

```text
name → Bharti
age  → 24
```

---

# 6. Constructor Overloading

A class can have multiple constructors with different parameter lists.

Example:

```java
class Student {

    Student() {

    }

    Student(String name) {

    }

    Student(String name, int age) {

    }
}
```

This is constructor overloading.

```text
Student()
Student(String)
Student(String, int)
```

Java selects the appropriate constructor based on the arguments passed during object creation.

---

# 7. Constructor Chaining

Constructor chaining means calling one constructor from another constructor.

There are two common forms:

```text
Constructor Chaining
        |
        +----------------+
        |                |
        v                v
     this()            super()
        |                |
        v                v
Same class          Parent class
```

---

# 8. `this()` Constructor Chaining

`this()` is used to call another constructor in the same class.

Example:

```java
class Student {

    Student() {

        this("Unknown");
    }

    Student(String name) {

        System.out.println(name);
    }
}
```

When:

```java
new Student();
```

is executed:

```text
Student()
   |
   v
this("Unknown")
   |
   v
Student(String)
```

---

# 9. Important Rule of `this()`

`this()` must be the **first statement** inside a constructor.

Valid:

```java
Student() {

    this("Unknown");
}
```

Invalid:

```java
Student() {

    System.out.println("Hello");

    this("Unknown"); // Error
}
```

---

# 10. `super()` Constructor Chaining

`super()` calls the constructor of the immediate parent class.

Example:

```java
class Parent {

    Parent() {

        System.out.println("Parent constructor");
    }
}

class Child extends Parent {

    Child() {

        super();

        System.out.println("Child constructor");
    }
}
```

When:

```java
new Child();
```

is executed:

```text
Child()
   |
   v
super()
   |
   v
Parent()
   |
   v
Child constructor continues
```

---

# 11. Implicit `super()`

If a child constructor does not explicitly call `super()` or `this()`, Java implicitly inserts:

```java
super();
```

Example:

```java
class Parent {

    Parent() {

        System.out.println("Parent");
    }
}

class Child extends Parent {

    Child() {

        System.out.println("Child");
    }
}
```

Conceptually:

```java
Child() {

    super();

    System.out.println("Child");
}
```

---

# 12. Constructor Execution Order

When a child object is created:

```java
Child child = new Child();
```

the parent constructor executes before the child constructor.

Example:

```text
new Child()
     |
     v
Parent constructor
     |
     v
Child constructor
```

For multiple levels:

```text
new C()
  |
  v
A constructor
  |
  v
B constructor
  |
  v
C constructor
```

---

# 13. `this` vs `super`

| `this` | `super` |
|---|---|
| Refers to current object/current class context | Refers to immediate parent class |
| `this.variable` | `super.variable` |
| `this.method()` | `super.method()` |
| `this()` calls another constructor in same class | `super()` calls parent constructor |

---

# 14. Copy Constructor

Java does not provide a special built-in copy constructor mechanism like some other languages.

However, we can create a constructor that accepts another object of the same class and copies its values.

Example:

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    Student(Student other) {

        this.name = other.name;
        this.age = other.age;
    }
}
```

Usage:

```java
Student student1 = new Student("Bharti", 24);

Student student2 = new Student(student1);
```

Now `student2` receives the values from `student1`.

This is commonly called a **copy constructor pattern** in Java.

---

# 15. Constructor Diagram

```text
                    Object Creation
                         |
                         v
                   new Student()
                         |
                         v
                    Constructor
                         |
              +----------+----------+
              |                     |
              v                     v
        Initialize State       Constructor
                              Chaining
                                   |
                          +--------+--------+
                          |                 |
                          v                 v
                       this()            super()
                          |                 |
                          v                 v
                     Same Class        Parent Class
```

---

# 16. Complete Constructor Flow

```text
                 new Child()
                     |
                     v
             Child constructor
                     |
             Is this() used?
                /         \
              Yes          No
               |            |
               v            v
       Same-class       Is super() used?
       constructor         /      \
                         Yes       No
                          |         |
                          v         v
                    Parent       implicit
                    constructor   super()
                          |
                          v
                    Child continues
```

---

# Key Takeaways

- A constructor initializes an object.
- A constructor has the same name as its class.
- A constructor has no return type.
- Constructors are called during object creation.
- If no constructor is declared, the compiler provides a default constructor.
- A programmer can explicitly create a no-argument constructor.
- Parameterized constructors accept values during object creation.
- Constructors can be overloaded.
- `this()` calls another constructor in the same class.
- `super()` calls the immediate parent constructor.
- `this()` must be the first statement in a constructor.
- `super()` must also be the first statement when explicitly used.
- If neither `this()` nor `super()` is written, Java implicitly calls `super()`.
- Parent constructors execute before child constructors.
- Constructors are not inherited.
- Java does not have a special built-in copy-constructor feature, but a copy-constructor pattern can be created manually.

## One-Line Revision

**Constructor → Initializes Object → Same Class Name + No Return Type → `this()` = Same Class | `super()` = Parent**