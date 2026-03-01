package daily;
class A{
    String name;
    int age;
    
    @Override
    public String toString(){
        return "Name : " + name + "\nAge: " + age;
    }
}

public class Main{
    public static void main(String[] args) {
        A obj = new A();
        obj.name = "pooki";
        obj.age = 23;
        System.out.println(obj);
    }
}