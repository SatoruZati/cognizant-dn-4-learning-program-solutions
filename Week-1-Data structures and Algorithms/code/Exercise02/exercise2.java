// E-commerce Product Search Example

import java.util.Arrays;
import java.util.Scanner;

class Product {
    int id;
    String name;
    String type;
    double price;

    // Constructor
    public Product(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}

public class exercise2 {

    // Linear search
    static Product findProductLinear(Product[] items, int targetId) {
        for (Product item : items) {
            if (item.id == targetId) {
                return item;
            }
        }
        return null;
    }

    // Binary search
    static Product findProductBinary(Product[] sortedItems, int targetId) {
        int low = 0, high = sortedItems.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedItems[mid].id == targetId) {
                return sortedItems[mid];
            } else if (sortedItems[mid].id < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    // bubble sort
    static void sortById(Product[] items) {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (items[j].id > items[j + 1].id) {
                    Product temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Product[] inventory = {
            new Product(102, "Walking Shoes", "Footwear"),
            new Product(105, "Wired Headphones", "Electronics"),
            new Product(101, "Household Coffee Maker", "Kitchen"),
            new Product(104, "Travel Backpack", "Accessories"),
            new Product(103, "Travel Water Bottle", "Kitchen"),
            new Product(106, "Wireless Earbuds", "Electronics"),
            new Product(107, "Washing Machine", "Appliances"),
        };

        Product[] sortedInventory = Arrays.copyOf(inventory, inventory.length);
        sortById(sortedInventory);

        // user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID to search: ");
        int searchKey = scanner.nextInt();
        scanner.close();

        // Linear search
        Product resultLinear = findProductLinear(inventory, searchKey);
        if (resultLinear != null) {
            System.out.println("Linear Search found: " + resultLinear.name);
        } else {
            System.out.println("Linear Search: Product not found");
        }

        // Binary search
        Product resultBinary = findProductBinary(sortedInventory, searchKey);
        if (resultBinary != null) {
            System.out.println("Binary Search found: " + resultBinary.name);
        } else {
            System.out.println("Binary Search: Product not found");
        }

        // close scanner
        scanner.close();

    }
}