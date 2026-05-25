//Check if a number is strong number or not

public class Test30 {
    // Using recursion for factorial as per Functions notes.txt
    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    public static boolean isStrong(int n) {
        int originalNumber = n;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 145;
        System.out.println("Is " + number + " a strong number? " + isStrong(number));
    }
}

