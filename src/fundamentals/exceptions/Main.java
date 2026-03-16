package fundamentals.exceptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("hii pooki");
        int i = 5;
        int j = 0;
        try{
            j = 10/i;
        }
        catch(Exception e){
            System.out.println("Exception happened.");
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("bye pooki");
    }
}

