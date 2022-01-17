package General;

public class conditionsDemo {

    public static void main(String[] args) {

        int x = 10;
        int y = 11;

        if (!(x<y)||(x==y)) {                               //x>y && x!=y
            System.out.println("COndition is true");
        }
        else
        {
            System.out.println("Condition is false");
        }
    }
}

