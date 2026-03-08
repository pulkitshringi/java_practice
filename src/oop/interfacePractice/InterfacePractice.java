package oop.interfacePractice;

interface A{
    void func();
}

interface B extends A{
    void func2();
}

 class C implements A,B{  
    @Override
    public void func(){
        System.out.println("Func :)");
    }
    @Override
    public void func2(){
        System.out.println("Func 2");
    }
}

public class InterfacePractice {
    public static void main(String[] args){
        B obj = new C();
        obj.func();
        obj.func2();
    }
}