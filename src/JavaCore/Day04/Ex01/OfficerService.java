package JavaCore.Day04.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfficerService {
    List<Officer> listOfficer = new ArrayList<Officer>();
    int number, typeOfficer;
    String name, type, place;
    Scanner scanner = new Scanner(System.in);
    Officer officer = null;

    public void addOfficer() {
        System.out.print("Số lượng cán bộ cần nhập: ");
        number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.printf("Nhập thông tin cán bộ thứ %s\n", i + 1);
            do {
                System.out.print("Chọn loại cán bộ (1 - Công nhân, 2 - Kỹ sư, 3 - Nhân viên): ");
                typeOfficer = scanner.nextInt();
                scanner.nextLine();
                switch (typeOfficer) {
                    case 1:
                        officer = new Worker();
                        officer.input();
                        listOfficer.add(officer);
                        break;
                    case 2:
                        officer = new Engineer();
                        officer.input();
                        listOfficer.add(officer);
                        break;
                    case 3:
                        officer = new Employee();
                        officer.input();
                        listOfficer.add(officer);
                        break;
                    default:
                        System.out.println("Chọn loại cán bộ không hợp lệ");
                        break;
                }
            } while (typeOfficer < 1 || typeOfficer > 3);
        }
    }

    public void listOfficer() {
        for(Officer officer : listOfficer) {
            System.out.println(officer.toString());
        }
    }

    public void findOfficerByName() {
        List<Officer> result = new ArrayList<Officer>();
        System.out.print("Nhập tên cán bộ cần tìm: ");
        name = scanner.nextLine();

        for(Officer officer : listOfficer) {
            if (officer.getName().equals(name))
            result.add(officer);
        }

        System.out.println("Danh sách cán bộ có tên " + name + ": ");
        if (result.size() > 0) {
            System.out.println(result);
        } else {
            System.out.println("Không có kết quả hợp lệ");
        }
    }

    public void findOfficerByTypeAndPlace() {
        List<Officer> result = new ArrayList<Officer>();
        System.out.print("Nhập loại cán bộ cần tìm: ");
        type = scanner.nextLine();
        System.out.print("Nhập địa chỉ cán bộ cần tìm: ");
        place = scanner.nextLine();

        for (Officer officer : listOfficer) {
            switch (type) {
                case "Công nhân":
                    if (officer instanceof Worker && officer.getPlace().equals(place)) {
                        result.add(officer);
                    }
                    break;
                case "Kỹ sư":
                    if (officer instanceof Engineer && officer.getPlace().equals(place)) {
                        result.add(officer);
                    }
                    break;
                case "Nhân viên":
                    if (officer instanceof Employee && officer.getPlace().equals(place)) {
                        result.add(officer);
                    }
                    break;
            }
        }
        System.out.println("Danh sách cán bộ có loại " + type + " và có địa chỉ ở " + place + ": ");
        if (result.size() > 0) {
            System.out.println(result);
        } else {
            System.out.println("Không có kết quả hợp lệ");
        }
    }
}
