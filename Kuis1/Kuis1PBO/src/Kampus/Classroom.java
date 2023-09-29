package Kampus;

class Classroom {
    private String classroomId;
    private String location;

    public Classroom(String classroomId, String location) {
        this.classroomId = classroomId;
        this.location = location;
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Classroom ID: " + classroomId);
        System.out.println("Location: " + location);
    }
}