package Kampus;

public class OB extends Person {
    private String employeeId;

    public OB(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId.length() == 5) {
            this.employeeId = employeeId;
        } else {
            System.out.println("Employee ID must be 5 characters long");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
    }
}
