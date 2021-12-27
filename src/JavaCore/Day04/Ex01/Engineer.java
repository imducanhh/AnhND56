package JavaCore.Day04.Ex01;

public class Engineer extends Officer{
    private String trainingIndustry;

    public Engineer() {
        super();
    }
    public Engineer(String trainingIndustry) {
        super();
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập ngành đào tạo: ");
        trainingIndustry = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Ngành đào tạo: " + getTrainingIndustry();
    }
}
