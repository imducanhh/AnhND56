package JavaCore.Day06.Ex01;

public class ProductionStaff extends Employee {
    private int amountOfProduct;

    public ProductionStaff(String employeeName, String dateOfBirth, String address, int amountOfProduct ) {
        super(employeeName,dateOfBirth,address);
        this.amountOfProduct = amountOfProduct;
    }

    public ProductionStaff() { }

    public ProductionStaff input() {
        super.input();
        System.out.print("Số lượng sản phẩm: ");
        int amountOfProduct = scanner.nextInt();

        return new ProductionStaff(super.getEmployeeName(), super.getDateOfBirth(), super.getAddress(), amountOfProduct);
    }

    @Override
    public void display() {
        super.display();
        System.out.print(" - Sản phẩm: " + amountOfProduct + " - Lương: " + calculateSalary() + "\n");
    }

    @Override
    public int calculateSalary() {
        return amountOfProduct * 20;
    }
}
