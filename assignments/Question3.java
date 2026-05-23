/* 
 3. Create a Java program to calculate the simple interest. Ask the user to input principal amount, interest rate, and time period. Calculate and display the simple interest.
import java.util.*;
*/
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter principal amount, interest rate, and time period");
        Scanner sc = new Scanner(System.in);
        double principalAmount = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double simpleInterest = (principalAmount * rate * time) / 100;

        System.out.println("simple interest is " + simpleInterest);
    }
}
