package General.Dec_30;

public class variablesDemo {
    final static int a = 1024;
    int b;
    void func(){
        final int c = 10;
        System.out.println("class variables "+a+" "+b);
        System.out.println("local variables" +c);
        b = 56;
        System.out.println("class variables "+a+" "+b);
    }

    void func2(){
        System.out.println("class variables "+a+" "+b);
    }

    public static void main(String[] args) {
        variablesDemo obj = new variablesDemo();
        System.out.println(obj.b);
        System.out.println(variablesDemo.a);
    }

}
