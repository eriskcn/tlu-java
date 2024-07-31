package W3.InheritanceOverriding10;

public class Cow extends Herbivore{
    public Cow(String name, int age) {
        super(name, age);
    }

    public void display() {
        super.display();
        System.out.println("I am a cow");
    }

    public static void main(String[] args) {
        Cow bodo = new Cow("Bodo", 20);
        bodo.display();
    }
}
