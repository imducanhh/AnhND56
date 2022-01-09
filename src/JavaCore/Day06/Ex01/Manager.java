package JavaCore.Day06.Ex01;

public class Manager extends Employee {
    private int basicSalary, wage;

    public Manager(String employeeName, String dateOfBirth, String address, int basicSalary, int wage ) {
        super(employeeName, dateOfBirth, address);
        this.basicSalary = basicSalary;
        this.wage = wage;
    }

    public Manager() {}

    public Manager input() {
        super.input();
        System.out.print("Lương cơ bản: ");
        int basicSalary = scanner.nextInt();
        System.out.print("Công: ");
        int wage = scanner.nextInt();
        return new Manager(super.getEmployeeName(), super.getDateOfBirth(), super.getAddress(), basicSalary, wage);
    }

    @Override
    public void display() {
        super.display();
        System.out.print(" - Lương cơ bản: " + basicSalary + " - Công: " + wage + " - Lương: " + calculateSalary() + "\n");
    }

    @Override
    public int calculateSalary() {
        return basicSalary * wage;
    }
}
