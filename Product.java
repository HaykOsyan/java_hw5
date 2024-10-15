package homework5;

import java.util.HashMap;

public class Product {
    // Задача 3. Подсчет продуктов в корзине
    // Создайте программу для учета продуктов в корзине. Программа должна
    // позволять добавлять, удалять, обновлять количество продуктов, а также
    // проверять наличие продуктов в корзине. Используйте HashMap для хранения
    // продуктов и их количества.
    String name;
    int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String toString() {
        return "Product: " + name + ", Quantity: " + quantity;
    }

    HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String name, int quantity) {
        if (products.containsKey(name)) {
            products.put(name, products.get(name) + quantity);
        } else {
            products.put(name, quantity);
        }
    }

    public void removeProduct(String name) {
        if (products.containsKey(name)) {
            products.remove(name);
        } else {
            System.out.println("No product with such name");
        }
    }

    public boolean checkProduct(String name) {
        if (products.containsKey(name)) {
            return true;
        }
        return false;
    }

    public void updateProductQuantity(String name, int quantity) {
        if (checkProduct(name)) {
            products.put(name, quantity);
        } else {
            System.out.println("There is no such product");
        }
    }

    public static void main(String[] args) {
        Product product = new Product("baba", 4);
        System.out.println(product);
    }
}
