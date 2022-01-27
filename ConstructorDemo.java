package General.Jan_3;

class Employee1{
    int id;
    int dob;
    float salary;

    public Employee1(int id, int dob, float salary){
        this.id = id;
        this.dob = dob;
        this.salary = salary;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(201,12/12,34000f);
        System.out.println(e1.salary);
        Employee1 e2 = new Employee1(202,1/04,50000f);
        System.out.println(e2.dob);
    }
}
