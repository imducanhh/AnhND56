package JavaCore.Day04.Ex01;

import java.util.Scanner;

public class Officer {
    String id, name, sex, place;
    int age;
    Scanner scanner = new Scanner(System.in);

    public Officer() {
        super();
    }

    public Officer(String id, String name, int age, String sex, String place)  {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.place = place;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex() {
        this.sex = sex;
    }

    public String getPlace() {
        return place;
    }

    public void input() {
        System.out.print("Nhập mã cán bộ: ");
        id = scanner.nextLine();
        System.out.print("Nhập họ tên cán bộ: ");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi cán bộ: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập giới tính cán bộ: ");
        sex = scanner.nextLine();
        System.out.print("Nhập địa chỉ cán bộ: ");
        place = scanner.nextLine();
    }

    public String toString() {
        return "Mã: " + getId() + ", Họ tên: " + getName() + ", Tuổi: " + getAge() + ", Giới tính: " + getSex() + ", Địa chỉ: " + getPlace();
    }
}
