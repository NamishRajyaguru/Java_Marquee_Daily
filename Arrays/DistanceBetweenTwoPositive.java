// Shortest Distance between two positive even integers

import java.util.Scanner;

public class DistanceBetweenTwoPositive {

    public static int findDistance(int[] arr) {
        int dist = -1;
        int left = 0;
        int right = 1;
        
        while (right < arr.length) {
            if (!(arr[left] > 0 && arr[left] % 2 == 0)) {
                left++;
                if (left == right) {
                    right++;
                }
                continue;
            }
            
            if (!(arr[right] > 0 && arr[right] % 2 == 0)) {
                right++;
                continue;
            }
            
            if (dist == -1 || right - left < dist) {
                dist = right - left;
            }
            
            left = right;
            right++;
        }
        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findDistance(arr));
        sc.close();
    }
}