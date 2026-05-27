// Binary Search

import java.util.Scanner;

public class BinarySearch{

    public static boolean binarySearch(int[] arr, int target, int n){
        int high = arr.length - 1;
        int low = 0;
        while (low <= high){
            int mid = (high + low) / 2;
            if(arr[mid] == target){
                return true;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }

    public static int binarySearchIndex(int[] arr, int target, int n){
        int high = arr.length - 1;
        int low = 0;
        while (low <= high){
            int mid = (high + low) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target, n));
        System.out.println(binarySearchIndex(arr, target, n));
    }
}