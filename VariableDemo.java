package General;

public class VariableDemo {
    final static int a = 1024;
    int b;
    void func1(){
        final int c;
        c =10;
        System.out.println("class variables "+a+" "+b);
        System.out.println("Local variables " +c);
        b = 56;
        System.out.println("Class variables "+a+ " "+b);
    }

    void func2(){
        System.out.println("Class variables "+a+ " "+b);
    }

    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        System.out.println(obj.b);
        System.out.println(VariableDemo.a);
    }
}
