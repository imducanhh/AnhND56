package JavaCore.Day05.Ex01;

public class RoomA extends Room {
    public RoomA() {
        super("A", 500);
    }

    @Override
    public String toString() {
        return "RoomA{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

}
