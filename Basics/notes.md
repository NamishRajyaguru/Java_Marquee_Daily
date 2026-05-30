# Variables

* Variables are named memory locations used to store data.
* Variable values can change during program execution.
* Every variable has:

  * name
  * data type
  * value

---

# Rules for Naming Variables

* Cannot start with numbers
* Cannot contain spaces
* Cannot use reserved keywords
* Can contain:

  * letters
  * digits
  * underscore `_`
  * dollar sign `$`
* Java uses camelCase naming convention.

---

# Types of Variables

## Local Variables

* Declared inside methods or blocks.
* Accessible only within that block.

---

## Instance Variables

* Declared inside class but outside methods.
* Belong to objects.

---

## Static Variables

* Declared using `static`.
* Shared among all objects.

---

# Data Types

## Primitive Data Types

* byte
* short
* int
* long
* float
* double
* char
* boolean

---

## Non-Primitive Data Types

* String
* Arrays
* Classes
* Interfaces
* Objects

---

# Operators

* Operators perform operations on variables and values.

---

# Types of Operators

## Arithmetic Operators

* Addition
* Subtraction
* Multiplication
* Division
* Modulus

---

## Relational Operators

* Compare values.
* Return boolean result.

Examples:

* equal to
* not equal to
* greater than
* less than

---

## Logical Operators

* Used with boolean expressions.

Types:

* AND
* OR
* NOT

---

## Assignment Operators

* Assign values to variables.

Examples:

* =
* +=
* -=
* *=
* /=

---

## Unary Operators

* Operate on single operand.

Examples:

* increment
* decrement
* negation

---

## Bitwise Operators

* Operate on binary bits.

Examples:

* AND
* OR
* XOR
* left shift
* right shift

---

# Conditional Statements

* Used for decision making.

---

# Types of Conditional Statements

## if Statement

* Executes block if condition is true.

---

## if-else Statement

* Executes one block if condition is true and another if false.

---

## else-if Ladder

* Multiple conditions checked sequentially.

---

## Nested if

* if statement inside another if statement.

---

## switch Statement

* Selects one block from multiple cases.
* Useful for fixed-value comparisons.

---

# Loops

* Loops repeat code multiple times.

---

# Types of Loops

## for Loop

* Used when number of iterations is known.

---

## while Loop

* Executes while condition remains true.

---

## do-while Loop

* Executes at least once before condition checking.

---

## Enhanced for Loop

* Used for arrays and collections traversal.

---

# Loop Control Statements

## break

* Terminates loop immediately.

---

## continue

* Skips current iteration and moves to next.

---

## return

* Exits method execution completely.

---

# Short Circuiting

* Logical operators may skip unnecessary evaluations.

---

## AND Short Circuit (`&&`)

* If first condition is false:

  * second condition is not checked.

---

## OR Short Circuit (`||`)

* If first condition is true:

  * second condition is not checked.

---

# Advantages of Short Circuiting

* Improves performance
* Prevents unnecessary execution
* Avoids runtime errors in some cases

---

# Type Casting

* Converting one data type into another.

---

# Types of Type Casting

## Implicit Casting (Widening)

* Smaller type converted to larger type automatically.

Examples:

* int → long
* float → double

---

## Explicit Casting (Narrowing)

* Larger type converted to smaller type manually.
* May cause data loss.

Examples:

* double → int
* long → short

---

# Constants

* Variables whose values cannot change.
* Declared using `final`.

---

# Input and Output

## Input

* User input is commonly taken using Scanner class.

---

## Output

* Output displayed using standard output methods.

---

# Arrays

* Collection of elements of same type.
* Stored in contiguous memory locations.
* Accessed using indices.

---

# Strings

* Sequence of characters.
* Strings in Java are immutable.

---

# Comments

## Single-line Comments

* Used for short explanations.

---

## Multi-line Comments

* Used for larger descriptions.

---

# Escape Sequences

* Special characters used inside strings.

Examples:

* newline
* tab
* quotation mark

---

# Increment and Decrement

## Pre-increment

* Value increases before usage.

---

## Post-increment

* Value increases after usage.

---

# Boolean Expressions

* Expressions that return:

  * true
  * false

Used heavily in:

* loops
* conditions
* logical operations

---

# Memory Allocation Basics

* Primitive variables store values directly.
* Objects store references pointing to heap memory.

---

# Compilation and Execution Process

1. Java source code is compiled into bytecode.
2. Bytecode runs on JVM.
3. JVM converts bytecode into machine code.

---

# JVM, JRE, and JDK

## JVM

* Executes Java bytecode.

---

## JRE

* Provides environment to run Java programs.

---

## JDK

* Provides tools for developing Java programs.
* Includes JRE and compiler.