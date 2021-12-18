package JavaCore.Day03;

public class Student {
    private String id, name, place;
    private int age;

    public Student() {
        super();
    }

    public Student(String id, String name, int age, String place)  {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPlace() {
        return place;
    }
}
