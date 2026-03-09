package oop.others;
import java.util.Arrays;

enum Laptop{
    HP(30000), Macbook(69000), Asus(88000), Chromebook(12000);

    private int price;
    private Laptop(int price){ // enum requires private constructor instead of public (enum treats package-private also as private)
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
};

public class EnumPractice {
    public static void main(String[] args){
       Laptop[] laps = Laptop.values();
       for(Laptop lap: laps){
       System.out.println(lap + " : " + lap.getPrice() + "  " + lap.ordinal());
       }
    }
}
