package oop.interfacePractice;

class A{

    int no;

    static class B{
        public void func(){
            System.out.println("I'm func inside class B");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj2 = new A.B();
        obj2.func();
    }
}
