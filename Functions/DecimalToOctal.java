// Decimal To Octal

import java.util.Scanner;

public class DecimalToOctal{

    public static String decimalToOctal(int n) {
        if (n == 0) return "0";
        String res = "";
        while (n > 0) {
            int rem = n % 8;
            n /= 8;
            res += rem;
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
        decimalToOctal(n);
    }
}