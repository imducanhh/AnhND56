package JavaCore.Day05.Ex01;

public class RoomC extends Room {
    public RoomC() {
        super("C", 500);
    }

    @Override
    public String toString() {
        return "RoomA{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
