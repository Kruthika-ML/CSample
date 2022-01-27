package General.Jan_3;
class Employee{
    int id;
    int dob;
    float salary;

}
public class OOPSEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.dob = 25/11;
        e1.id = 909;
        e1.salary = 56000.00f;

        Employee e2 = new Employee();
        e2.dob = 29/11;
        e2.id = 908;
        e2.salary = 73000.00f;

        Employee e3 = new Employee();
        e3.dob = 26/6;
        e3.id = 69;
        e3.salary = 25000000f;

        System.out.println(e1.salary);
        System.out.println(e2.dob);
        System.out.println(e3.id);
        System.out.println(e1.dob);
    }
}
