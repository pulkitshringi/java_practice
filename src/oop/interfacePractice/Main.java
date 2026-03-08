package oop.interfacePractice;

abstract class First{
    public abstract void func(); 
    public abstract void func2(); 
    public void normal(){ 
        System.out.println("Normal Function");
    }
}

 abstract class Second extends First{
    @Override
    public void func(){
        System.out.println("I'm func");
}
}

class Third extends Second{
    @Override
    public void func2(){  // implemented here
        System.out.println("I'm func2");
    }
}


public class Main {
    public static void main(String[] args) {
    First obj = new Third();
    obj.func();
    obj.func2();
    }
}
