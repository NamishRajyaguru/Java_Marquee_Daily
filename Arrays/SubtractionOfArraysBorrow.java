// Subtraction Of Arrays with borrow

import java.util.*;

public class SubtractionOfArraysBorrow {

    public static int[] subtract(int[] a, int[] b, int n, int m) {
        int i = n - 1;
        int j = m - 1;
        boolean borrow = false;
        int size = Math.max(n, m);
        int[] res = new int[size];
        int k = size - 1;

        while (i >= 0 || j >= 0) {
            int x = (i >= 0) ? a[i] : 0;
            int y = (j >= 0) ? b[j] : 0;
            if (borrow) {
                x--;
            }
            if (x < y) {
                res[k] = x + 10 - y;
                borrow = true;
            } else {
                res[k] = x - y;
                borrow = false;
            }
            i--;
            j--;
            k--;
        }

        if (res[0] == 0) {
            int[] temp = new int[size - 1];
            for (int p = 0; p < size - 1; p++) {
                temp[p] = res[p + 1];
            }
            return temp;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(subtract(a, b, n, m)));
    }
}