package daily;

interface A{
    void show(); // public abstract
    default void show2(){  // use default to add non abstract method
        System.out.println("i can have body");
    }
}
class B implements A{
    @Override
    public void show(){
        System.out.println("show");
    }
}

public class Main{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.show2();
    } 
}
