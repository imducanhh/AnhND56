package JavaCore.Day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    List<Student> listStudent = new ArrayList<Student>();
    String id, name, place;
    int age, number;
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số lượng học sinh cần nhập: ");
        number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.printf("Nhập thông tin học sinh thứ %s\n", i + 1);
            System.out.print("Nhập số chứng minh thư: ");
            id = scanner.nextLine();
            System.out.print("Nhập họ tên học sinh: ");
            name = scanner.nextLine();
            System.out.print("Nhập tuổi học sinh: ");
            age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập quê quán: ");
            place = scanner.nextLine();

            listStudent.add(new Student(id, name, age, place));
        }
    }

    public boolean deleteStudentById(String id) {
        int i;
        for (i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId().equals(id)) {
                break;
            }
        }
        return listStudent.remove(listStudent.get(i));
    }

    public void findStudentsByPlace(String place) {
        System.out.println("Danh sách học sinh có quê quán ở " + place);
        if (listStudent.size() == 0) {
            System.out.println("Danh sách học sinh trống!");
        } else {
            for (Student student : listStudent) {
                if (student.getPlace().equals(place)) {
                    showStudent(student);
                }
            }
        }
    }

    public void findStudentsByAge() {
        System.out.println("Danh sách học sinh thõa mãn điều kiện 20 < tuổi < 30:");
        if (listStudent.size() == 0) {
            System.out.println("Danh sách học sinh trống!");
        } else {
            for (Student student : listStudent) {
                if (student.getAge() < 30 && student.getAge() > 20) {
                    showStudent(student);
                }
            }
        }
    }

    public void editStudentById(String idEdit) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin của học sinh cần sửa");
        System.out.print("Nhập số chứng minh thư: ");
        id = scanner.nextLine();
        System.out.print("Nhập họ tên học sinh: ");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi học sinh: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        place = scanner.nextLine();

        Student student = new Student(id, name, age, place);
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId().equals(idEdit)) {
                listStudent.set(i, student);
            }
        }
    }
    public void showAllStudent() {
        if (listStudent.size() == 0) {
            System.out.println("Danh sách học sinh trống!");
        } else {
            System.out.println("Danh sách tất cả học sinh:");
            for (Student student : listStudent) {
                showStudent(student);
            }
        }
    }
    public void showStudent(Student student) {
        System.out.printf("%s, %s, %s, %s\n", student.getId(), student.getName(), student.getAge(), student.getPlace());
    }
}
