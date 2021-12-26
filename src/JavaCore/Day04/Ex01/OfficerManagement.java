package JavaCore.Day04.Ex01;

import java.util.Scanner;

public class OfficerManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficerService officerService = new OfficerService();

        while (true) {
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo tên");
            System.out.println("3. Tìm kiếm cán bộ theo phân loại cán bộ và địa chỉ");
            System.out.println("4. Hiển thị thông tin danh sách cán bộ");
            System.out.println("5. Thoát khỏi chương trình");
            System.out.print("Chọn các chức năng cần thực hiện: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1:
                    System.out.println("1. Thêm mới cán bộ");
                    officerService.addOfficer();
                    break;
                case 2:
                    System.out.println("2. Tìm kiếm cán bộ theo tên");
                    officerService.findOfficerByName();
                    break;
                case 3:
                    System.out.println("3. Tìm kiếm cán bộ theo phân loại cán bộ và địa chỉ");
                    officerService.findOfficerByTypeAndPlace();
                    break;
                case 4:
                    System.out.println("4. Hiển thị thông tin danh sách cán bộ");
                    officerService.listOfficer();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
