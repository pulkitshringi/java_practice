package daily.feb_26;

 class Another{
    private int no;  // private
    public void func(int no){
        this.no = no+10;
        System.out.println(this.no);
    }
}

public class Main{
    public static void main(String[] args) {
        Another a1 = new Another();
        a1.func(42);
    }
}