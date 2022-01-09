package JavaCore.Day06.Ex04;

public class Student {
    private final int rollNumber;
    private static int n = 1;
    private final String studentName;
    private static String collegeName = "PTIT";

    public Student(String name) {
        this.rollNumber = n++;
        studentName = name;
    }

    public static void change() {
        collegeName = "FPT";
    }

    public void display() {
        System.out.println("Mã sinh viên: " + rollNumber + " - Họ tên: " + studentName + " - Tên trường: " + collegeName);
    }
}