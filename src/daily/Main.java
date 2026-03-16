package daily;

import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int[] arr = new int[3];
        int j = 0;
        int i;
        try {
            arr[3] = 1;
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("you are accessing out of index :)");
            System.out.println(e);
        }
        try{            
            i = 10/j;
        }
        catch(ArithmeticException e){
            System.out.println("dividing by zero :/");
            System.out.println(e);
        }
        System.out.println(Arrays.toString(arr));
    }
}
