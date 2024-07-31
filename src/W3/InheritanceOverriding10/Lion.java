package W3.InheritanceOverriding10;

public class Lion extends Carnivore{
    public Lion(String name, int age) {
        super(name, age);
    }

    public void display() {
        super.display();
        System.out.println("I am a lion");
    }

    public static void main(String[] args) {
        Lion leo = new Lion("Leo", 20);
        leo.display();
    }
}
