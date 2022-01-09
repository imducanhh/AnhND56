package JavaCore.Day05.Ex01;

import java.util.Scanner;

public class Person {
    private String name, passport;
    private int age;

    public Person(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }


    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên người thuê phòng: ");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi người thuê phòng: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập số chứng minh nhân dân: ");
        passport = scanner.nextLine();
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", passport='" + passport + '\'' + room.toString() +
//                '}';
//    }
}
