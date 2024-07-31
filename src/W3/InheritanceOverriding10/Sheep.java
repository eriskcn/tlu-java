package W3.InheritanceOverriding10;

public class Sheep extends Herbivore{
    public Sheep(String name, int age) {
        super(name, age);
    }

    public void display() {
        super.display();
        System.out.println("I am a sheep");
    }

    public static void main(String[] args) {
        Sheep shaun = new Sheep("Shaun", 20);
        shaun.display();
    }
}
