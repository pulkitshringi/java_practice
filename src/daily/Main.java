package daily;

class A{
    public void func(){
        System.out.println("I am func");
    }
}

public class Main{
    public static void main(String[] args) {
        A obj = new A(){    // anonymous inner class
            @Override
            public void func(){
                System.out.println("I'm func (updated)");
            }
        };
        obj.func();

        A obj2 = new A(); // however remains same for other instance
        obj2.func();
    } 
}
