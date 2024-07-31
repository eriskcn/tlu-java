package W3.InheritanceOverriding10;

public class Animal {
    private String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void go() {
        System.out.println("The animal is moving");
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
