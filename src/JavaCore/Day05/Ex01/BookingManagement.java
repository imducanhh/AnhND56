package JavaCore.Day05.Ex01;

import java.util.Scanner;

public class BookingManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();
        while (true) {
            System.out.println("Quản lý khách sạn");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Thêm mới booking");
            System.out.println("2. Xóa booking theo số chứng minh nhân dân");
            System.out.println("3. Tính tiền thuê phòng");
            System.out.println("4. Hiển thị tất cả các booking đang có");
            System.out.println("5. Tìm kiếm khách hàng theo tên");
            System.out.println("6. Thoát chương trình");

            System.out.print("Nhập chức năng muốn thực hiện: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            switch(number) {
                case 1: {
                    bookingService.addBooking();
                    break;
                }
                case 2: {
                    System.out.print("Nhập số chứng minh nhân dân cần xóa: ");
                    break;
                }
                case 3: {
                    System.out.print("Nhập tên phòng cần tính: ");
                    String roomName = scanner.nextLine();
                    break;
                }
                case 4: {
                    System.out.println("Danh sách tất cả các booking đang có: ");
                    bookingService.listBooking();
                    break;
                }
                case 5: {
                    System.out.println("Nhập tên khách hàng cần tìm: ");
                    String personName = scanner.nextLine();
                    break;
                }
                case 6: {
                    return;
                }
                default:
                    System.out.println("Chức năng không hợp lệ");
            }
        }

    }
}
