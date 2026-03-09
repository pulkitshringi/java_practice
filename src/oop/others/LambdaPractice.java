package oop.others;

@FunctionalInterface
interface A{
    void show();
}

public class LambdaPractice {
    public static void main(String[] args) {
            A obj = () -> {
                System.out.println("hey boy");
            };
    obj.show();
    }
}

