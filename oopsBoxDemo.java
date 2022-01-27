package General.Dec_30;
class Box{
    float height;
    float width;
    float breadth;

    float calcValue(){
    return height*width*breadth;
    }
}


public class oopsBoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.breadth = 3.4f;
        box1.width = 5.6f;
        box1.height= 3.1f;
        float vol = box1.calcValue();
        System.out.println(vol);
    }
}
