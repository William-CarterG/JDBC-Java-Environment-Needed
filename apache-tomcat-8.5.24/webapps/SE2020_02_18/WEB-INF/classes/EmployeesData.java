import java.util.Vector;

public class EmployeesData  {
    int    employeeId;
    String lastName;
    String firstName;
    int    extension;
    String image;

    EmployeesData (int    employeeId, String lastName, String firstName, int extension, String image) {
        this.employeeId = employeeId;
        this.lastName   = lastName;
        this.firstName  = firstName;
        this.extension  = extension;
        this.image  = image;
    }
    public static Vector<EmployeesData> getEmployeesList() {
        Vector<EmployeesData> vec = new Vector<EmployeesData>();
        vec.addElement(new EmployeesData(1, "Davolio", "Nancy", 5467, "empF47630.jpg"));
        vec.addElement(new EmployeesData(2, "Fuller", "Andrew", 3457, "empM48612.jpg"));
        vec.addElement(new EmployeesData(3, "Leverling", "Janet", 3355, "empF42968.jpg"));
        vec.addElement(new EmployeesData(4, "Peacock", "Margaret", 5176, "empF96373.jpg"));
        vec.addElement(new EmployeesData(5, "Buchanan", "Steven", 3453, "empM64341.jpg"));
        return vec;
    }
    public static EmployeesData getEmployee(int i) {
        return getEmployeesList().elementAt(i - 1);
    }
    
}