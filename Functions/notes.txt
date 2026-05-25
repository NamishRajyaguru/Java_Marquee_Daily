# Methods in Java

* Methods in Java are blocks of code that perform a specific task.
* Methods help organize code into reusable and manageable parts.
* Every method in Java must belong to a class.
* Methods define the behavior of objects.

---

# Advantages of Methods

* Reduce code duplication
* Improve readability
* Make debugging easier
* Help divide programs into smaller modules
* Increase code reusability
* Simplify maintenance

---

# Components of a Method

## Access Modifier

* Defines the visibility of the method.
* Common modifiers:

  * public
  * private
  * protected

---

## Static Keyword

* Static methods belong to the class instead of objects.
* They can be called without creating objects.

---

## Return Type

* Specifies the type of value returned by the method.
* If no value is returned, the return type is void.

---

## Method Name

* Identifier used to call the method.
* Should be meaningful and descriptive.

---

## Parameters

* Inputs accepted by the method.
* Methods can have:

  * no parameters
  * single parameter
  * multiple parameters

---

# Method Declaration

* A method declaration defines:

  * access modifier
  * return type
  * method name
  * parameter list
  * method body

---

# Method Calling

* A method executes only when it is called.
* Methods can be called multiple times.

---

# Types of Methods in Java

## User-defined Methods

* Methods created by programmers according to program requirements.

---

## Standard Library Methods

* Built-in methods provided by Java libraries.

---

# Static Methods

* Belong to the class.
* Can be accessed without object creation.
* Can directly access only static members.

---

# Instance Methods

* Belong to objects.
* Require object creation for access.
* Can access instance variables and methods.

---

# Method Parameters

## Methods with Parameters

* Accept input values during method calls.

---

## Methods without Parameters

* Do not accept any input values.

---

# Return Statement

* Used to return values from methods.
* Terminates method execution.

---

# Method Overloading

* Multiple methods can have the same name within the same class.
* Parameters must differ in:

  * number
  * type
  * order
* Return type alone cannot differentiate overloaded methods.

---

# Method Overriding

* Child class provides a new implementation of a parent class method.
* Supports runtime polymorphism.

---

# Important Points About Methods

* Methods improve modularity.
* Methods can call other methods.
* Methods may or may not return values.
* Methods can be static or non-static.
* Methods can accept arguments.

---

# Benefits of Using Methods

* Better program structure
* Easier testing and debugging
* Improved readability
* Reduced complexity
* Easier maintenance
* Increased code reuse

# Heap Memory vs Stack Memory

## Stack Memory

* Stack memory stores:

  * local variables
  * method calls
  * function execution data
* Memory allocation and deallocation happen automatically.
* Stack follows the LIFO (Last In First Out) principle.
* Each method call creates a new stack frame.
* Stack memory is faster than heap memory.
* Stack size is limited.
* Variables stored in stack exist only during method execution.

---

## Heap Memory

* Heap memory stores objects and instance variables.
* Objects created using `new` are stored in heap memory.
* Heap memory is shared among threads.
* Memory management is handled by Java Garbage Collector.
* Heap memory is generally larger than stack memory.
* Objects remain in heap until no references point to them.

---

## Difference Between Stack and Heap Memory

| Stack Memory                            | Heap Memory                      |
| --------------------------------------- | -------------------------------- |
| Stores local variables and method calls | Stores objects and instance data |
| Faster access                           | Slower than stack                |
| Automatically managed                   | Managed by Garbage Collector     |
| Limited size                            | Larger memory space              |
| Thread-specific                         | Shared among threads             |

---

# Function / Method Flow Sequence

* Program execution starts from the `main()` method.
* When a method is called:

  * control transfers to that method
  * a new stack frame is created
* Method execution follows top-to-bottom order.
* After execution:

  * control returns to the calling method
  * stack frame is removed
* Nested method calls create multiple stack frames.

---

# Method Call Process

1. Method is called
2. Arguments are passed
3. Stack frame is created
4. Method body executes
5. Return statement sends value back
6. Stack frame is removed
7. Control returns to caller

---

# Types of Scopes in Java

## Local Scope

* Variables declared inside methods or blocks.
* Accessible only within that block or method.

---

## Instance Scope

* Variables declared inside a class but outside methods.
* Accessible through objects.
* Also called instance variables.

---

## Class Scope (Static Scope)

* Variables declared using `static`.
* Belong to the class instead of objects.
* Shared among all objects.

---

## Block Scope

* Variables declared inside loops or conditional blocks.
* Accessible only within that block.

---

# This Keyword

* `this` refers to the current object.
* Used to differentiate instance variables from parameters.
* Can be used to:

  * access current object variables
  * call current object methods
  * invoke constructors
  * pass current object as argument

---

# Uses of This Keyword

## Access Current Object Variables

* Resolves ambiguity between instance variables and parameters.

---

## Call Current Object Methods

* Used to explicitly invoke methods of the current object.

---

## Constructor Chaining

* `this()` calls another constructor of the same class.

---

## Pass Current Object

* Current object can be passed as an argument to methods or constructors.

---

# Recursive Functions

* A recursive function is a function that calls itself.
* Used to solve problems by dividing them into smaller subproblems.
* Every recursive function must have:

  * base case
  * recursive case

---

# Base Case

* Condition that stops recursion.
* Prevents infinite recursive calls.

---

# Recursive Case

* Function calls itself with modified input.

---

# Working of Recursion

1. Function is called
2. Function calls itself repeatedly
3. Calls are stored in stack memory
4. Base case is reached
5. Functions return one by one

---

# Advantages of Recursion

* Simplifies complex problems
* Useful for tree and graph traversal
* Produces shorter and cleaner code in some cases

---

# Disadvantages of Recursion

* Higher memory usage due to stack frames
* Slower than iteration in some cases
* Can cause stack overflow if recursion is too deep

---

# Applications of Recursion

* Factorial calculation
* Fibonacci series
* Tree traversal
* Graph traversal
* Divide and conquer algorithms
* Backtracking problems

---

# Questions

* What are Functions?
* Why Functions?
* Sequencial Flow of Functions?
* Components of Functions?
* Context of the Functions (scoping, 'this' keyword)?
* Stack vs Heap Memory, Local Variable Table, How objects are stored?
* Call by Value vs Call by Reference?
* Types of Functions?
* Recursive Functions and use case?
* Difference between Parameters and Arguements?
* Method Overloading vs Method Overriding?