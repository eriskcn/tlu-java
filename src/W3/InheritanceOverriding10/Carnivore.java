package W3.InheritanceOverriding10;

public class Carnivore extends Animal {
    public Carnivore(String name, int age) {
        super(name, age);
    }

    public void go() {
        System.out.println("Carnivore is hunting");
    }
}
