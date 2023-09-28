package ihza.relasiclass.Tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Student student1 = new Student("John Doe", 20, "123 Main St", "12345", "Computer Science");

        // Membuat objek dosen
        Professor professor1 = new Professor("Dr. Smith", 40, "456 Oak Ave", "98765", "Computer Science");

        // Membuat objek mata kuliah
        Course course1 = new Course("Programming 101", "CS101", 3);
        Course course2 = new Course("Data Structures", "CS201", 4);

        // Mahasiswa mengambil mata kuliah
        CourseEnrollment enrollment1 = new CourseEnrollment(student1, course1, 85);
        CourseEnrollment enrollment2 = new CourseEnrollment(student1, course2, 92);

        // Menampilkan informasi mahasiswa dan mata kuliah yang diambil
        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama: " + student1.getName());
        System.out.println("Usia: " + student1.getAge());
        System.out.println("Jurusan: " + student1.getMajor());
        System.out.println();

        System.out.println("Informasi Dosen:");
        System.out.println("Nama: " + professor1.getName());
        System.out.println("Usia: " + professor1.getAge());
        System.out.println("Mata Kuliah yang Diajar: " + professor1.getSubject());
        System.out.println();

        System.out.println("Informasi Mata Kuliah:");
        System.out.println("Nama Mata Kuliah: " + course1.getCourseName());
        System.out.println("Kode Mata Kuliah: " + course1.getCourseCode());
        System.out.println("SKS: " + course1.getCreditHours());
        System.out.println();

        System.out.println("Informasi Pengambilan Mata Kuliah:");
        System.out.println("Nama Mahasiswa: " + enrollment1.getStudent().getName());
        System.out.println("Mata Kuliah yang Diambil: " + enrollment1.getCourse().getCourseName());
        System.out.println("Nilai: " + enrollment1.getGrade());
    }
}
