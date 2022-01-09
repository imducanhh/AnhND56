package JavaCore.Day06.Ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<Student>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Tên học viên thứ: " + (i + 1));
            String name = scanner.nextLine();
            Student student = new Student(name);
            listStudent.add(student);
        }

        for (Student student : listStudent) {
            Student.change();
            student.display();
        }
    }
}
