/*
Create a Java program that functions as a basic calculator. It should take two numbers and perform operations like addition, subtraction, multiplication, and division based on user input.
*/
import java.util.*;
public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1;
        int no2;
        System.out.println("Enter no1 and no2");
        no1 = sc.nextInt();
        no2 = sc.nextInt();
        System.out.println("Addition: " + (no1+no2));
        System.out.println("Subtraction: " + (no1-no2));
        System.out.println("Multiplication: " + (no1*no2));
        System.out.println("Division: " + (no1/no2));
    }
}