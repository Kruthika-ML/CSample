package General;

abstract class Bank
{
    abstract float getRateOfInterest();

    void display()
    {
        System.out.println("Abstarct class");
    }

}
class SBI1 extends Bank
{
    @Override
    float getRateOfInterest() {
        return 7.0f;
    }

}
class HDFC1 extends Bank
{
    float getRateOfInterest()
    {
        return 6.8f;
    }
}

class ICICI1 extends Bank
{
    float getRateOfInterest()
    {
        return 6.9f;
    }
}
public class abstractDemo {

    public static void main(String[] args) {
        SBI1 obj=new SBI1();
        System.out.println(obj.getRateOfInterest());

        Bank obj1=new ICICI1();
        System.out.println(obj1.getRateOfInterest());


    }
}