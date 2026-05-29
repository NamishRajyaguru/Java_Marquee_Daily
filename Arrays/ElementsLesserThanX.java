// Elements less than x

import java.util.Scanner;

public class ElementsLesserThanX{

    public static int count(int[] arr, int x){
        int count = 0;
        for(int i : arr){
            if(i < x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        count(arr, x);
    }
}