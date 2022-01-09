package JavaCore.Day06.Ex01;

public class DailyStaff extends Employee {
    private int numberOfWorkdays;

    public DailyStaff(String employeeName, String dateOfBirth, String address, int numberOfWorkdays ) {
        super(employeeName,dateOfBirth,address);
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public DailyStaff() {}

    public DailyStaff input() {
        super.input();
        System.out.print("Số ngày làm việc: ");
        int numberOfWorkdays = scanner.nextInt();
        return new DailyStaff(super.getEmployeeName(), super.getDateOfBirth(), super.getAddress(), numberOfWorkdays);
    }

    @Override
    public void display() {
        super.display();
        System.out.print(" - Ngày làm việc: " + numberOfWorkdays + " - Lương: " + calculateSalary() + "\n");
    }

    @Override
    public int calculateSalary() {
        return numberOfWorkdays * 15;
    }
}
