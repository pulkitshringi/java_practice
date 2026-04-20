package practice;

public class UnitTesting {
    public static void main(String[] args) {
        Calc c1 = new Calc();

        // input 1
        int num1 = 10;
        int num2 = 5;
        // result 1
        int result1 = c1.divide(num1, num2);

        if(result1==2){
            System.out.println("test case passed.");
        }
        else System.out.println("test case failed.");

        // input 2
            num1 = 21;
            num2 = 3;
        // result 2
        int result2 = c1.divide(num1, num2);

        if(result2==7) System.out.println("test case passed.");
        else System.out.println("test case failed.");
    }
}
