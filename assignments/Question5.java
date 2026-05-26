import java.util.*;
// Create a simple Java game where the computer generates a random number, and the user has to guess it within a certain number of attempts. Provide hints like "higher" or "lower" for incorrect guesses.
public class Question5 {
    public static void main(String[] args) {
        int rand = (int) (Math.random()*10)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your guess b/w 1 and 10");
        int guess = sc.nextInt();
        while(true){
            if(guess==rand){
                System.out.println("you guessed correctly :)"); break;
            }
            else if(guess<rand) System.out.println("higher");
            else System.out.println("lower");
            guess = sc.nextInt();
        }
    }
}
