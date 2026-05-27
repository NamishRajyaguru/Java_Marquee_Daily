# Arrays in Java

* Arrays are collections of elements of the same data type.
* Arrays store multiple values in a single variable.
* Elements are stored in contiguous memory locations.
* Array size is fixed after creation.
* Arrays use zero-based indexing.

---

# Features of Arrays

* Store homogeneous data
* Fast element access using index
* Fixed size
* Efficient memory usage
* Support traversal using loops

---

# Advantages of Arrays

* Easy data storage and access
* Faster access time
* Reduces need for multiple variables
* Useful for storing large amounts of similar data

---

# Disadvantages of Arrays

* Fixed size
* Cannot directly add or remove elements dynamically
* Stores only same type of elements
* Insertion and deletion are costly in middle positions

---

# Array Declaration

* Array declaration specifies:

  * data type
  * array name

---

# Array Creation

* Memory for arrays is allocated using `new`.
* Array size must be specified during creation.

---

# Array Initialization

* Arrays can be initialized:

  * during declaration
  * after declaration

---

# Types of Arrays

## One-Dimensional Array

* Linear collection of elements.
* Accessed using one index.

---

## Two-Dimensional Array

* Array of arrays.
* Represents rows and columns.

---

## Multidimensional Array

* Arrays containing multiple dimensions.
* Used for complex data representation.

---

# Accessing Array Elements

* Elements are accessed using indices.
* Index starts from 0.
* Last index is:

  * size - 1

---

# Traversing Arrays

* Arrays are commonly traversed using:

  * for loop
  * while loop
  * enhanced for loop

---

# Array Index

* Position number of an element in array.
* Starts from 0.

---

# Array Length

* Length represents total number of elements.
* Accessed using `length` property.

---

# Default Values in Arrays

## Integer Arrays

* Default value:

  * 0

---

## Floating Point Arrays

* Default value:

  * 0.0

---

## Character Arrays

* Default value:

  * null character

---

## Boolean Arrays

* Default value:

  * false

---

## Object Arrays

* Default value:

  * null

---

# Enhanced for Loop

* Simplifies array traversal.
* Accesses elements directly without indices.

---

# Array Memory Allocation

* Array object is stored in heap memory.
* Array reference variable is stored in stack memory.

---

# Anonymous Arrays

* Arrays created without explicit reference variables.
* Commonly used for method arguments.

---

# Jagged Arrays

* Arrays where rows have different lengths.
* Possible in multidimensional arrays.

---

# Copying Arrays

* Arrays can be copied:

  * manually
  * using built-in utility methods

---

# Array Comparison

* Arrays cannot be compared properly using `==`.
* `==` compares references, not contents.

---

# Sorting Arrays

* Arrays can be sorted in:

  * ascending order
  * descending order

---

# Searching in Arrays

## Linear Search

* Checks elements one by one.
* Time Complexity:

  * O(n)

---

## Binary Search

* Works on sorted arrays.
* Time Complexity:

  * O(log n)

---

# Time Complexity of Array Operations

| Operation | Complexity |
| --------- | ---------- |
| Access    | O(1)       |
| Search    | O(n)       |
| Insertion | O(n)       |
| Deletion  | O(n)       |

---

# One-Dimensional Arrays

* Simplest form of arrays.
* Elements stored sequentially.

---

# Two-Dimensional Arrays

* Represent matrix-like structures.
* Accessed using row and column indices.

---

# Sparse Arrays

* Arrays containing mostly default values.
* Memory inefficient in normal representation.

---

# Dynamic Arrays

* Normal arrays are fixed size.
* Dynamic behavior achieved using:

  * ArrayList

---

# Array vs ArrayList

| Array                      | ArrayList       |
| -------------------------- | --------------- |
| Fixed size                 | Dynamic size    |
| Faster                     | Slightly slower |
| Stores primitives directly | Stores objects  |
| Length property            | Size method     |

---

# Important Points About Arrays

* Arrays are objects in Java.
* Array size cannot change after creation.
* Arrays can store primitive and object types.
* Array indices outside bounds cause exceptions.

---

# ArrayIndexOutOfBoundsException

* Occurs when accessing invalid indices.
* Common runtime error in arrays.

---

# Shallow Copy vs Deep Copy

## Shallow Copy

* Copies references.
* Changes may affect original object.

---

## Deep Copy

* Creates completely independent copies.

---

# Applications of Arrays

* Storing collections of data
* Matrix operations
* Searching algorithms
* Sorting algorithms
* Implementing other data structures

---

# Limitations of Arrays

* Fixed memory size
* Inefficient insertion/deletion
* Cannot directly resize

---

# Common Array Algorithms

* Traversal
* Reversal
* Rotation
* Sorting
* Searching
* Prefix sums
* Sliding window techniques