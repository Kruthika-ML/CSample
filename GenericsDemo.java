package General.Dec_22;

class GenericTest<T>
{
    T obj;
    void add(T obj)
    {
        this.obj=obj;
    }

    T get()
    {
        return obj;
    }
}

public class GenericsDemo {

    public static void main(String[] args) {
        GenericTest<Integer> obj=new GenericTest<Integer>();
        obj.add(2);
        System.out.println(obj.get());
    }

}