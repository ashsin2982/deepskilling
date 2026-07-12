package question2;

import java.util.Scanner;

public class SearchProduct {

    public static Product linearSearch(Product[] products, String key) {

        for (Product product : products) {
            if (product.name.equalsIgnoreCase(key)) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", 65000),
            new Product(102, "Mobile", 25000),
            new Product(103, "Headphones", 3000),
            new Product(104, "Keyboard", 1500),
            new Product(105, "Mouse", 800)
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        Product result = linearSearch(products, name);

        if (result != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + result.id);
            System.out.println("Name: " + result.name);
            System.out.println("Price: ₹" + result.price);
        } else {
            System.out.println("Product Not Found");
        }

        sc.close();
    }
}   