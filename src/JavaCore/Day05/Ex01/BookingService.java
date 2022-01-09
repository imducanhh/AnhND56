package JavaCore.Day05.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static JavaCore.Day02.Sort.scanner;

public class BookingService {
    List<Booking> listBooking = new ArrayList<Booking>();
    List<Person> listPerson = new ArrayList<Person>();
    Room room = null;

    public void addBooking() {
        System.out.print("Nhập số ngày thuê phòng: ");
        int numberOfDay= scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên phòng (A, B, C): ");
        String roomChoise = scanner.nextLine();
        System.out.print("Nhập số người thuê phòng: ");
        int numberOfPerson= scanner.nextInt();
        scanner.nextLine();

        if (roomChoise.equals("A")) {
            room = new RoomA();
        } else if (roomChoise.equals("B")) {
            room = new RoomB();
        } else if (roomChoise.equals("C")) {
            room = new RoomC();
        }

        System.out.println("Nhập danh sách người thuê phòng: ");
        for (int i = 0; i < numberOfPerson; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập họ tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập số chứng minh nhân dân: ");
            String passport = scanner.nextLine();
            listPerson.add(new Person(name, age, passport));
        }

        listBooking.add(new Booking(numberOfDay, room, listPerson));
    }

    public void listBooking() {
        for (int i = 0; i < listBooking.size(); i++) {
            System.out.println("Booking số: " + (i + 1));
            System.out.println("Số ngày thuê: " + listBooking.get(i).getNumberOfDay());
            System.out.println("Tên phòng: " + listBooking.get(i).getRoom().category);
        }
    }

//    public boolean delete(String passport) {
//        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
//        if (person == null) {
//            return false;
//        } else {
//            this.persons.remove(person);
//            return true;
//        }
//    }

//    public int calculator(String passport) {
//        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
//        if (person == null) {
//            return 0;
//        }
////        return person.getRoom().getPrice() * person.getNumberOfDay();
//        return 0;
//    }

//    public void show() {
//        this.persons.forEach(p -> System.out.println(p.toString()));
//    }
}
