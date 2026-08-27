# Data Types

A data type defines what kind of value a variable can store.

Java is a **statically typed language**, which means the type of a variable is known at compile time.

Example:

```java
int age = 24;
```

Here:

- `int` → Data type
- `age` → Variable
- `24` → Value

---

## 1. Types of Data Types

Java data types are broadly divided into:

```text
                    Data Types
                         |
              +----------+----------+
              |                     |
              v                     v
          Primitive             Non-Primitive
              |                     |
       +------+-------+             |
       |              |             |
       v              v             v
   Numeric        Non-Numeric    Reference
```

### Primitive Data Types

Java has **8 primitive data types**:

- byte
- short
- int
- long
- float
- double
- char
- boolean

### Non-Primitive Data Types

Examples include:

- String
- Arrays
- Classes
- Objects
- Interfaces
- Enums

---

# 2. Primitive Data Types

Primitive data types are the basic built-in data types provided by Java.

The 8 primitive types are:

| Type | Category | Size | Example |
|---|---|---:|---|
| `byte` | Integer | 8 bits | `byte x = 10;` |
| `short` | Integer | 16 bits | `short x = 100;` |
| `int` | Integer | 32 bits | `int x = 1000;` |
| `long` | Integer | 64 bits | `long x = 10000L;` |
| `float` | Decimal | 32 bits | `float x = 10.5f;` |
| `double` | Decimal | 64 bits | `double x = 10.5;` |
| `char` | Character | 16 bits | `char x = 'A';` |
| `boolean` | Logical | JVM-dependent representation | `boolean x = true;` |

---

# 3. Integer Data Types

Java provides four integer types:

```text
byte
short
int
long
```

### byte

- 8-bit signed integer
- Range: `-128` to `127`

```java
byte age = 24;
```

### short

- 16-bit signed integer
- Range: `-32,768` to `32,767`

```java
short marks = 300;
```

### int

- 32-bit signed integer
- Range: `-2,147,483,648` to `2,147,483,647`

```java
int population = 100000;
```

`int` is the most commonly used integer type.

### long

- 64-bit signed integer
- Range:

```text
-9,223,372,036,854,775,808
to
9,223,372,036,854,775,807
```

Example:

```java
long distance = 10000000000L;
```

The `L` suffix indicates a long literal.

---

# 4. Floating-Point Data Types

Java provides two floating-point types:

```text
float
double
```

### float

- 32-bit floating-point value
- Requires the `f` suffix for decimal literals.

```java
float price = 99.5f;
```

### double

- 64-bit floating-point value
- Decimal literals are `double` by default.

```java
double salary = 50000.50;
```

`double` generally provides greater precision than `float`.

---

# 5. char

`char` stores a single UTF-16 code unit.

Example:

```java
char grade = 'A';
```

A `char` uses single quotes:

```text
'A'
```

while a String uses double quotes:

```text
"A"
```

Example:

```java
char letter = 'B';
String name = "Bharti";
```

A `char` is a 16-bit unsigned type.

---

# 6. boolean

`boolean` represents a logical value.

It can contain:

```text
true
false
```

Example:

```java
boolean isJavaEasy = true;
```

It is commonly used in conditions:

```java
if (isJavaEasy) {

    System.out.println("Keep learning!");
}
```

---

# 7. Non-Primitive Data Types

Non-primitive types are reference types.

Examples:

- String
- Arrays
- Classes
- Objects
- Interfaces
- Enums

Example:

```java
String name = "Bharti";
```

Here:

```text
String → Reference type
name   → Reference variable
```

Another example:

```java
int[] numbers = {1, 2, 3};
```

Here `numbers` is a reference to an array object.

---

# 8. Primitive vs Non-Primitive

| Primitive | Non-Primitive |
|---|---|
| Built-in basic types | Reference types |
| 8 types | Many types |
| Examples: `int`, `char`, `boolean` | Examples: `String`, arrays, classes |
| Variables store primitive values | Variables hold references to objects |
| Cannot be `null` | Can generally be `null` |
| Have predefined fixed types | Can represent complex structures |

---

# 9. Default Values

Instance and static variables receive default values when no value is explicitly assigned.

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

### Important

Local variables do **not** automatically receive default values.

They must be initialized before use.

---

# 10. Literals

A literal is a fixed value written directly in source code.

Examples:

```java
int age = 24;
double price = 99.5;
char grade = 'A';
boolean active = true;
String name = "Bharti";
```

Here:

```text
24       → int literal
99.5     → double literal
'A'      → char literal
true     → boolean literal
"Bharti" → String literal
```

---

# 11. Numeric Literal Suffixes

Some numeric literals use suffixes to explicitly specify their type.

### long

```java
long number = 100000L;
```

### float

```java
float value = 10.5f;
```

Without `f`, a decimal literal is normally treated as `double`.

---

# 12. Why Data Types Matter

Data types help Java determine:

- What kind of value is stored
- What operations are allowed
- How the value should be interpreted
- What range of values can be represented

Example:

```java
int age = 24;
```

Java knows that `age` is an integer.

Therefore:

```java
age + 10
```

is a valid integer operation.

---

# Data Type Hierarchy

```text
                     Java Data Types
                            |
              +-------------+-------------+
              |                           |
              v                           v
         Primitive                   Reference
              |                           |
       +------+-------+             +-----+------+
       |              |             |            |
       v              v             v            v
    Numeric       Non-Numeric     String      Objects
       |              |
   +---+---+      +---+---+
   |       |      |       |
 Integer Decimal char   boolean
   |
   +-- byte
   +-- short
   +-- int
   +-- long

 Decimal:
   +-- float
   +-- double
```

---

# Key Takeaways

- A data type defines the kind of value a variable can store.
- Java has 8 primitive data types.
- Primitive types are `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.
- Integer types are `byte`, `short`, `int`, and `long`.
- Floating-point types are `float` and `double`.
- `char` stores a single UTF-16 code unit.
- `boolean` stores `true` or `false`.
- `String`, arrays, classes and objects are reference types.
- Primitive variables hold primitive values.
- Reference variables refer to objects.
- Primitive types cannot contain `null`.
- Reference variables can generally contain `null`.
- Instance and static variables receive default values.
- Local variables must be initialized before use.
- `int` is the commonly used integer type.
- `double` is the default type for decimal literals.
- `long` literals can use `L`.
- `float` literals require `f` when written as decimal literals.

## One-Line Revision

**Primitive → 8 Basic Types | Reference → Objects/Complex Data | int → Common Integer | double → Default Decimal**