# Encapsulation

Encapsulation is one of the four pillars of Object-Oriented Programming.

The four pillars are:

```text
Encapsulation
Abstraction
Inheritance
Polymorphism
```

Encapsulation means **bundling data and the methods that operate on that data inside a class and controlling direct access to the data**.

A common implementation is:

- Keep fields `private`
- Provide controlled access through methods such as getters and setters

---

# 1. Why Encapsulation?

Without encapsulation:

```java
class Student {

    public int age;
}
```

Any code can directly modify the value:

```java
student.age = -100;
```

This can lead to invalid object state.

With encapsulation:

```java
class Student {

    private int age;

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {

        return age;
    }
}
```

Now the class controls how `age` can be changed.

---

# 2. Basic Structure

A common encapsulated class looks like:

```java
class Student {

    private String name;
    private int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
```

The fields are hidden from direct access.

Access is provided through methods.

---

# 3. `private`

`private` is an access modifier.

A private member can only be directly accessed inside the class where it is declared.

Example:

```java
class Student {

    private int age;
}
```

This is not allowed from outside the class:

```java
student.age = 20;
```

Instead, controlled methods can be provided.

---

# 4. Getter

A getter is a method used to retrieve the value of a field.

Example:

```java
public int getAge() {

    return age;
}
```

Usage:

```java
System.out.println(student.getAge());
```

The getter provides controlled read access.

---

# 5. Setter

A setter is a method used to modify the value of a field.

Example:

```java
public void setAge(int age) {

    this.age = age;
}
```

Usage:

```java
student.setAge(25);
```

The setter provides controlled write access.

---

# 6. Getter and Setter Flow

```text
                 Object
                   |
             private data
                   |
             +-----+-----+
             |           |
             v           v
          Getter       Setter
             |           |
             v           v
           Read        Modify
```

The outside code does not directly access the private field.

---

# 7. Encapsulation with Validation

One of the important benefits of setters is that validation can be added.

Example:

```java
public void setAge(int age) {

    if (age >= 0 && age <= 150) {

        this.age = age;
    }
}
```

Now invalid values can be rejected.

Example:

```java
student.setAge(-10);
```

The class can prevent the invalid value from entering its state.

---

# 8. `this` Keyword

Inside an instance method, `this` refers to the current object.

Example:

```java
private int age;

public void setAge(int age) {

    this.age = age;
}
```

Here:

```text
this.age
   ↓
Instance variable

age
   ↓
Method parameter
```

`this` removes the ambiguity between the field and parameter.

---

# 9. Read-Only Encapsulation

A class can expose a getter without exposing a setter.

Example:

```java
class Student {

    private String id;

    public String getId() {

        return id;
    }
}
```

The value can be read through:

```java
student.getId();
```

but there is no public method to change it.

This creates a read-only style of access for that field.

---

# 10. Write-Only Encapsulation

A field can also expose a setter without exposing a getter.

Example:

```java
private String password;

public void setPassword(String password) {

    this.password = password;
}
```

The field can be modified through the setter but is not directly exposed through a getter.

In real applications, sensitive data is usually handled with additional security considerations rather than simply relying on a setter.

---

# 11. Encapsulation and Data Hiding

These concepts are closely related but not exactly identical.

### Data Hiding

Restricting direct access to internal data.

Example:

```java
private int age;
```

### Encapsulation

Bundling data and related behavior together while controlling access to the object's internal state.

A common Java implementation of encapsulation uses:

```text
private fields
      +
public methods
      +
validation/business rules
```

---

# 12. Benefits of Encapsulation

### 1. Data Protection

Internal data is not directly exposed.

### 2. Controlled Access

The class decides how data can be read or modified.

### 3. Validation

Invalid data can be rejected.

### 4. Maintainability

Internal implementation can change without changing how other classes use the object.

### 5. Better Organization

Data and the operations related to that data remain together.

---

# 13. Encapsulation Example

Without encapsulation:

```text
Other Class
    |
    v
public age
    |
    v
Can directly modify
```

With encapsulation:

```text
Other Class
    |
    v
setAge()
    |
    v
Validation
    |
    v
private age
```

---

# Encapsulation Diagram

```text
              Encapsulated Object
        +---------------------------+
        |                           |
        |      private fields       |
        |                           |
        |   name     age     id     |
        |                           |
        +-------------+-------------+
                      |
             Controlled Access
                      |
              +-------+-------+
              |               |
              v               v
           Getter           Setter
              |               |
              v               v
             Read           Modify
                              |
                              v
                         Validation
```

---

# Key Takeaways

- Encapsulation is one of the four pillars of OOP.
- Encapsulation bundles data and related behavior inside a class.
- `private` is commonly used to restrict direct access to fields.
- Getters provide controlled read access.
- Setters provide controlled write access.
- Setters can contain validation or business rules.
- `this` refers to the current object.
- A getter without a setter can provide read-only style access.
- A setter without a getter can provide write-only style access.
- Encapsulation improves data protection and maintainability.
- Data hiding means restricting direct access to internal data.
- Encapsulation is broader than simply making variables private.
- A common Java pattern is `private fields + public getters/setters`.

## One-Line Revision

**Encapsulation → Bundle Data + Behavior + Control Access → `private` Fields + Controlled Methods**