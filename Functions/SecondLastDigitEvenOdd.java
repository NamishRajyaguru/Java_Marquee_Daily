// Second last digit is even or odd

import java.util.Scanner;

public class SecondLastDigitEvenOdd{

    public static boolean lastSecondEvenOrOdd(int n){
        if(n < 10){
            return false;
        }
        n /= 10;
        return (n % 10) % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(lastSecondEvenOrOdd(n));
    }
}