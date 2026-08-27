# this and super

`this` and `super` are special keywords used in Java to refer to the current object and the immediate parent class respectively.

```text
                    this vs super
                         |
              +----------+----------+
              |                     |
              v                     v
            this                   super
              |                     |
              v                     v
       Current object         Immediate parent
       / current class        class
```

---

# 1. `this` Keyword

`this` refers to the **current object**.

Example:

```java
class Student {

    String name;

    void setName(String name) {

        this.name = name;
    }
}
```

Here:

```text
this.name
    ↓
Instance variable

name
    ↓
Method parameter
```

`this` helps distinguish between the instance variable and the local variable/parameter when they have the same name.

---

# 2. `this` to Access Instance Variables

Example:

```java
class Student {

    String name;

    void display() {

        System.out.println(this.name);
    }
}
```

Here:

```java
this.name
```

refers to the `name` belonging to the current object.

---

# 3. `this` to Call Current Class Method

`this` can also be used to explicitly call a method of the current object.

Example:

```java
class Student {

    void show() {

        System.out.println("Show");
    }

    void display() {

        this.show();
    }
}
```

The following are effectively calling the same current object's method:

```java
show();
```

and:

```java
this.show();
```

---

# 4. `this()` Constructor Chaining

`this()` is used to call another constructor in the **same class**.

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

Flow:

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

# 5. Important Rule of `this()`

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

    this("Unknown");
}
```

---

# 6. `super` Keyword

`super` refers to the **immediate parent class**.

Example:

```java
class Parent {

    int number = 10;
}

class Child extends Parent {

    int number = 20;

    void display() {

        System.out.println(super.number);
    }
}
```

Here:

```text
number
   ↓
Child's variable

super.number
   ↓
Parent's variable
```

---

# 7. `super` to Access Parent Variable

If both parent and child have variables with the same name:

```java
class Parent {

    int value = 10;
}

class Child extends Parent {

    int value = 20;

    void show() {

        System.out.println(value);
        System.out.println(super.value);
    }
}
```

Output:

```text
20
10
```

Therefore:

```text
value       → Child variable
super.value → Parent variable
```

---

# 8. `super` to Call Parent Method

`super` can be used to call the parent class method.

Example:

```java
class Parent {

    void show() {

        System.out.println("Parent show");
    }
}

class Child extends Parent {

    @Override
    void show() {

        System.out.println("Child show");

        super.show();
    }
}
```

Output:

```text
Child show
Parent show
```

Here:

```java
super.show();
```

explicitly calls the parent implementation.

---

# 9. `super()` Constructor Call

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

Execution:

```text
new Child()
     |
     v
super()
     |
     v
Parent constructor
     |
     v
Child constructor
```

---

# 10. Implicit `super()`

If a child constructor does not explicitly use `this()` or `super()`, Java implicitly inserts:

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

# 11. `this` vs `super`

| `this` | `super` |
|---|---|
| Refers to current object/current class context | Refers to immediate parent class |
| `this.variable` | `super.variable` |
| `this.method()` | `super.method()` |
| `this()` calls another constructor in same class | `super()` calls parent constructor |

---

# 12. Constructor Chaining

Both keywords can participate in constructor chaining.

```text
                  Constructor
                     |
            +--------+--------+
            |                 |
            v                 v
          this()            super()
            |                 |
            v                 v
       Same class        Parent class
```

Example:

```java
class Parent {

    Parent(int x) {

        System.out.println(x);
    }
}

class Child extends Parent {

    Child() {

        super(10);
    }
}
```

Here:

```text
Child()
   |
   v
super(10)
   |
   v
Parent(int)
```

---

# 13. Important Restrictions

`this()` and `super()` are constructor calls.

They must appear as the **first statement** in a constructor.

Therefore, this is invalid:

```java
Child() {

    System.out.println("Hello");

    super();
}
```

Also, a constructor cannot use both:

```java
this();
super();
```

because both would have to be the first statement.

---

# 14. `this` Diagram

```text
             Current Object
                   |
                   v
                 this
                   |
       +-----------+-----------+
       |           |           |
       v           v           v
    Variable     Method     Constructor
    this.x       this.m()    this()
```

---

# 15. `super` Diagram

```text
            Child Object
                 |
                 v
               super
                 |
                 v
          Immediate Parent
                 |
       +---------+---------+
       |                   |
       v                   v
    Variable             Method
    super.x              super.m()
                           |
                           v
                     Parent Method
```

---

# 16. Main Difference

Remember this simple rule:

```text
this
 ↓
CURRENT

super
 ↓
PARENT
```

And for constructors:

```text
this()
 ↓
Same Class Constructor

super()
 ↓
Parent Constructor
```

---

# Key Takeaways

- `this` refers to the current object/current class context.
- `super` refers to the immediate parent class.
- `this.variable` accesses the current object's field.
- `super.variable` accesses the parent class field.
- `this.method()` calls the current object's method.
- `super.method()` calls the parent implementation.
- `this()` calls another constructor in the same class.
- `super()` calls the immediate parent constructor.
- `this()` and `super()` must be the first statement in a constructor.
- A constructor cannot explicitly call both `this()` and `super()`.
- If neither is explicitly used, Java implicitly inserts `super()` when applicable.
- `this` is mainly about the current object.
- `super` is mainly about the parent class.

## One-Line Revision

**`this` → Current Object | `super` → Immediate Parent | `this()` → Same-Class Constructor | `super()` → Parent Constructor**