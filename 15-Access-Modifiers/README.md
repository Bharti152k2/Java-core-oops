# Access Modifiers

Access modifiers control the visibility and accessibility of classes, variables, methods, and constructors in Java.

Java has four main access levels:

```text
                    Access Modifiers
                          |
          +---------------+---------------+
          |               |               |
          v               v               v
       private         default         protected        public
```

The four access levels are:

```text
private
default
protected
public
```

---

# 1. Why Access Modifiers?

Access modifiers control:

> **Who can access a class member?**

For example:

```java
class Student {

    private String name;
}
```

The `name` variable cannot be directly accessed from outside the class.

This helps achieve **encapsulation and data hiding**.

---

# 2. Four Access Levels

```text
private
   ↓
Same Class Only

default
   ↓
Same Package

protected
   ↓
Same Package
+
Different Package Subclass

public
   ↓
Everywhere
```

---

# 3. Access Modifier Table

| Modifier | Same Class | Same Package | Subclass in Different Package | Different Package |
|---|---|---|---|---|
| `private` | Yes | No | No | No |
| default | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes* | No |
| `public` | Yes | Yes | Yes | Yes |

`*` Protected access from a different package is available through inheritance.

---

# 4. `private`

`private` provides the most restricted access.

A private member can be accessed only inside the class where it is declared.

Example:

```java
class Student {

    private int age;

    void showAge() {

        System.out.println(age);
    }
}
```

Inside the same class:

```text
private → Accessible
```

Outside the class:

```text
private → Not directly accessible
```

---

# 5. `default`

When no access modifier is written, the member has **default/package-private access**.

Example:

```java
class Student {

    int age;
}
```

There is no keyword before `int age`.

Therefore:

```text
int age;
```

has default access.

Default members are accessible within the **same package**.

They are not accessible from a different package.

---

# 6. `protected`

`protected` provides access:

```text
Same Package
+
Different Package Subclass
```

Example:

```java
class Parent {

    protected int number = 10;
}
```

A class in the same package can access it.

A subclass in another package can also access it through inheritance.

---

# 7. `public`

`public` provides the widest access.

A public member can generally be accessed from any package, provided the class/member is otherwise accessible.

Example:

```java
public class Student {

    public int age;
}
```

The member can be accessed from another package.

---

# 8. Same Class

Inside the class where the member is declared:

```text
private   → Yes
default   → Yes
protected → Yes
public    → Yes
```

Therefore:

```text
All four modifiers are accessible
inside their own class.
```

---

# 9. Same Package

For another class in the same package:

```text
private   → No
default   → Yes
protected → Yes
public    → Yes
```

Diagram:

```text
                 Same Package
                      |
        +-------------+-------------+
        |             |             |
        v             v             v
     default       protected       public
       Yes            Yes            Yes

     private
       No
```

---

# 10. Different Package - Non-Subclass

For a class in another package that does not extend the original class:

```text
private   → No
default   → No
protected → No
public    → Yes
```

Therefore:

```text
Different Package
       |
       +---- public → Yes
       |
       +---- protected → No
       +---- default → No
       +---- private → No
```

---

# 11. Different Package - Subclass

Suppose:

```text
package A
    |
    v
Parent
    |
    v
protected member
```

and:

```text
package B
    |
    v
Child extends Parent
```

The child can access the protected member through inheritance.

Example:

```java
class Parent {

    protected int number = 10;
}

class Child extends Parent {

    void show() {

        System.out.println(number);
    }
}
```

This is allowed because `Child` inherits from `Parent`.

---

# 12. Protected Important Point

In a different package, `protected` is **not the same as public**.

A non-subclass class in another package cannot simply access the protected member.

The special cross-package access is provided to subclasses through inheritance.

Remember:

```text
protected
   |
   +---- Same package → Yes
   |
   +---- Different package subclass → Yes
   |
   +---- Different package non-subclass → No
```

---

# 13. Class Access

Top-level classes can generally use:

```text
public
default
```

A top-level class cannot be declared:

```java
private
```

or:

```java
protected
```

Example:

```java
public class Student {

}
```

or:

```java
class Student {

}
```

The second class has package-private/default access.

---

# 14. Access Modifier Diagram

```text
                         Access
                           |
        +------------------+------------------+
        |                  |                  |
        v                  v                  v
   Same Class         Same Package      Different Package
        |                  |                  |
        v                  v                  v
   All modifiers     default/protected/    public
                     public
                                     
                          +
                    protected subclass
```

---

# 15. Access Levels From Most Restrictive to Least Restrictive

```text
private
   ↓
default
   ↓
protected
   ↓
public
```

Think:

```text
private → smallest visibility

public → largest visibility
```

---

# 16. Connection With Encapsulation

Access modifiers are heavily used in encapsulation.

Example:

```java
class Student {

    private int age;

    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {

        return age;
    }
}
```

Here:

```text
private age
    ↓
Data is hidden

public getter/setter
    ↓
Controlled access
```

This is a common way to implement **data hiding**.

---

# Key Takeaways

- Access modifiers control visibility and accessibility.
- Java has four main access levels: `private`, default, `protected`, and `public`.
- `private` → accessible only inside the same class.
- Default/package-private → accessible within the same package.
- `protected` → accessible within the same package and through inheritance in a different package.
- `public` → accessible from any package when the containing type is accessible.
- All four modifiers are accessible inside the declaring class.
- A different-package non-subclass can directly access only public members.
- A different-package subclass can access protected members through inheritance.
- Top-level classes can be `public` or default/package-private.
- Top-level classes cannot be `private` or `protected`.
- Access modifiers are important for encapsulation and data hiding.

## One-Line Revision

**private → Same Class | default → Same Package | protected → Same Package + Different Package Subclass | public → Everywhere**