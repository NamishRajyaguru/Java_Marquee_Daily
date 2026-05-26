// Binary to Decimal

import java.util.Scanner;

public class BinaryToDecimal {

    public static int binaryToDecimal(String bin) {
        int n = bin.length();
        int res = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (bin.charAt(n - i - 1) == '1') {
                res += Math.pow(2, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();
        System.out.println(binaryToDecimal(bin));
    }
}