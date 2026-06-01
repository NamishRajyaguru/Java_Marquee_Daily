// Check palindrome array without extra space complexity

import java.util.Scanner;

public class PalindromeCheck{

    public static boolean check(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            if(arr[i] != arr[arr.length - i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }
}