// Hexa to Decimal

import java.util.Scanner;

public class HexaToDecimal{

    public static int hexaToDecimal(String hex) {
        String digits = "0123456789ABCDEF";
        int n = hex.length();
        int res = 0;
        hex = hex.toUpperCase();
        for (int i = n - 1; i >= 0; i--) {
            char c = hex.charAt(n - i - 1);
            int value = digits.indexOf(c);
            res += value * Math.pow(16, i);
        }
        return res;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexa = sc.nextLine();
        System.out.println(hexaToDecimal(hexa));
    }
}