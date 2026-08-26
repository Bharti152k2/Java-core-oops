# Java Basics

## What is Java?

Java is a high-level, class-based, object-oriented programming language designed to be platform-independent.

Java follows the principle:

Write Once, Run Anywhere (WORA).

Java source code is compiled into bytecode, which is executed by the JVM.

---

## Key Characteristics of Java

- Simple
- Object-Oriented
- Platform Independent
- Portable
- Secure
- Robust
- Multithreaded
- Distributed
- High Performance
- Dynamic
- Architecture Neutral

---

## Why is Java Platform Independent?

Java source code is not directly converted into machine-specific code.

The flow is:

.java
  ↓
Java Compiler
  ↓
.class (Bytecode)
  ↓
JVM
  ↓
Machine Code## Important Java Terms

### Source Code
The code written by the programmer in a `.java` file.

### Compiler
The Java compiler (`javac`) converts Java source code into bytecode.

### Bytecode
Intermediate code stored in a `.class` file.

### JVM
Java Virtual Machine executes Java bytecode.

### JDK
Java Development Kit contains tools required to develop Java applications.

### JRE
Java Runtime Environment provides the environment required to run Java applications.

### JVM
JVM is responsible for executing Java bytecode.

---

## Java Execution Flow

Java Source Code
       ↓
   javac Compiler
       ↓
    Bytecode
       ↓
     JVM
       ↓
 Machine Code
       ↓
    Output

Detailed JVM concepts are covered in:
02-JVM-JDK-JRE

---

## Advantages of Java

- Platform independent
- Object-oriented
- Secure
- Robust
- Automatic memory management
- Multithreaded
- Large ecosystem
- Good community support
- Portable
- Widely used in enterprise applications

---

## Disadvantages of Java

- More memory consumption compared to some lower-level languages
- Can be slower than languages such as C/C++ for certain use cases
- Verbose syntax
- Requires JVM to run
- Garbage collection can introduce performance overhead

---

## First Java Program

See:
HelloJava.java

---

## Key Takeaways

- Java is a high-level, object-oriented language.
- Java source code is compiled into bytecode.
- Bytecode is executed by the JVM.
- Java achieves platform independence through the JVM.
- JDK is used for development.
- JRE provides the runtime environment.
- JVM executes bytecode.