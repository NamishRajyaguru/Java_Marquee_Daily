// Remove Duplicates from Sorted Array

import java.util.*;

public class RemoveDuplicates {

    public static int remove(int[] arr, int n) {

        int j = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[i - 1]) {

                arr[j] = arr[i];

                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int size = remove(arr, n);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}