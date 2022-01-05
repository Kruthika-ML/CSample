package General;

class bank1{
    float getROI(){
        return 6.7f;
    }
}
class SBI extends bank1{
    float getROI() {
        return 6.8f;
    }
}
class HDFC extends bank1{
    float getROI() {
        return 6.9f;
    }
}
class ICICI extends bank1{
    float getROI() {
        return 6.4f;
    }
}

public class bank {
    public static void main(String[] args) {
        SBI obj = new SBI();
        System.out.println(obj.getROI());
        HDFC obj1 = new HDFC();
        System.out.println(obj1.getROI());

        bank1 obj2 = new ICICI();
        System.out.println(obj2.getROI());
    }
}
