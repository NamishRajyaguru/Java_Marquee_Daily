// Move Zeroes

import java.util.*;

public class MoveZeroes {

    public static void move(int[] arr, int n) {

        int j = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        move(arr, n);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}