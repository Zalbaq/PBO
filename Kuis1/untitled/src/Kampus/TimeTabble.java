package Kampus;

class Timetable {
    private Classroom classroom;
    private Course course;
    private String day;
    private String time;

    public Timetable(Classroom classroom, Course course, String day, String time) {
        this.classroom = classroom;
        this.course = course;
        this.day = day;
        this.time = time;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void displayInfo() {
        System.out.println("Timetable Information:");
        classroom.displayInfo();
        course.displayInfo();
        System.out.println("Day: " + day);
        System.out.println("Time: " + time);
    }
}