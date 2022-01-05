package General;

public class methodOverloading {

    int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    float add(float a, float b){
        float sum = a+b;
        return sum;
    }

    float add(int a, float b, int c){
        float sum = a+b+c;
        return sum;
    }

    float add(float a, int b, int c){
        float sum = a+b+c;
        return sum;
    }

    public static void main(String[] args) {
        methodOverloading myObj = new methodOverloading();
        System.out.println(myObj.add(10,20));
        System.out.println(myObj.add(3.34f,7.89f));
        System.out.println(myObj.add(2,4.45f,6));
    }
}
