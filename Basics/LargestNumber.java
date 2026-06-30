// Ternary Operator

import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int largest = n > m ? n : m;
        System.out.println("Largest : " + largest);
    }
}