# Variables

A variable is a named memory location used to store a value.

The value stored in a variable can change during program execution.

Example:

```java
int age = 24;
```

Here:

- `int` → Data type
- `age` → Variable name
- `24` → Value
- `=` → Assignment operator

---

## 1. Declaring a Variable

A variable can be declared without assigning a value.

```java
int age;
```

Here, `age` is declared as an integer variable.

---

## 2. Initializing a Variable

Assigning a value to a variable is called initialization.

```java
int age = 24;
```

The variable is both declared and initialized.

---

## 3. Declaration vs Initialization vs Assignment

### Declaration

```java
int age;
```

A variable is declared.

### Initialization

```java
int age = 24;
```

A value is assigned for the first time.

### Assignment

```java
age = 25;
```

A new value is assigned to an existing variable.

---

## 4. Types of Variables in Java

Variables are commonly classified into three types:

1. Local variables
2. Instance variables
3. Static variables

```text
                    Variables
                        |
          +-------------+-------------+
          |             |             |
          v             v             v
       Local         Instance       Static
      Variable       Variable      Variable
```

---

## 5. Local Variables

A local variable is declared inside:

- A method
- Constructor
- Block

Example:

```java
public void display() {

    int age = 24;

    System.out.println(age);
}
```

Here, `age` is a local variable.

### Important

A local variable can only be accessed within the scope where it is declared.

---

## 6. Instance Variables

An instance variable is declared inside a class but outside methods, constructors and blocks, and without the `static` keyword.

Example:

```java
class Student {

    String name;
    int age;
}
```

Here:

```text
name
age
```

are instance variables.

Each object gets its own instance state.

Example:

```java
Student s1 = new Student();
Student s2 = new Student();

s1.age = 20;
s2.age = 25;
```

The two objects can have different values.

---

## 7. Static Variables

A static variable is declared using the `static` keyword.

It belongs to the class rather than individual objects.

Example:

```java
class Student {

    static String college = "ABC College";
}
```

The static variable is shared by objects of that class.

Example:

```text
             Student Class
                   |
             static college
                   |
          +--------+--------+
          |                 |
          v                 v
         s1                s2
          |                 |
          +------ share ----+
```

Both objects refer to the same class-level variable.

---

## 8. Local vs Instance vs Static

| Feature | Local | Instance | Static |
|---|---|---|---|
| Declared | Inside method/block/constructor | Inside class, outside methods | Inside class with `static` |
| Belongs to | Method/block | Object | Class |
| Object required | No | Yes | No |
| Scope | Limited to declaration scope | Object/class context | Class |
| Separate copy for each object | Not applicable | Yes | No, generally shared |

---

## 9. Variable Scope

Scope means the part of the program where a variable can be accessed.

Example:

```java
public static void main(String[] args) {

    int x = 10;

    if (x > 5) {

        int y = 20;

        System.out.println(x);
        System.out.println(y);
    }

    System.out.println(x);

    // System.out.println(y); // Error
}
```

`x` can be accessed throughout the `main()` method after its declaration.

`y` can only be accessed inside the `if` block where it was declared.

---

## 10. Variable Shadowing

Variable shadowing occurs when a variable declared in a narrower scope has the same name as a variable in an outer scope.

Example:

```java
class Student {

    int age = 20;

    void display() {

        int age = 25;

        System.out.println(age);
    }
}
```

Inside `display()`, the local `age` shadows the instance variable.

The `this` keyword can later be used to explicitly refer to the instance variable:

```java
System.out.println(this.age);
```

The `this` keyword will be covered separately.

---

## 11. Default Values

Instance and static variables receive default values if no value is explicitly assigned.

Examples:

| Data Type | Default Value |
|---|---|
| `byte` | `0` |
| `short` | `0` |
| `int` | `0` |
| `long` | `0L` |
| `float` | `0.0f` |
| `double` | `0.0d` |
| `char` | `'\u0000'` |
| `boolean` | `false` |
| Reference types | `null` |

Example:

```java
class Student {

    int age;
    boolean active;
    String name;
}
```

If an object is created without assigning values:

```java
Student s = new Student();
```

the instance variables receive their default values.

---

## 12. Local Variables Do Not Get Default Values

Local variables must be initialized before they are used.

This is invalid:

```java
public static void main(String[] args) {

    int age;

    System.out.println(age);
}
```

The compiler reports that the local variable may not have been initialized.

Correct:

```java
int age = 24;

System.out.println(age);
```

---

## 13. Variable Lifetime

Variable lifetime refers to how long a variable exists during execution.

### Local Variable

Generally exists while its method/block execution is active.

### Instance Variable

Exists as part of an object while that object is reachable and eventually until it becomes eligible for garbage collection.

### Static Variable

Associated with the class and generally exists while the class is loaded/usable by the JVM.

---

# Variable Memory Concept

```text
                    Java Program
                         |
              +----------+----------+
              |          |          |
              v          v          v
           Local      Instance     Static
             |           |           |
             v           v           v
          Method       Object       Class
           Scope        State       Level
```

---

# Key Takeaways

- A variable stores a value that can be used by a program.
- Declaration creates a variable definition.
- Initialization assigns its first value.
- Assignment changes the value of an existing variable.
- Java has three common categories of variables: local, instance and static.
- Local variables are declared inside methods, constructors or blocks.
- Instance variables belong to individual objects.
- Static variables belong to the class and are shared.
- Scope determines where a variable can be accessed.
- Local variables must be initialized before use.
- Instance and static variables receive default values.
- Variables declared in inner scopes can shadow variables from outer scopes.
- `this` can be used to explicitly refer to the current object's instance variable.

## One-Line Revision

**Local → Method/Block | Instance → Object | Static → Class | Scope → Where Variable Can Be Accessed**