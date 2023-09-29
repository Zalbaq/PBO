package Kampus;

class Student extends Person {
    private String studentNIM;

    public Student(String name, int age, String studentNIM) {
        super(name, age);
        this.studentNIM = studentNIM;
    }

    public String getStudentId() {
        return studentNIM;
    }

    public void setStudentId(String studentNIM) {
        this.studentNIM = studentNIM;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentNIM);
    }
}