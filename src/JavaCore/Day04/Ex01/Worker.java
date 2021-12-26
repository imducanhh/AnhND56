package JavaCore.Day04.Ex01;

public class Worker extends Officer {
    private int level;

    public Worker() {
        super();
    }

    public Worker(int level) {
        super();
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập cấp bậc cán bộ: ");
        level = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + ", Cấp bậc: " + this.level;
    }
}
