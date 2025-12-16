# 🧩 Singleton Design Pattern using Logger (Java)

## 📌 Overview
This project demonstrates the **Singleton Design Pattern** using a **Logger** example in Java.

The purpose of this repository is to help students and beginners **understand Singleton**:
- Why it is needed
- How it works
- How it is applied in real-world systems (like logging)

---

## ❓ What is the Singleton Design Pattern?

The **Singleton Design Pattern** is a **creational design pattern** that ensures:
- Only **one instance** of a class exists throughout the application
- That instance is **globally accessible**

> In simple terms:  
> **One class → One object → Shared everywhere**

---

## 📝 Why Logger Should Be a Singleton

Logging is a shared service used by many parts of an application.

### Problems if Logger is NOT Singleton:
- Multiple Logger objects created
- Multiple log files opened
- Inconsistent log messages
- File access conflicts
- Higher memory usage

### Solution:
Use **Singleton** so that **all parts of the application use the same Logger instance**.

---

## 🌍 Real-World Examples of Singleton
- Logger
- Database connections
- Configuration managers
- Cache systems
- Thread pools

---

## ⚙️ How Singleton Works

A Singleton class follows **3 essential rules**:

1. **Private Constructor**  
   Prevents creating objects using `new`.

2. **Private Static Instance Variable**  
   Holds the single instance of the class.

3. **Public Static Access Method**  
   Returns the same instance every time it is called.

---

## 🧩 Pseudocode for Singleton Logger

