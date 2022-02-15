public class Employee {

    private int ID;
    private static int counter;
    private String Fname;

public Employee(String Fname, String Ename, int age, double Salary){

        counter = counter + 1;
        ID = counter;

        this.Fname = Fname;
    }

    public int getUniqueID() {
        return ID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String newFname) {
        Fname = newFname;
    }
}
