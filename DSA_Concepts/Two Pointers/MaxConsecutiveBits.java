// Max Consecutive Bits

import java.util.*;

public class MaxConsecutiveBits {

    public static int maxBits(int[] arr, int n) {

        int max = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            }

            else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        return Math.max(max, count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxBits(arr, n));

        sc.close();
    }
}