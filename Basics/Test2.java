public class Test2 {
    static int a = 5;
    public void stat(){
        a++;
        System.out.println(a);
    }
    public static void stat2(){
        System.out.println(a);
    }
    public static void main(String[] args){
        // stat(); gives error
        Test1 obj = new Test1();
        obj.stat();
        stat2();
    }
}
