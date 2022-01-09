package JavaCore.Day06.Ex01;

import java.util.Scanner;

public abstract class Employee {
    String employeeName;
    String dateOfBirth;
    String address;
    Scanner scanner = new Scanner(System.in);

    public abstract int calculateSalary();

    public Employee(String name, String date, String address) {
        this.employeeName = name;
        this.dateOfBirth = date;
        this.address = address;
    }

    public Employee () {}

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee input() {
        System.out.print("Họ và tên: ");
        String employeeName = scanner.nextLine();
        setEmployeeName(employeeName);

        System.out.print("Ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        setDateOfBirth(dateOfBirth);

        System.out.print("Địa chỉ: ");
        String address = scanner.nextLine();
        setAddress(address);
        return null;
    }

    public void display() {
        System.out.print("Họ và tên: " + employeeName + " - Ngày sinh: " + dateOfBirth + " - Địa chỉ: " + address);
    }
}
