package W3;

import java.util.ArrayList;

public class Staff { // More descriptive class name
    private int id;
    private String name;
    private int age;
    private String address;
    private final String email; // Unique identifier

    public Staff(int id, String name, int age, String address, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;

        // Optional: Validate age here
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
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
        // Optional: Validate age again here
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age: " + age + " | Address: " + address + " | Email: " + email;
    }

    public static void main(String[] args) {
        ArrayList<Staff> staffList = new ArrayList<>(); // More descriptive name
        staffList.add(new Staff(1, "John Doe", 20, "123 Bang Liet Street", "john.doe@company.com"));
        staffList.add(new Staff(2, "Linus Torvalds", 20, "55 Tran Duy Hung Street", "linus.torvalds@company.com"));
        staffList.add(new Staff(3, "Alan Turing", 20, "10 Truong Chinh Street", "alan.turing@company.com"));
        for (Staff staff : staffList) { // Use staff instead of StaffWithArrayList
            System.out.println(staff.toString());
        }

        staffList.add(new Staff(4, "Alexander Grothendieck", 68, "111 Nguyen Co Thach Street", "alexander.grothendieck@company.com"));

        Staff firstStaff = staffList.get(0);
        firstStaff.setName("Harry Maguire");
        firstStaff.setAge(31);
        System.out.println(firstStaff.toString());

        staffList.remove(0);

        for (Staff staff : staffList) {
            System.out.println(staff.toString());
        }
    }
}
