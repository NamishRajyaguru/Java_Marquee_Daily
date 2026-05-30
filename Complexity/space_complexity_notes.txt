# Space Complexity

* Space complexity measures the total memory used by an algorithm.
* Includes:

  * input storage
  * variables
  * auxiliary memory
  * recursion stack
* Helps evaluate memory efficiency of programs.

---

# Why Space Complexity is Important

* Systems have limited memory.
* Efficient memory usage improves performance.
* Important for:

  * large datasets
  * recursion
  * embedded systems
  * competitive programming

---

# Components of Space Complexity

## Input Space

* Memory required to store input data.

Example:

* arrays
* matrices
* strings

---

## Auxiliary Space

* Extra memory used excluding input storage.

Examples:

* temporary arrays
* recursion stack
* helper data structures

---

# Total Space Complexity

```text id="xjlwm9"
Total Space = Input Space + Auxiliary Space
```

---

# Constant Space Complexity — O(1)

* Memory usage remains fixed regardless of input size.

Examples:

* swapping variables
* basic arithmetic operations
* iterative factorial

---

# Linear Space Complexity — O(n)

* Memory usage grows proportionally with input size.

Examples:

* storing another array
* recursion stack in linear recursion

---

# Quadratic Space Complexity — O(n²)

* Space grows as square of input size.

Examples:

* adjacency matrix
* 2D matrices

---

# Logarithmic Space Complexity — O(log n)

* Memory grows logarithmically.

Examples:

* binary search recursion stack
* balanced recursive divide-and-conquer

---

# Space Complexity of Variables

## Primitive Variables

* Usually constant space:

  * O(1)

---

## Arrays

* Space proportional to number of elements:

  * O(n)

---

## Matrices

* Space proportional to rows × columns:

  * O(n²)

---

# Space Complexity of Recursion

* Every recursive call creates a stack frame.
* Deep recursion increases memory usage.

---

# Recursive Stack Space

## Linear Recursion

Example:

* factorial recursion

Space:

```text id="5jlwmd"
O(n)
```

---

## Binary Recursion

Example:

* recursive Fibonacci

Space depends on maximum recursion depth.

---

# Tail Recursion

* Recursive call occurs as last operation.
* Some languages optimize tail recursion.
* Java does NOT guarantee tail recursion optimization.

---

# Space Complexity of Common Data Structures

| Data Structure           | Space Complexity |
| ------------------------ | ---------------- |
| Array                    | O(n)             |
| Linked List              | O(n)             |
| Stack                    | O(n)             |
| Queue                    | O(n)             |
| HashMap                  | O(n)             |
| Tree                     | O(n)             |
| Graph (Adjacency Matrix) | O(n²)            |
| Graph (Adjacency List)   | O(V + E)         |

---

# In-Place Algorithms

* Algorithms using constant auxiliary memory.
* Modify original data structure directly.

Examples:

* bubble sort
* selection sort
* two-pointer reversal

Space:

```text id="1jlwmn"
O(1)
```

---

# Out-of-Place Algorithms

* Require extra memory.

Examples:

* merge sort
* copying arrays

---

# Space Complexity of Common Algorithms

| Algorithm               | Space Complexity |
| ----------------------- | ---------------- |
| Linear Search           | O(1)             |
| Binary Search Iterative | O(1)             |
| Binary Search Recursive | O(log n)         |
| Bubble Sort             | O(1)             |
| Selection Sort          | O(1)             |
| Insertion Sort          | O(1)             |
| Merge Sort              | O(n)             |
| Quick Sort              | O(log n) average |
| BFS                     | O(n)             |
| DFS Recursive           | O(n)             |

---

# Dynamic Memory Allocation

* Memory allocated during runtime.
* Used in:

  * ArrayList
  * Linked Lists
  * Trees
  * Graphs

---

# Memory Allocation Areas in Java

## Stack Memory

Stores:

* local variables
* method calls
* recursion frames

Characteristics:

* fast
* automatic cleanup
* limited size

---

## Heap Memory

Stores:

* objects
* arrays
* instance variables

Characteristics:

* larger memory
* managed by garbage collector

---

# Garbage Collection

* Java automatically frees unused heap memory.
* Removes unreachable objects.

---

# Memory Leak

* Occurs when memory remains allocated unnecessarily.
* Usually caused by lingering references.

---

# Auxiliary Space vs Space Complexity

## Auxiliary Space

* Extra memory excluding input.

---

## Space Complexity

* Includes total memory consumption.

---

# Space Complexity of Loops

## Iterative Loops

* Usually:

  * O(1)

unless additional structures are created.

---

## Nested Loops

* Nested loops alone do NOT increase space complexity.
* Only additional memory matters.

Example:

```text id="rjlwm8"
nested loops with no extra arrays = O(1) space
```

---

# Time Complexity vs Space Complexity

| Time Complexity         | Space Complexity      |
| ----------------------- | --------------------- |
| Measures execution time | Measures memory usage |
| Focuses on speed        | Focuses on memory     |
| Affected by operations  | Affected by storage   |

---

# Trade-off Between Time and Space

* Faster algorithms may use more memory.
* Memory-efficient algorithms may be slower.

Examples:

* HashMap speeds up search using extra memory.
* Brute force may use less memory but more time.

---

# Common Space Optimization Techniques

* Two pointers
* Sliding window
* In-place modification
* Iterative solutions instead of recursion
* Bit manipulation
* State compression

---

# Recursion vs Iteration

| Recursion                | Iteration                 |
| ------------------------ | ------------------------- |
| Uses stack memory        | Usually constant memory   |
| Cleaner for trees/graphs | More memory efficient     |
| Risk of stack overflow   | Safer for deep operations |

---

# Stack Overflow

* Occurs when recursion depth exceeds stack capacity.
* Common in infinite or very deep recursion.

---

# Important Complexity Insights

* Arrays consume contiguous memory.
* Linked lists use extra pointer memory.
* HashMaps require bucket storage.
* Recursive solutions often increase stack usage.

---

# Practical DSA Space Guidelines

| Input Size              | Preferred Space          |
| ----------------------- | ------------------------ |
| Small inputs            | Higher space acceptable  |
| Large inputs            | Prefer O(1) or O(n)      |
| Competitive programming | Avoid unnecessary arrays |

---

# Space Complexity Hierarchy

```text id="vjlwm5"
O(1)
O(log n)
O(n)
O(n log n)
O(n²)
```

Lower space complexity generally means better memory efficiency.

---

# Common Beginner Misconceptions

## Nested loops always mean O(n²) space

False.

* Nested loops affect time complexity.
* Space depends on extra memory used.

---

## Recursion only affects time complexity

False.

* Recursion also consumes stack space.

---

## Arrays use O(1) space

False.

* Arrays use O(n) space because storage scales with size.

---

# Key DSA Insight

Efficient programming is not only about speed.

A good solution balances:

* time complexity
* space complexity
* readability
* scalability