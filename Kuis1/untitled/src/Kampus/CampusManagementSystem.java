package Kampus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CampusManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Faculty> faculties = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Classroom> classrooms = new ArrayList<>();
        List<Enrollment> enrollments = new ArrayList<>();
        List<FacultyAssignment> facultyAssignments = new ArrayList<>();
        List<Timetable> timetables = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tambah Dosen");
            System.out.println("3. Tambah Mata Kuliah");
            System.out.println("4. Tambah Ruang Kelas");
            System.out.println("5. Tambah Pendaftaran Mahasiswa ke Mata Kuliah");
            System.out.println("6. Tambah Penugasan Dosen ke Mata Kuliah");
            System.out.println("7. Tambah Jadwal Kuliah");
            System.out.println("8. Lihat Data Mahasiswa berdasarkan NIM");
            System.out.println("9. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Membaca karakter newline setelah input pilihan

            switch (choice) {
                case 1:
                    System.out.print("Nama Mahasiswa: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Usia Mahasiswa: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine();  // Membaca karakter newline setelah input usia
                    System.out.print("NIM Mahasiswa: ");
                    String studentId = scanner.nextLine();
                    Student student = new Student(studentName, studentAge, studentId);
                    students.add(student);
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Nama Dosen: ");
                    String facultyName = scanner.nextLine();
                    System.out.print("Usia Dosen: ");
                    int facultyAge = scanner.nextInt();
                    scanner.nextLine();  // Membaca karakter newline setelah input usia
                    System.out.print("ID Dosen: ");
                    String facultyId = scanner.nextLine();
                    Faculty faculty = new Faculty(facultyName, facultyAge, facultyId);
                    faculties.add(faculty);
                    System.out.println("Dosen berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.print("ID Mata Kuliah: ");
                    String courseId = scanner.nextLine();
                    System.out.print("Nama Mata Kuliah: ");
                    String courseName = scanner.nextLine();
                    Course course = new Course(courseId, courseName);
                    courses.add(course);
                    System.out.println("Mata Kuliah berhasil ditambahkan!");
                    break;

                case 4:
                    System.out.print("ID Ruang Kelas: ");
                    String classroomId = scanner.nextLine();
                    System.out.print("Lokasi Ruang Kelas: ");
                    String location = scanner.nextLine();
                    Classroom classroom = new Classroom(classroomId, location);
                    classrooms.add(classroom);
                    System.out.println("Ruang Kelas berhasil ditambahkan!");
                    break;

                case 5:
                    System.out.print("Pilih Mahasiswa (NIM): ");
                    String studentIdForEnrollment = scanner.nextLine();
                    System.out.print("Pilih Mata Kuliah (ID): ");
                    String courseIdForEnrollment = scanner.nextLine();

                    // Cari mahasiswa berdasarkan ID
                    Student selectedStudentForEnrollment = null;
                    for (Student s : students) {
                        if (s.getStudentId().equals(studentIdForEnrollment)) {
                            selectedStudentForEnrollment = s;
                            break;
                        }
                    }

                    // Cari mata kuliah berdasarkan ID
                    Course selectedCourseForEnrollment = null;
                    for (Course c : courses) {
                        if (c.getCourseId().equals(courseIdForEnrollment)) {
                            selectedCourseForEnrollment = c;
                            break;
                        }
                    }

                    if (selectedStudentForEnrollment != null && selectedCourseForEnrollment != null) {
                        Enrollment enrollment = new Enrollment(selectedStudentForEnrollment, selectedCourseForEnrollment);
                        enrollments.add(enrollment);
                        System.out.println("Pendaftaran berhasil!");
                    } else {
                        System.out.println("Mahasiswa atau mata kuliah tidak ditemukan.");
                    }
                    break;

                case 6:
                    System.out.print("Pilih Dosen (ID): ");
                    String facultyIdForAssignment = scanner.nextLine();
                    System.out.print("Pilih Mata Kuliah (ID): ");
                    String courseIdForAssignment = scanner.nextLine();

                    // Cari dosen berdasarkan ID
                    Faculty selectedFacultyForAssignment = null;
                    for (Faculty f : faculties) {
                        if (f.getEmployeeId().equals(facultyIdForAssignment)) {
                            selectedFacultyForAssignment = f;
                            break;
                        }
                    }

                    // Cari mata kuliah berdasarkan ID
                    Course selectedCourseForAssignment = null;
                    for (Course c : courses) {
                        if (c.getCourseId().equals(courseIdForAssignment)) {
                            selectedCourseForAssignment = c;
                            break;
                        }
                    }

                    if (selectedFacultyForAssignment != null && selectedCourseForAssignment != null) {
                        FacultyAssignment facultyAssignment = new FacultyAssignment(selectedFacultyForAssignment, selectedCourseForAssignment);
                        facultyAssignments.add(facultyAssignment);
                        System.out.println("Penugasan dosen berhasil!");
                    } else {
                        System.out.println("Dosen atau mata kuliah tidak ditemukan.");
                    }
                    break;

                case 7:
                    System.out.print("Pilih Ruang Kelas (ID): ");
                    String classroomIdForTimetable = scanner.nextLine();
                    System.out.print("Pilih Mata Kuliah (ID): ");
                    String courseIdForTimetable = scanner.nextLine();
                    System.out.print("Hari Kuliah: ");
                    String day = scanner.nextLine();
                    System.out.print("Waktu Kuliah: ");
                    String time = scanner.nextLine();

                    // Cari ruang kelas berdasarkan ID
                    Classroom selectedClassroomForTimetable = null;
                    for (Classroom c : classrooms) {
                        if (c.getClassroomId().equals(classroomIdForTimetable)) {
                            selectedClassroomForTimetable = c;
                            break;
                        }
                    }

                    // Cari mata kuliah berdasarkan ID
                    Course selectedCourseForTimetable = null;
                    for (Course c : courses) {
                        if (c.getCourseId().equals(courseIdForTimetable)) {
                            selectedCourseForTimetable = c;
                            break;
                        }
                    }

                    if (selectedClassroomForTimetable != null && selectedCourseForTimetable != null) {
                        Timetable timetable = new Timetable(selectedClassroomForTimetable, selectedCourseForTimetable, day, time);
                        timetables.add(timetable);
                        System.out.println("Penjadwalan kuliah berhasil!");
                    } else {
                        System.out.println("Ruang kelas atau mata kuliah tidak ditemukan.");
                    }
                    break;

                case 8:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimToSearch = scanner.nextLine();

                    // Cari mahasiswa berdasarkan NIM
                    boolean found = false;
                    for (Student s : students) {
                        if (s.getStudentId().equals(nimToSearch)) {
                            s.displayInfo(); // Menampilkan informasi mahasiswa
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + nimToSearch + " tidak ditemukan.");
                    }
                    break;

                case 9:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
