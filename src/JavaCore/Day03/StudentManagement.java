package JavaCore.Day03;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        String id;

        while (true) {
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Xóa học sinh theo id (số chứng minh thư)");
            System.out.println("3. Tìm kiếm học sinh theo quê quán");
            System.out.println("4. Sửa thông tin học sinh theo id (số chứng minh thư)");
            System.out.println("5. Hiển thị tất cả học sinh thõa mãn điều kiện 20 < tuổi < 30");
            System.out.println("6. Hiển thị tất cả học sinh");
            System.out.println("7. Thoát khỏi chương trình");
            System.out.print("Chọn các chức năng cần thực hiện: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1:
                    System.out.println("Thêm mới học sinh");
                    studentService.addStudent();
                    break;
                case 2:
                    System.out.print("Nhập số chứng minh thư học sinh cần xóa: ");
                    id = scanner.nextLine();
                    if (studentService.deleteStudentById(id)) {
                        System.out.println("Xóa học sinh thành công");
                    } else {
                        System.out.println("Xóa học sinh thất bại");
                    }

                    break;
                case 3:
                    System.out.print("Nhập quê quán cần tìm kiếm: ");
                    String place = scanner.nextLine();
                    studentService.findStudentsByPlace(place);
                    break;
                case 4:
                    System.out.print("Nhập số chứng minh thư của học sinh cần sửa: ");
                    id = scanner.nextLine();
                    studentService.editStudentById(id);
                    break;
                case 5:
                    studentService.findStudentsByAge();
                    break;
                case 6:
                    studentService.showAllStudent();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
