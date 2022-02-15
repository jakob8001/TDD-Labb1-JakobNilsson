public class Employee {

    private int ID;
    private static int counter;

public Employee(String Fname, String Ename, int age, double Salary){

        counter = counter + 1;
        ID = counter;
    }

    public int getUniqueID() {
        return ID;
    }
}
