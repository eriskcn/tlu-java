package ShoppingCart;

import java.util.Scanner;
import java.util.Hashtable;

public class ShoppingCart {
    private static final Hashtable<Integer, Product> cart = new Hashtable<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("______________MENU________________");
            System.out.println("1. Add to the cart");
            System.out.println("2. Remove from the cart");
            System.out.println("3. Checkout the cart");
            System.out.println("4. Update the cart");
            System.out.println("5. Search by price");
            System.out.println("6. Exit");
            System.out.println("__________________________________");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    addToCart();
                    break;
                case 2:
                    removeFromCart();
                    break;
                case 3:
                    checkoutCart();
                    break;
                case 4:
                    updateCart();
                    break;
                case 5:
                    searchByPrice();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 6);
    }

    public static void addToCart() {
        System.out.println("___________________________________");
        System.out.println("Purchase a product");
        System.out.println("Please enter product's id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter product's name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter product's price: ");
        double price = scanner.nextDouble();
        System.out.println("Please enter product's quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(id, name, price, quantity);
        cart.put(id, product);
        System.out.println("Product added to the cart");
    }

    public static void removeFromCart() {
        System.out.println("___________________________________");
        System.out.println("Remove a product from the cart");
        System.out.println("Please enter product's id: ");
        int id = scanner.nextInt();
        if (cart.containsKey(id)) {
            cart.remove(id);
            System.out.println("Product removed from the cart");
        } else {
            System.out.println("Product with id: " + id + " not found");
        }
    }

    public static void checkoutCart() {
        System.out.println("___________________________________");
        System.out.println("Checkout the cart");
        double total = 0;
        for (Product product : cart.values()) {
            total += product.getPrice() * product.getQuantity();
        }

        System.out.println("Total cost: " + total + "USD");
    }

    public static void updateCart() {
        System.out.println("___________________________________");
        System.out.println("Update the cart");
        System.out.println("Please enter product's id: ");
        int id = scanner.nextInt();
        if (cart.containsKey(id)) {
            System.out.println("Enter new quantity: ");
            int quantity = scanner.nextInt();
            Product product = cart.get(id);
            product.setQuantity(quantity);
            System.out.println("Product updated");
        } else {
            System.out.println("Product with id: " + id + " not found");
        }
    }

    public static void searchByPrice() {
        System.out.println("___________________________________");
        System.out.println("Search products that have price greater than or equal to 1000USD");
        int count = 0;
        for (Product product : cart.values()) {
            if (product.getPrice() > 1000) {
                System.out.println(product);
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("No products found");
        }
    }
}
