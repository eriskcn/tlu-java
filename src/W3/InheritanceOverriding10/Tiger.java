package W3.InheritanceOverriding10;

public class Tiger extends Carnivore{
    public Tiger(String name, int age) {
        super(name, age);
    }

    public void display() {
        super.display();
        System.out.println("I am a tiger");
    }

    public static void main(String[] args) {
        Tiger tyger = new Tiger("Tyger", 20);
        tyger.display();
    }
}
