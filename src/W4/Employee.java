package W4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int experience;
    private double salary;

    public Employee(String name, int experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nExperience: " + this.experience + "\nSalary: " + this.salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Lop Truong", 15, 300);
        System.out.println(employee);
        String filePath = "src/W4/QuachTinh.txt";
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(employee);
            System.out.println("Employee object has been serialized and saved to " + filePath);

        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
