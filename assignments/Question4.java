import java.util.*;
/*
Construct a Java program that checks if a given string is a palindrome (reads the same forwards and backwards). Prompt the user to input a string and display whether it's a palindrome or not.
*/
class Question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        boolean isPalindrome = true;
        String str = sc.next();
        for(int i = 0;i <= str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println("Is Palindrome");
        else System.out.println("Not palindrome.");
    }
}

