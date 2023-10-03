package Kampus;

class LecturerAssignment {
    private Lecturer lecturer;
    private Course course;

    public LecturerAssignment(Lecturer lecturer, Course course) {
        this.lecturer = lecturer;
        this.course = course;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Lecturer Assignment:");
        lecturer.displayInfo();
        course.displayInfo();
    }
}
