package oop.classes;
// creating a calculator class which adds two number.
public class Main{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(42, 69);
        System.out.println(result);
    }
}
class Calculator{
    public int add(int no1, int no2){
        return no1+no2;
    }
}
