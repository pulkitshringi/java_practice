package daily;

interface Computer{
    void coding();
}
class Desktop implements Computer{
    @Override
      public void coding(){
        System.out.println("Coding from Desktop");
    }
}

class Laptop implements Computer{
    @Override
    public void coding(){
        System.out.println("Coding from laptop");
    }
}

class Developer{
    public void writeCode(Computer obj){ 
        obj.coding();
    }
}

public class Main{
    public static void main(String[] args) {
    Developer obj = new Developer();
    Computer comp = new Desktop();
     obj.writeCode(comp);
     comp = new Laptop();
     obj.writeCode(comp);
    } 
}
