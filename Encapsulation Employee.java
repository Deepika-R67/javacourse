public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeLocation;

    public void setEmployeeId(int id) {
        employeeId = id;
    }

    public void setEmployeeName(String name) {
        employeeName = name;
    }

    public void setEmployeeLocation(String location) {
        employeeLocation = location;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeLocation() {
        return employeeLocation;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmployeeId(101);
        emp.setEmployeeName("Deepika");
        emp.setEmployeeLocation("Cuddalore");

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Location: " + emp.getEmployeeLocation());
    }
}
