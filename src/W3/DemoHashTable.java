package W3;

import java.util.Enumeration;
import java.util.Hashtable;

public class DemoHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> htFood = new Hashtable<>();
        htFood.put(1, "Burger");
        htFood.put(2, "Chicken");
        htFood.put(3, "Pizza");
        System.out.println("Value of key 1: " + htFood.get(1));

        System.out.println("Has key: " + htFood.containsKey(2));
        System.out.println("Has value: " + htFood.containsValue("Pizza"));
        System.out.println("Empty: " + htFood.isEmpty());

        htFood.remove(2);
        htFood.replace(1, "Pasta");

        htFood.put(4, "Spaghetti");

        Enumeration<Integer> keys = htFood.keys();
        while (keys.hasMoreElements()){
            int key = keys.nextElement();
            System.out.println("Key: " + key + " | Value: " + htFood.get(key));
        }
    }
}
