//Count the frequency of the digit

public class Test03 {
    public static int countFrequency(int n, int dig) {
        int count = 0;
        n = Math.abs(n);
        
        if (n == 0 && dig == 0) {
            return 1;
        }
        
        while (n > 0) {
            int currentDigit = n % 10;
            if (currentDigit == dig) {
                count++;
            }
            n /= 10;
        }
        
        return count;
    }

    public static void main(String[] args) {
        int number = 123242;
        int digitToCount = 2;
        System.out.println("Frequency of " + digitToCount + " in " + number + " is: " + countFrequency(number, digitToCount));
    }
}


