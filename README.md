# Java Tutorial Notes

Java Tutorial Notes is a comprehensive reference guide designed to serve as a base language
reference and an interview preparation resource. This project provides structured explanations,
practical examples, and key concepts to help learners, developers and me to master Java efficiently.

Repository is based on [Java Masterclass 2025](https://www.udemy.com/course/java-the-complete-java-developer-course)
course by Tim Buchalka.


**Features**
* 📌 Concise explanations of Java fundamentals and advanced topics
* 💡 Hands-on code snippets to reinforce learning
* 🎯 Interview-focused content covering common questions and best practices
* 📚 Organized topic-wise structure for quick navigation


## ToDo List
- [ ] Where to place Operators in project layout.

Table of Contents
=================

1. [Introduction to Java](#introduction-to-java)
2. [JDK / JRE / JVM](#jdk-jre-jvm)
3. [Manual Building](#manual-building)
4. [Maven and Gradle](#maven-and-gradle)
5. [Data Types](#data-types)
6. [Control Flow](#control-flow)
7. [Object Oriented Programming](#object-oriented-programming)
8. [Arrays](#arrays)
9. [Lists, ArrayList, LinkedList, Iterators, Autoboxing](#lists-arraylist-linkedlist-iterators-autoboxing)
10. [Abstraction in Java](#abstraction-in-java)

---
### ToDo List

- [ ] Where to place Operators in project layout?

---

## Introduction to Java

Java is a high-level, object-oriented, and platform-independent programming language. It was 
developed by Sun Microsystems in 1995 and later acquired by Oracle Corporation. Java is widely used
for developing web applications, mobile applications, enterprise software, and embedded systems.

## JDK / JRE / JVM

## Manual Building

To compile a Java program, you need to have the Java Development Kit (JDK) installed on your system.

```
project/
│── src/
│   └── org/example/Main.java
└── target/ (this will store compiled classes)
```

```bash
javac -d target src/org/example/Main.java
```

When executing a Java class, the fully qualified class name (FQCN) should match its package structure ,
but it should not include the target/classes directory.

```bash
java -cp target/classes org.example.Main  
```
`-cp target/classes` sets the classpath to the compiled files.  
`org.example.Main` correctly represents the package and class name.  


## Maven and Gradle

## Data Types

## Control Flow

## Object Oriented Programming

## Arrays

## Lists, ArrayList, LinkedList, Iterators, Autoboxing

## Abstraction in Java




