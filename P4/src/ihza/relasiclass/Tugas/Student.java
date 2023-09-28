package ihza.relasiclass.Tugas;

public class Student extends Human {
    private String studentId;
    private String major;

    public Student(String name, int age, String address, String studentId, String major) {
        super(name, age, address);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
