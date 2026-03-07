package fundamentals.arrays;
import java.util.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int[] x: arr){
            for(int y:x){
                System.out.print(y + " ");
            }
        }
    }
}