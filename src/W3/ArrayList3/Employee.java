package W3.ArrayList3;
import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String address;

    public Employee(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Address: " + address);
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // add ten employees
        employees.add(new Employee(1, "Torvalds", 20, "123 Main Street"));
        employees.add(new Employee(2, "Andriy", 21, "123 Main Street"));
        employees.add(new Employee(3, "Ricardo", 22, "123 Main Street"));
        employees.add(new Employee(4, "Nicklas", 23, "123 Main Street"));
        employees.add(new Employee(5, "James", 24, "123 Main Street"));
        employees.add(new Employee(6, "Andres", 25, "123 Main Street"));
        employees.add(new Employee(7, "Leo", 26, "123 Main Street"));
        employees.add(new Employee(8, "Sergio", 27, "123 Main Street"));
        employees.add(new Employee(9, "David", 28, "123 Main Street"));
        employees.add(new Employee(10, "Federico", 29, "123 Main Street"));

        for(Employee employee : employees) {
            employee.display();
        }
    }
}
