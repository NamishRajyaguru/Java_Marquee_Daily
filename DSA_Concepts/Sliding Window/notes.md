# Sliding Window Technique

* Sliding window is an optimization technique used for arrays and strings.
* Converts nested loop problems into linear time solutions.
* Mainly used for:

  * contiguous subarrays
  * substrings
  * ranges/windows

---

# Why Sliding Window is Important

* Reduces time complexity from:

```text id="1’winin"
O(n²)
```

to:

```text id="r’wini8"
O(n)
```

in many problems.

* Very common in interviews and DSA.

---

# Core Idea

Instead of recalculating every subarray:

* maintain a window
* slide it efficiently

---

# What is a Window?

A window is a continuous range of elements.

Example:

```text id="v’wini5"
[1,2,3,4,5]
```

Window of size 3:

```text id="3jlwmp"
[1,2,3]
[2,3,4]
[3,4,5]
```

---

# Types of Sliding Window

## Fixed Size Window

* Window size remains constant.

Examples:

* maximum sum subarray of size k
* average of subarrays

---

## Variable Size Window

* Window size changes dynamically.

Examples:

* longest substring without repeating characters
* smallest subarray with given sum

---

# Fixed Size Sliding Window

## Brute Force

For every window:

* recalculate everything

Complexity:

```text id="8’winiq"
O(n*k)
```

---

## Sliding Window Optimization

* Remove outgoing element
* Add incoming element

Complexity:

```text id="7jlwmu"
O(n)
```

---

# Fixed Window Formula

```text id="x’wini4"
windowSum += incoming
windowSum -= outgoing
```

---

# Example

Array:

```text id="5jlwmd"
[1,2,3,4,5]
```

k = 3

---

## First window

```text id="1’winin"
1+2+3 = 6
```

---

## Slide window

Remove:

```text id="r’wini8"
1
```

Add:

```text id="v’wini5"
4
```

New sum:

```text id="3jlwmp"
9
```

---

# Variable Size Sliding Window

* Window grows/shrinks based on condition.

Usually uses:

```text id="8’winiq"
left
right
```

pointers.

---

# Variable Window Workflow

1. Expand right pointer
2. Check condition
3. Shrink left pointer if needed

---

# Common Variable Window Problems

* longest unique substring
* smallest subarray sum
* longest repeating character replacement
* fruit into baskets

---

# Sliding Window vs Two Pointers

## Sliding Window

* Special type of two pointers.
* Focuses on contiguous ranges.

---

## Two Pointers

* Broader concept.
* Pointers may move independently.

---

# Common Sliding Window Problems

## Maximum Sum Subarray of Size K

* Fixed window.

---

## First Negative Number in Window

* Fixed window + queue.

---

## Longest Substring Without Repeating Characters

* Variable window + HashSet/HashMap.

---

## Minimum Window Substring

* Variable window.

---

## Longest Ones After Replacement

* Variable window.

---

# Time Complexity Advantage

## Brute Force

```text id="7jlwmu"
O(n²)
```

---

## Sliding Window

```text id="x’wini4"
O(n)
```

because each element usually enters/exits window once.

---

# Space Complexity

* Usually:

```text id="5jlwmd"
O(1)
```

or:

```text id="1’winin"
O(k)
```

depending on helper structures.

---

# Key Recognition Patterns

Think sliding window when problem mentions:

* subarray
* substring
* contiguous
* range
* window
* consecutive elements

---

# Fixed Window Template

```text id="r’wini8"
1. Calculate first window
2. Slide window
3. Remove left element
4. Add right element
```

---

# Variable Window Template

```text id="v’wini5"
while(right < n){

    expand window

    while(condition invalid){
        shrink window
    }

    update answer
}
```

---

# Important Sliding Window Variables

| Variable | Purpose            |
| -------- | ------------------ |
| left     | start of window    |
| right    | end of window      |
| sum      | current window sum |
| count    | frequencies        |
| max/min  | answer tracking    |

---

# Sliding Window with Hashing

Often combined with:

* HashMap
* HashSet

Used for:

* frequencies
* duplicate tracking
* character counting

---

# Common Mistakes

## Forgetting to Remove Outgoing Element

Window becomes incorrect.

---

## Wrong Window Size

Incorrect pointer movement.

---

## Infinite Loops

Forgetting to move pointers.

---

## Updating Answer at Wrong Time

Especially in variable windows.

---

# Sliding Window Complexity Insight

Each element:

* enters window once
* exits window once

So total operations often become:

```text id="3jlwmp"
O(n)
```

NOT:

```text id="8’winiq"
O(n²)
```

---

# Sliding Window vs Prefix Sum

| Sliding Window                   | Prefix Sum                         |
| -------------------------------- | ---------------------------------- |
| Dynamic ranges                   | Fast range sum queries             |
| Good for contiguous optimization | Good for repeated sum calculations |

---

# Sliding Window Limitations

* Mostly works for contiguous ranges.
* Some conditions require monotonic queues/deques.
* Harder with negative numbers in some sum problems.

---

# Advanced Sliding Window Concepts

## Monotonic Queue

Used in:

* sliding window maximum

---

## Dynamic Frequency Tracking

Used in:

* longest unique substring
* anagrams

---

## Sliding Window + Binary Search

Used in optimization problems.

---

# Beginner Progression

1. Fixed window sum
2. Maximum average subarray
3. First negative in window
4. Longest substring without repeating
5. Minimum window substring
6. Sliding window maximum

---

# Core Mental Model

Instead of:

```text id="7jlwmu"
recompute every subarray
```

think:

```text id="x’wini4"
reuse previous computation
```

That is the heart of sliding window optimization.