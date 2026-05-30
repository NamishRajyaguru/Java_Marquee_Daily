// Decimal to Binary

import java.util.Scanner;

public class DecimalToBinary {

    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        String res = "";
        while (n > 0) {
            int rem = n % 2;
            n /= 2;
            res = res.concat(Integer.toString(rem));
        }
        String rev = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            rev += res.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimalToBinary(n));
        sc.close();
    }
}