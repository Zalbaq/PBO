package Kampus;

class FacultyAssignment {
    private Faculty faculty;
    private Course course;

    public FacultyAssignment(Faculty faculty, Course course) {
        this.faculty = faculty;
        this.course = course;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Faculty Assignment:");
        faculty.displayInfo();
        course.displayInfo();
    }
}
