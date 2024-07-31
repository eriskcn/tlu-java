package W3.InheritanceOverriding10;

public class Herbivore extends Animal{
    public void go() {
        System.out.println("Herbivore is grazing");
    }

    public Herbivore(String name, int age) {
        super(name, age);
    }
}
