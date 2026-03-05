package daily;

class A{
    void show1(){
        System.out.println("show method from A");
    }
}

class B extends A{
    void show2(){
        System.out.println("show method from B");
    }
}

public class Main{
    public static void main(String[] args) {
        A obj = new B();  
        B obj2 = (B) obj;
        obj2.show1();
    }
}