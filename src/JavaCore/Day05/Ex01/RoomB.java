package JavaCore.Day05.Ex01;

public class RoomB extends Room {
    public RoomB() {
        super("B", 500);
    }

    @Override
    public String toString() {
        return "RoomA{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

}
