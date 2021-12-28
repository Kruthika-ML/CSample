package General;

public class Demo1 {
    //class variable
    int a = 1024;
    int b;

    void func1()
    {
        int c;
        c=10;
        System.out.println("class variables " +a+ " "+b);
        System.out.println("local variable " +c);
        a = 7890;
        b = 56;
    }

    void func2()
    {
        func1();
    }

    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.func1();
        obj.func2();
    }
}
