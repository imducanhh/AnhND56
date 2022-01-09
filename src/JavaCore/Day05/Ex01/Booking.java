package JavaCore.Day05.Ex01;

import java.util.List;

public class Booking {
    private int numberOfDay;
    private Room room;
    private List<Person> listPerson;

    public Booking(int numberOfDay, Room room, List<Person> listPerson) {
        this.numberOfDay = numberOfDay;
        this.room = room;
        this.listPerson = (List<Person>) listPerson;
    }

    public Booking() {

    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Person> getListPerson() {
        return (List<Person>) listPerson;
    }

    public void setListPerson(Person listPerson) {
        this.listPerson = (List<Person>) listPerson;
    }
}
