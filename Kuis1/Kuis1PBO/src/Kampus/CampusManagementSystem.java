package Kampus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CampusManagementSystem {

    static Scanner scanner = new Scanner(System.in);

    static void addStudent(List<Student> students) {
        System.out.print("Nama Mahasiswa: ");
        String studentName = scanner.nextLine();
        System.out.print("Usia Mahasiswa: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("NIM Mahasiswa: ");
        String studentId = scanner.nextLine();
        Student student = new Student(studentName, studentAge, studentId);
        students.add(student);
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    static void addLecturer(List<Lecturer> lecturers) {
        System.out.print("Nama Dosen: ");
        String lecturerName = scanner.nextLine();
        System.out.print("Usia Dosen: ");
        int lecturerAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("ID Dosen: ");
        String lecturerId = scanner.nextLine();
        Lecturer lecturer = new Lecturer(lecturerName, lecturerAge, lecturerId);
        lecturers.add(lecturer);
        System.out.println("Dosen berhasil ditambahkan!");
    }

    static void addCourse(List<Course> courses) {
        System.out.print("ID Mata Kuliah: ");
        String courseId = scanner.nextLine();
        System.out.print("Nama Mata Kuliah: ");
        String courseName = scanner.nextLine();
        Course course = new Course(courseId, courseName);
        courses.add(course);
        System.out.println("Mata Kuliah berhasil ditambahkan!");
    }

    static void addClassroom(List<Classroom> classrooms) {
        System.out.print("ID Ruang Kelas: ");
        String classroomId = scanner.nextLine();
        System.out.print("Lokasi Ruang Kelas: ");
        String location = scanner.nextLine();
        Classroom classroom = new Classroom(classroomId, location);
        classrooms.add(classroom);
        System.out.println("Ruang Kelas berhasil ditambahkan!");
    }

    static void addEnrollment(List<Student> students, List<Course> courses, List<Enrollment> enrollments) {
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
    }

    static void addLecturerAssignment(List<Lecturer> lecturer, List<Course> courses, List<LecturerAssignment> LecturerAssignments) {
        System.out.print("Pilih Dosen (ID): ");
        String lecturerIdForAssignment = scanner.nextLine();
        System.out.print("Pilih Mata Kuliah (ID): ");
        String courseIdForAssignment = scanner.nextLine();

        // Cari dosen berdasarkan ID
        Lecturer selectedLecturerForAssignment = null;
        for (Lecturer l : lecturer) {
            if (l.getEmployeeId().equals(lecturerIdForAssignment)) {
                selectedLecturerForAssignment = l;
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

        if (selectedLecturerForAssignment != null && selectedCourseForAssignment != null) {
            LecturerAssignment lecturerAssignment = new LecturerAssignment(selectedLecturerForAssignment,
                    selectedCourseForAssignment);
            LecturerAssignments.add(lecturerAssignment);
            System.out.println("Penugasan dosen berhasil!");
        } else {
            System.out.println("Dosen atau mata kuliah tidak ditemukan.");
        }
    }

    static void addTimetable(List<Classroom> classrooms, List<Course> courses, List<Timetable> timetables) {
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
    }

    static void accessStudentData(List<Student> students) {
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
    }

    static void addOB(List<OB> OBs) {
        System.out.print("Nama OB: ");
        String OBName = scanner.nextLine();
        System.out.print("Usia OB: ");
        int OBAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("ID OB: ");
        String OBId = scanner.nextLine();
        OB ofboy = new OB(OBName, OBAge, OBId);
        OBs.add(ofboy);
        System.out.println("OB berhasil ditambahkan!");
    }

    
//===================================================================================================
//===================================================================================================

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Lecturer> lecturer = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Classroom> classrooms = new ArrayList<>();
        List<Enrollment> enrollments = new ArrayList<>();
        List<LecturerAssignment> lecturerAssignments = new ArrayList<>();
        List<Timetable> timetables = new ArrayList<>();
        List<OB> ob = new ArrayList<>();

        while (true) {
            System.out.println("====================================================");
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tambah Dosen");
            System.out.println("3. Tambah Mata Kuliah");
            System.out.println("4. Tambah Ruang Kelas");
            System.out.println("5. Tambah Pendaftaran Mahasiswa ke Mata Kuliah");
            System.out.println("6. Tambah Penugasan Dosen ke Mata Kuliah");
            System.out.println("7. Tambah Jadwal Kuliah");
            System.out.println("8. Lihat Data Mahasiswa berdasarkan NIM");
            System.out.println("9. Tambah OB");
            System.out.println("10. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent(students);
                    break;

                case 2:
                    addLecturer(lecturer);
                    break;

                case 3:
                    addCourse(courses);
                    break;

                case 4:
                    addClassroom(classrooms);
                    break;

                case 5:
                    addEnrollment(students, courses, enrollments);
                    break;

                case 6:
                    addLecturerAssignment(lecturer, courses, lecturerAssignments);
                    break;

                case 7:
                    addTimetable(classrooms, courses, timetables);
                    break;

                case 8:
                    accessStudentData(students);
                    break;
                    
                case 9:
                    addOB(ob);
                    break;

                case 10:
                    System.out.println("Terima kasih telah menggunakan program ini!.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
