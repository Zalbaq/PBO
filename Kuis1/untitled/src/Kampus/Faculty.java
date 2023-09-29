package Kampus;

class Faculty extends Person {
    private String employeeId;

    public Faculty(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
    }
}
