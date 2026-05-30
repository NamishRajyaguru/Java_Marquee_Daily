// Binary to Octal

import java.util.Scanner;

public class BinaryToOctal {

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

    public static int merger(String bin) {
        int octal = 0;
        int place = 1;
        for (int i = bin.length(); i > 0; i -= 3) {
            int start = Math.max(0, i - 3);
            String part = bin.substring(start, i);
            int decimal = binaryToDecimal(part);
            octal += decimal * place;
            place *= 10;
        }
        return octal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();
        System.out.println(merger(bin));
        sc.close();
    }
}