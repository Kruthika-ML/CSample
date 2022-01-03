package General;

class song1{
    int id = 1;
    String name = "Katy";
    int year = 1999;
}

public class Songs {
    public static void main(String[] args) {
        song1 myObj = new song1();
        System.out.println(myObj.id);
        System.out.println(myObj.name);
        System.out.println(myObj.year);
    }
}
