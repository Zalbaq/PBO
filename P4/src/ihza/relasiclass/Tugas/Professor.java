package ihza.relasiclass.Tugas;

public class Professor extends Human {
    private String employeeId;
    private String subject;

    public Professor(String name, int age, String address, String employeeId, String subject) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
