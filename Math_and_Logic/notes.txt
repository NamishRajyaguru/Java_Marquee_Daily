# Math and Logic in Java

* Java provides various built-in methods and operators to perform mathematical and logical operations.
* Logical problem solving often involves manipulating numbers, digits, and using loops and conditions effectively.

---

# The Math Class

* Java provides the `java.lang.Math` class which contains methods for performing basic numeric operations.
* All methods in the Math class are static, so they can be accessed directly using the class name.

---

# Common Math Methods

## Math.max() and Math.min()

* `Math.max(x, y)`: Returns the highest value of x and y.
* `Math.min(x, y)`: Returns the lowest value of x and y.

---

## Math.sqrt()

* `Math.sqrt(x)`: Returns the square root of x.

---

## Math.abs()

* `Math.abs(x)`: Returns the absolute (positive) value of x.

---

## Math.pow()

* `Math.pow(x, y)`: Returns the value of x raised to the power of y.

---

## Math.random()

* `Math.random()`: Returns a random double value between 0.0 (inclusive) and 1.0 (exclusive).

---

# Common Logic Patterns

## Digit Extraction

* A common pattern in logic problems is extracting digits from a number.
* Modulo operator (`% 10`): Extracts the last digit of a number.
* Division operator (`/ 10`): Removes the last digit from a number.

Example:
For number 123:
* `123 % 10` gives 3
* `123 / 10` gives 12

---

## Reversing a Number

* Process of reversing the digits of a number.
* Commonly used to check for Palindromes.

Logic:
1. Initialize reversed = 0
2. Loop while number > 0
3. Extract last digit (digit = number % 10)
4. Append to reversed (reversed = reversed * 10 + digit)
5. Remove last digit (number /= 10)

---

## Prime Number Check

* A number greater than 1 that has only two factors: 1 and itself.

Logic:
* Iterate from 2 to the square root of the number.
* If the number is divisible by any of these, it is not prime.

---

## Even or Odd Check

* Even number: Divisible by 2 (number % 2 == 0).
* Odd number: Not divisible by 2 (number % 2 != 0).

---

## Factorial

* The product of an integer and all the integers below it.
* Example: 5! = 5 * 4 * 3 * 2 * 1 = 120.

Logic:
* Initialize fact = 1.
* Loop from 1 to n, multiplying fact by the loop variable.

---

## Fibonacci Series

* A series of numbers in which each number is the sum of the two preceding ones.
* Starts with 0 and 1.
* Example: 0, 1, 1, 2, 3, 5, 8, 13...

---

## Armstrong Number

* A number that is equal to the sum of cubes of its digits.
* Example: 153 = 1^3 + 5^3 + 3^3.

---

# Bitwise Logic

* Used for manipulating individual bits of a number.
* Can be more efficient than arithmetic operators in some cases.

Examples:
* Bitwise AND (`&`): Used to mask bits or check if a bit is set. (e.g., `num & 1` checks if odd)
* Bitwise OR (`|`): Used to set bits.
* Bitwise XOR (`^`): Used to toggle bits. Useful for swapping two numbers without a temporary variable.
* Left Shift (`<<`): Multiplies a number by 2^n.
* Right Shift (`>>`): Divides a number by 2^n.
