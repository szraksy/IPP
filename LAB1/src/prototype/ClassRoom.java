package prototype;

public class ClassRoom implements Cloneable {
    private String name;
    private int area;
    public ClassRoom(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getArea() {
        return area;
    }

    public void show() {
        System.out.println("The Student Group name is: " + name + " with the area " + area);
    }

    @Override
    public ClassRoom clone() throws CloneNotSupportedException {
        try {
            return (ClassRoom)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
