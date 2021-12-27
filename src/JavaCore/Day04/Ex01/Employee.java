package JavaCore.Day04.Ex01;

public class Employee extends Officer {
    private String field;
    private int yearsOfExperience;

    public Employee() {
        super();
    }

    public Employee(String field, int yearsOfExperience) {
        super();
        this.field = field;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập lĩnh vực công việc: ");
        field = scanner.nextLine();
        System.out.print("Nhập năm kinh nghiệm: ");
        yearsOfExperience = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + ", Lĩnh vực: " + getField() + ", Năm kinh nghiệm: " + getYearsOfExperience();
    }
}
