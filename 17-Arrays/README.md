# Arrays

An array is a fixed-size data structure used to store multiple values of the same type.

Example:

```java
int[] numbers = {10, 20, 30, 40};
```

Conceptually:

```text
Index:     0    1    2    3
           ↓    ↓    ↓    ↓
Array:    [10] [20] [30] [40]
```

---

# 1. Why Arrays?

Instead of creating separate variables:

```java
int a = 10;
int b = 20;
int c = 30;
int d = 40;
```

we can use:

```java
int[] numbers = {10, 20, 30, 40};
```

Arrays make it easier to store and process collections of values.

---

# 2. Important Characteristics

Java arrays:

- Store multiple values.
- Have a fixed size.
- Store elements of the same type.
- Use zero-based indexing.
- Are objects in Java.
- Have a `length` field.
- Store elements in contiguous logical positions.
- Can store primitive values or object references.

---

# 3. Array Declaration

An array can be declared using:

```java
int[] numbers;
```

or:

```java
int numbers[];
```

The first form is generally preferred:

```java
int[] numbers;
```

At this point, the array has only been declared.

No array object has been created yet.

---

# 4. Array Creation

Use `new` to create an array:

```java
int[] numbers = new int[5];
```

This creates an array capable of storing 5 integers.

```text
Index:     0    1    2    3    4
           ↓    ↓    ↓    ↓    ↓
Array:    [0]  [0]  [0]  [0]  [0]
```

The default value for `int` elements is `0`.

---

# 5. Array Initialization

An array can be initialized directly:

```java
int[] numbers = {10, 20, 30, 40};
```

The size is automatically determined:

```text
Size = 4
```

---

# 6. Indexing

Array indexing starts from `0`.

Example:

```java
int[] numbers = {10, 20, 30};
```

```text
Index:     0     1     2
           ↓     ↓     ↓
Value:    10    20    30
```

Access elements:

```java
numbers[0]  // 10
numbers[1]  // 20
numbers[2]  // 30
```

---

# 7. Updating an Element

Array elements can be changed using their index.

Example:

```java
numbers[1] = 50;
```

Before:

```text
[10, 20, 30]
```

After:

```text
[10, 50, 30]
```

---

# 8. Array Length

Use:

```java
numbers.length
```

to get the number of elements.

Example:

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers.length);
```

Output:

```text
3
```

Important:

```text
Array → length
String → length()
```

---

# 9. Traversing an Array

A common way to traverse an array is using a `for` loop.

```java
for (int i = 0; i < numbers.length; i++) {

    System.out.println(numbers[i]);
}
```

Flow:

```text
i = 0
 ↓
numbers[0]
 ↓
i++
 ↓
numbers[1]
 ↓
i++
 ↓
...
```

---

# 10. Enhanced for Loop

Java also provides the enhanced `for` loop.

Example:

```java
for (int number : numbers) {

    System.out.println(number);
}
```

This is useful when you need the values but do not need the index.

---

# 11. `for` vs Enhanced `for`

| Normal `for` | Enhanced `for` |
|---|---|
| Gives access to index | Does not directly provide index |
| Can update elements using index | Mainly used for reading/traversing |
| More control | Simpler syntax |

Example:

```java
for (int i = 0; i < numbers.length; i++) {

    System.out.println(numbers[i]);
}
```

vs:

```java
for (int number : numbers) {

    System.out.println(number);
}
```

---

# 12. Default Values

When an array is created using `new`, its elements receive default values.

| Data Type | Default Value |
|---|---|
| `int` | `0` |
| `double` | `0.0` |
| `float` | `0.0f` |
| `long` | `0L` |
| `boolean` | `false` |
| `char` | `'\u0000'` |
| Object reference | `null` |

Example:

```java
int[] numbers = new int[3];
```

Initially:

```text
[0, 0, 0]
```

---

# 13. ArrayIndexOutOfBoundsException

Trying to access an invalid index causes:

```text
ArrayIndexOutOfBoundsException
```

Example:

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[3]);
```

Valid indexes are:

```text
0
1
2
```

Index `3` does not exist.

---

# 14. Multidimensional Arrays

Java supports multidimensional arrays.

A two-dimensional array can be thought of as rows and columns.

Example:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

Diagram:

```text
        Column
        0   1   2
      +---+---+---+
Row 0 | 1 | 2 | 3 |
      +---+---+---+
Row 1 | 4 | 5 | 6 |
      +---+---+---+
```

Access:

```java
matrix[0][1]
```

Output:

```text
2
```

---

# 15. Nested Loops for 2D Arrays

A two-dimensional array is commonly traversed using nested loops.

```java
for (int i = 0; i < matrix.length; i++) {

    for (int j = 0; j < matrix[i].length; j++) {

        System.out.print(matrix[i][j] + " ");
    }
}
```

Conceptually:

```text
Outer loop → rows
Inner loop → columns
```

---

# 16. Jagged Arrays

Java allows arrays where each row can have a different length.

Example:

```java
int[][] numbers = {
    {1, 2},
    {3, 4, 5},
    {6}
};
```

Diagram:

```text
Row 0 → [1, 2]
Row 1 → [3, 4, 5]
Row 2 → [6]
```

This is called a jagged array.

---

# 17. Passing Arrays to Methods

Arrays can be passed to methods.

Example:

```java
static void printArray(int[] numbers) {

    for (int number : numbers) {

        System.out.println(number);
    }
}
```

Call:

```java
printArray(numbers);
```

---

# 18. Returning Arrays

A method can also return an array.

Example:

```java
static int[] createArray() {

    return new int[]{10, 20, 30};
}
```

Usage:

```java
int[] numbers = createArray();
```

---

# 19. Arrays Are Objects

In Java, arrays are objects.

Therefore:

```java
int[] numbers = new int[5];
```

creates an array object.

The variable:

```text
numbers
```

holds a reference to that array object.

Conceptually:

```text
numbers
   |
   v
+-------------------+
| Array Object      |
| 0  0  0  0  0    |
+-------------------+
```

---

# 20. Array Reference

Consider:

```java
int[] a = {10, 20, 30};

int[] b = a;
```

Both variables refer to the same array.

```text
a ───────┐
         ↓
      [10,20,30]
         ↑
b ───────┘
```

Therefore:

```java
b[0] = 100;
```

also changes what `a[0]` sees.

```text
a → [100,20,30]
b → [100,20,30]
```

This is important when understanding references and copying arrays.

---

# Key Takeaways

- An array stores multiple values of the same type.
- Arrays have fixed size.
- Array indexing starts at `0`.
- The last index is `length - 1`.
- Use `array.length` to get the number of elements.
- Arrays can be declared using `int[] numbers`.
- `new` creates the array object.
- Arrays receive default values when created with `new`.
- Arrays can be traversed using normal `for` or enhanced `for`.
- Invalid indexes cause `ArrayIndexOutOfBoundsException`.
- Java supports multidimensional arrays.
- Java also supports jagged arrays.
- Arrays can be passed to and returned from methods.
- Arrays are objects in Java.
- Array variables hold references to array objects.
- Assigning one array reference to another does not create a new array.

## One-Line Revision

**Array → Fixed Size + Same Type + Zero-Based Indexing + `length` + Object/Reference**