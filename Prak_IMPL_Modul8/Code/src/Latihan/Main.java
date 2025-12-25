package Latihan;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("IMPL");

        Student s1 = new Student("2350081010", "Arya Wijaya");
        Student s2 = new Student("2350081008", "Ammar Bagas F");
        Student s3 = new Student("2350081020", "Fauzy Fdillah");

        CourseRecord cr1 = new CourseRecord();
        cr1.setStudent(s1);
        cr1.addAssignment(new Assignment("Tugas 1", 85, 0.4));
        cr1.addAssignment(new Assignment("Tugas 2", 80, 0.4));
        cr1.addAssignment(new Assignment("UTS", 60, 0.4));

        CourseRecord cr2 = new CourseRecord();
        cr2.setStudent(s2);
        cr2.addAssignment(new Assignment("Tugas 1", 50, 0.4));
        cr2.addAssignment(new Assignment("Tugas 2", 55, 0.4));
        cr2.addAssignment(new Assignment("UTS", 40, 0.4));

        CourseRecord cr3 = new CourseRecord();
        cr3.setStudent(s3);

        course.addCourseRecord(cr1);
        course.addCourseRecord(cr2);
        course.addCourseRecord(cr3);

        course.printCourseStudents();
        System.out.println();
        course.printBestStudent();
        System.out.println();
        course.printFinalExamStudents();
    }
}