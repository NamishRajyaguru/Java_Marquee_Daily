# Pattern Printing in Java

* Pattern printing programs involve printing stars (`*`), numbers, or characters in specific arrangements.
* They are excellent for understanding and practicing nested loops.

---

# Nested Loops

* A loop inside another loop is called a nested loop.
* In pattern printing:
  * The outer loop usually controls the number of rows.
  * The inner loop usually controls the number of columns or elements printed in each row.

---

# Key Concepts for Patterns

* Analyze the pattern to find the relationship between the row number and the number of elements in that row.
* Determine the number of rows (n).
* Determine what needs to be printed (spaces, stars, numbers, letters).

---

# Common Patterns

## 1. Solid Rectangle

* Prints a block of stars with fixed rows and columns.
* Outer loop: `for (int i = 1; i <= rows; i++)`
* Inner loop: `for (int j = 1; j <= cols; j++)`
* Print: `*`

---

## 2. Hollow Rectangle

* Similar to solid rectangle but only boundary stars are printed.
* Condition inside inner loop: 
  * If it's the first row, last row, first column, or last column, print `*`.
  * Else, print space ` `.

---

## 3. Right Half Pyramid

* A triangle where stars increase from 1 to n in each row.

```
*
* *
* * *
* * * *
```

* Outer loop: `for (int i = 1; i <= n; i++)`
* Inner loop: `for (int j = 1; j <= i; j++)`

---

## 4. Inverted Right Half Pyramid

* A triangle where stars decrease from n to 1 in each row.

```
* * * *
* * *
* *
*
```

* Outer loop: `for (int i = n; i >= 1; i--)`
* Inner loop: `for (int j = 1; j <= i; j++)`

---

## 5. Left Half Pyramid

* A triangle aligned to the right. Requires printing spaces before stars.

```
      *
    * *
  * * *
* * * *
```

* Outer loop: controls rows (i).
* Inner loop 1: prints spaces (from 1 to n - i).
* Inner loop 2: prints stars (from 1 to i).

---

## 6. Full Pyramid / Triangle

* A symmetrical triangle of stars.

```
   *
  * *
 * * *
* * * *
```

* Outer loop: rows.
* Inner loop 1: spaces.
* Inner loop 2: stars (usually prints `* ` with a space to make it symmetrical).

---

## 7. Number Patterns

* Instead of stars, the loop variables (`i` or `j`) or a separate counter are printed.

Example 1 (printing row numbers):
```
1
2 2
3 3 3
```
Print `i` in the inner loop.

Example 2 (printing column numbers):
```
1
1 2
1 2 3
```
Print `j` in the inner loop.

Example 3 (Floyd's Triangle, continuous counter):
```
1
2 3
4 5 6
```
Use an external counter variable, print it, and increment.

---

## 8. Character Patterns

* Characters can be printed by typecasting integers to `char` or using `char` loop variables.
* A starts at ASCII value 65, a starts at 97.

Example:
```
A
B B
C C C
```
Print `(char)('A' + i - 1)`.

---

# Advanced Patterns

* Butterfly Pattern
* Diamond Pattern
* Rhombus Pattern
* Pascal's Triangle

These require combining multiple pyramids (e.g., upper half and lower half loops) and careful manipulation of spaces and stars.
