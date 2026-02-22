package oop.inheritance;

class Calculator{
    public int sum(int no1, int no2){
        return no1+no2;
    }
    public int sub(int no1, int no2){
        return no1-no2;
    }
}

class AdvCalculator extends Calculator{
    public int prod(int no1, int no2){
        return no1*no2;
    }
    public int div(int no1, int no2){
        return no1/no2;
    }
}

public class Main {
    public static void main(String[] args) {
        AdvCalculator c1 = new AdvCalculator();
        System.out.println(c1.sum(12, 69));
        System.out.println(c1.sub(12,6));
        System.out.println(c1.prod(2,4));
        System.out.println(c1.div(4,4));

    }
}
