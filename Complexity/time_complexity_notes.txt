# Time Complexity

* Time complexity measures how execution time grows with input size.
* It describes the efficiency of an algorithm.
* Represented using mathematical notation.
* Helps compare algorithms independent of hardware speed.

---

# Why Time Complexity is Important

* Predicts algorithm performance
* Helps choose efficient solutions
* Important for large inputs
* Used heavily in DSA and competitive programming

---

# Input Size

* Usually represented by:

  * `n`
* Larger `n` means larger input.

Example:

* array size
* number of nodes
* number of elements

---

# Constant Time Complexity — O(1)

* Execution time remains constant regardless of input size.
* Fastest complexity type.

Examples:

* array index access
* variable assignment
* stack push/pop

---

# Linear Time Complexity — O(n)

* Execution time grows proportionally with input size.
* Common in single loops.

Examples:

* array traversal
* linear search

---

# Quadratic Time Complexity — O(n²)

* Time grows proportional to square of input size.
* Common in nested loops.

Examples:

* bubble sort
* selection sort
* pair comparisons

---

# Cubic Time Complexity — O(n³)

* Triple nested loops.
* Very slow for large inputs.

Examples:

* some matrix operations
* brute-force triplets

---

# Logarithmic Time Complexity — O(log n)

* Input size reduces repeatedly.
* Extremely efficient.

Examples:

* binary search
* balanced BST operations

---

# Linearithmic Time Complexity — O(n log n)

* Combination of linear and logarithmic growth.
* Common in efficient sorting algorithms.

Examples:

* merge sort
* heap sort
* quicksort average case

---

# Exponential Time Complexity — O(2ⁿ)

* Time doubles with each additional input.
* Extremely inefficient for large inputs.

Examples:

* recursive Fibonacci
* brute-force subset generation

---

# Factorial Time Complexity — O(n!)

* Worst common complexity.
* Generates all permutations/combinations.

Examples:

* permutation problems
* traveling salesman brute force

---

# Big O Notation

* Represents worst-case complexity.
* Describes upper bound of running time.
* Most commonly used notation.

---

# Big Omega Notation — Ω

* Represents best-case complexity.
* Describes minimum time required.

---

# Big Theta Notation — Θ

* Represents exact bound.
* Best and worst cases grow similarly.

---

# Best Case Complexity

* Minimum execution time possible.

Example:

* searching first element in linear search

---

# Worst Case Complexity

* Maximum execution time possible.

Example:

* searching last element in linear search

---

# Average Case Complexity

* Expected execution time over all inputs.

---

# Space Complexity

* Measures memory usage of an algorithm.
* Includes:

  * variables
  * arrays
  * recursion stack
  * auxiliary memory

---

# Auxiliary Space

* Extra memory used excluding input storage.

---

# Time Complexity of Common Operations

| Operation             | Complexity   |
| --------------------- | ------------ |
| Array Access          | O(1)         |
| Linear Search         | O(n)         |
| Binary Search         | O(log n)     |
| Array Insertion       | O(n)         |
| Array Deletion        | O(n)         |
| HashMap Access        | O(1) average |
| Stack Push/Pop        | O(1)         |
| Queue Enqueue/Dequeue | O(1)         |

---

# Time Complexity of Loops

## Single Loop

* Usually:

  * O(n)

---

## Nested Loops

* Usually:

  * O(n²)

---

## Loop Halving Input

Example:

* divide by 2 each iteration

Complexity:

* O(log n)

---

# Rules for Calculating Time Complexity

## Ignore Constants

Example:

```text id="ljlwm5"
O(2n) → O(n)
```

---

## Ignore Lower Order Terms

Example:

```text id="0jlwmp"
O(n² + n + 1) → O(n²)
```

---

## Sequential Loops Add

Example:

* one O(n) loop
* another O(n) loop

Result:

```text id="djlwm6"
O(2n) → O(n)
```

---

## Nested Loops Multiply

Example:

* outer loop O(n)
* inner loop O(n)

Result:

```text id="9jlwmx"
O(n²)
```

---

# Amortized Complexity

* Average cost over multiple operations.
* Important in dynamic arrays and hash tables.

Example:

* ArrayList insertion:

  * usually O(1)
  * occasional resizing O(n)

Overall amortized:

```text id="xjlwm4"
O(1)
```

---

# Recursion and Time Complexity

* Recursive calls contribute to complexity.
* Depends on:

  * number of calls
  * work per call

---

# Recursion Stack Space

* Recursive functions use stack memory.
* Deep recursion increases space complexity.

---

# Complexity Hierarchy (Fastest to Slowest)

```text id="5jlwmd"
O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(n³)
O(2ⁿ)
O(n!)
```

---

# Complexity of Popular Sorting Algorithms

| Algorithm      | Best       | Average    | Worst      |
| -------------- | ---------- | ---------- | ---------- |
| Bubble Sort    | O(n)       | O(n²)      | O(n²)      |
| Selection Sort | O(n²)      | O(n²)      | O(n²)      |
| Insertion Sort | O(n)       | O(n²)      | O(n²)      |
| Merge Sort     | O(n log n) | O(n log n) | O(n log n) |
| Quick Sort     | O(n log n) | O(n log n) | O(n²)      |
| Heap Sort      | O(n log n) | O(n log n) | O(n log n) |

---

# Complexity of Common Data Structures

| Data Structure | Access           | Search           | Insertion        | Deletion         |
| -------------- | ---------------- | ---------------- | ---------------- | ---------------- |
| Array          | O(1)             | O(n)             | O(n)             | O(n)             |
| Linked List    | O(n)             | O(n)             | O(1)             | O(1)             |
| Stack          | O(n)             | O(n)             | O(1)             | O(1)             |
| Queue          | O(n)             | O(n)             | O(1)             | O(1)             |
| HashMap        | N/A              | O(1) average     | O(1) average     | O(1) average     |
| BST            | O(log n) average | O(log n) average | O(log n) average | O(log n) average |

---

# Common Complexity Patterns

## Two Pointer Technique

* Often:

  * O(n)

---

## Sliding Window

* Often:

  * O(n)

---

## Divide and Conquer

* Often:

  * O(n log n)

---

## Backtracking

* Often exponential or factorial.

---

# TLE (Time Limit Exceeded)

* Occurs when algorithm is too slow for constraints.
* Usually caused by:

  * nested loops
  * brute force
  * redundant computations

---

# Optimization Techniques

* Prefix sums
* Hashing
* Binary search
* Sliding window
* Dynamic programming
* Greedy algorithms
* Memoization

---

# Important Points

* Bigger complexity dominates smaller terms.
* Efficient algorithms matter more as input size grows.
* Lower complexity usually means better scalability.
* Time complexity is independent of programming language syntax.

---

# Practical DSA Insight

| Input Size | Preferred Complexity   |
| ---------- | ---------------------- |
| n ≤ 10     | Exponential acceptable |
| n ≤ 100    | O(n³) possible         |
| n ≤ 10³    | O(n²) acceptable       |
| n ≤ 10⁵    | O(n log n) or O(n)     |
| n ≤ 10⁶    | Usually O(n) required  |