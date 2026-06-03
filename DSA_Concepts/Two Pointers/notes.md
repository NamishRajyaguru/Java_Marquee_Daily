# Two Pointers Technique

* Two pointers is an optimization technique used mainly for arrays and strings.
* Uses two variables (pointers) to traverse data structures.
* Helps reduce time complexity from O(n²) to O(n) in many problems.

---

# Why Two Pointers Technique is Important

* Reduces unnecessary computations
* Improves efficiency
* Common in interviews and DSA
* Frequently used in:

  * arrays
  * strings
  * linked lists

---

# Basic Idea

* Use two indices/pointers instead of nested loops.
* Move pointers according to conditions.

---

# Types of Two Pointer Approaches

## Opposite Direction Pointers

* One pointer starts from beginning.
* Other pointer starts from end.

Used in:

* pair sum
* palindrome checking
* array reversal

---

## Same Direction Pointers

* Both pointers move forward.
* One pointer usually lags behind.

Used in:

* sliding window
* removing duplicates
* subarray problems

---

# Common Applications

## Pair Sum Problems

* Find two numbers satisfying a condition.

Example:

```text id="r’wini8"
arr[i] + arr[j] == target
```

---

## Array Reversal

* Swap elements from both ends.

Complexity:

```text id="v’wini5"
O(n)
```

---

## Palindrome Checking

* Compare characters from both ends.

---

## Removing Duplicates

* One pointer tracks unique elements.
* Other scans array.

---

## Merging Sorted Arrays

* Traverse multiple arrays efficiently.

---

## Sliding Window Problems

* Dynamic subarray processing.

---

# Opposite Direction Technique

## Working

1. Start:

   * left pointer at beginning
   * right pointer at end
2. Compare/process values
3. Move pointers based on condition

---

# Example Pattern

```text id="3jlwmp"
left++
right--
```

---

# Same Direction Technique

## Working

* Fast pointer moves ahead
* Slow pointer tracks required position

---

# Example Pattern

```text id="8’winiq"
slow++
fast++
```

---

# Time Complexity Advantage

## Brute Force

* Often:

```text id="7jlwmu"
O(n²)
```

---

## Two Pointers

* Often:

```text id="x’wini4"
O(n)
```

---

# Space Complexity

* Usually:

```text id="5jlwmd"
O(1)
```

because no extra data structures are used.

---

# Conditions for Using Two Pointers

* Data structure usually linear:

  * array
  * string
  * linked list

* Often works best when:

  * array is sorted
  * searching pairs/subarrays
  * contiguous processing needed

---

# Two Pointers in Sorted Arrays

* Extremely powerful with sorted arrays.
* Pointer movement becomes predictable.

Example:

```text id="1’winin"
sum too small -> move left
sum too large -> move right
```

---

# Common Pointer Movement Logic

## Sum Too Small

```text id="r’wini8"
left++
```

Increase total.

---

## Sum Too Large

```text id="v’wini5"
right--
```

Decrease total.

---

# Fast and Slow Pointer Technique

* Special type of two pointers.

Used in:

* linked list cycle detection
* middle node finding
* duplicate removal

---

# Floyd’s Cycle Detection Algorithm

* Uses:

  * slow pointer
  * fast pointer

Fast moves twice as fast.

Used for:

* detecting loops in linked lists

---

# Sliding Window vs Two Pointers

## Sliding Window

* Special case of two pointers.
* Maintains dynamic range/window.

---

## General Two Pointers

* Broader technique.
* Pointers may move independently.

---

# Common Problems Solved Using Two Pointers

* Two Sum in sorted array
* Reverse array/string
* Container With Most Water
* Remove duplicates
* Move zeroes
* Trapping rainwater
* Merge sorted arrays
* Palindrome validation

---

# Two Pointers in Linked Lists

Used for:

* detecting cycles
* finding middle node
* nth node from end

---

# Advantages of Two Pointers

* Faster than brute force
* Constant extra space
* Elegant and readable
* Efficient for sequential data

---

# Limitations of Two Pointers

* Not useful for all problems
* Often requires sorted data
* Pointer movement logic can become tricky

---

# Common Mistakes

## Infinite Loops

* Forgetting to move pointers.

---

## Wrong Pointer Updates

* Moving wrong pointer under wrong condition.

---

## Out of Bounds Errors

* Invalid pointer indices.

---

## Missing Edge Cases

Examples:

* empty arrays
* single-element arrays
* duplicates

---

# Two Pointers vs Nested Loops

| Nested Loops     | Two Pointers        |
| ---------------- | ------------------- |
| Usually O(n²)    | Usually O(n)        |
| Brute force      | Optimized traversal |
| More comparisons | Fewer comparisons   |

---

# Two Pointers Complexity Patterns

| Problem Type    | Complexity |
| --------------- | ---------- |
| Reverse array   | O(n)       |
| Pair sum sorted | O(n)       |
| Sliding window  | O(n)       |
| Merge arrays    | O(n + m)   |

---

# Important Insight

Two pointers work because:

* pointers never unnecessarily revisit elements
* traversal becomes controlled and directional

---

# Key DSA Recognition Pattern

Think of two pointers when:

* problem involves pairs
* searching ranges/subarrays
* sorted arrays
* reversing/swapping
* contiguous segments
* minimizing nested loops

---

# Mental Model

Instead of:

```text id="3jlwmp"
check everything against everything
```

two pointers try:

```text id="8’winiq"
move intelligently toward answer
```

---

# Beginner Trap

Many beginners:

* memorize pointer patterns
* fail to understand WHY pointers move

The real skill is:

```text id="7jlwmu"
deciding movement conditions
```

That is the heart of the technique.