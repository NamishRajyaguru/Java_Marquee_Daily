public class OperatorsDemo{
    public static void main(String[] args) {
        // int a = 1;
        // int b = a++ + ++a + a++ + a;
        // System.out.println(b);

        // int y = 5;
        // y++;
        // System.out.println(y);
        // System.out.println(y-- + ++y);

        // int x = 5;
        // System.out.println(x++ + ++x * x++);

        // int a = 3;
        // if (a * 2 > 5 || a / 0 > 1){
        //     System.out.println("Safe");
        // }

        // int a = 10;
        // int b = 15;
        // System.out.println(a > b ? "a is great" : "b is great");

        int a = 5;
        int b = 6;
        int c = 7;
        int res = a > b ? a : b;
        System.out.println(res > c ? res : c);
    }
}

