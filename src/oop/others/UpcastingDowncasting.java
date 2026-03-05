package oop.others;

class A{
    void show1(){
        System.out.println("show1 from A");
    }
}
class B extends A{
    @Override
    void show1(){
        System.out.println("show1 from B");
    }
    void show2(){
        System.out.println("show2");
    }
}

public class UpcastingDowncasting {
  public static void main(String[] args) {
     A obj = new A();
     if(obj instanceof B obj2){
        obj2.show2();
     }
     else System.out.println("Not instance of B");


  }
}
