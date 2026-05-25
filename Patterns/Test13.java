// Reverse Hollow Pyramid

public class Test13{
    public static void main(String[] args){
        int n = 5;
        for(int i = n - 1; i >= 0; i--){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                if (i == 0 || i == n - 1){
                    System.out.print("* ");
                }
                else if ((k == 0 || k == i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

