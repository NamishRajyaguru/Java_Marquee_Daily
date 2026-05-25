// Staircase Pattern

public class StaircasePattern {
    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n; i++) {

            // spaces
            for (int s = 0; s < i * 2; s++) {
                System.out.print(" ");
            }

            // top step
            System.out.println("* *");

            // vertical part
            for (int j = 0; j < 2; j++) {

                for (int s = 0; s < i * 2 + 2; s++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }
        }
    }
}

