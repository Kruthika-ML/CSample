package General;

class Animal{
    int legs;
    String name;
    String color;

    public Animal(){
        System.out.println("This is a default constructor");
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name,String color){
        this.name = name;
        this.color = color;
    }

    public Animal(int legs, String name, String color){
        this(name, color);
        this.legs = legs;
    }

    void display(){
        System.out.println("Animal description: ");
        System.out.println(name+" "+color+" "+legs);
    }

}

public class thisDemo {
    public static void main(String[] args) {
        Animal myObj = new Animal(4,"Cat","White");
        myObj.display();
    }
}
