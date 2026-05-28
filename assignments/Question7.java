import java.util.*;
/*
Create a class "Product" with attributes like name, price, and quantity.
Implement multiple constructors to initialize objects with different sets of parameters.
*/

class Product{
    String name;
    int price;
    int quantity;
    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, int price){
        this.name = name;
        this.price = price;
        quantity = 0;
    }
    public Product(String name){
        this.name = name;
        price = 69;
        quantity = 0;
    }
    public Product(){
        name = "default product";
        price = 0;
        quantity = 0;
    }

    @Override
    public String toString(){
        return "Name : " + name + "\n" + "Price: " + price + "\n" + "Quantity: " + quantity;
    }
}

public class Question7 {
    public static void main(String[] args) {
        Product obj1 = new Product("Iphone", 69000, 12);
        Product obj2 = new Product("Mac", 200000);
        Product obj3 = new Product("Volvo");
        Product obj4 = new Product();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

    }
}