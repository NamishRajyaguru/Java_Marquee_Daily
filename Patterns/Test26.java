// Block staircase pattern

public class Test26{
    public static void main(String[] args){
        int n = 5;
        for(int i = 0; i < n ; i++){
            for(int k = 0; k <= 1; k++){
                for(int j = 0; j < 2 * i; j++){
                    System.out.print("* ");
                }
            System.out.println();
            }
        }
    }
}
