public class StaticVariableMethod {
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
        StaticVariableMethod obj = new StaticVariableMethod();
        obj.stat();
        stat2();
    }
}

