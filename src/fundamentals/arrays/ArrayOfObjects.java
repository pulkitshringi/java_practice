package fundamentals.arrays;


class Another{
    public int no;
    public void hello(){
        System.out.println("I say hello when i'm in mood. " + no);
    }
}

public class ArrayOfObjects{     
    public static void main(String[] args) {
     Another[] arr = new Another[3];
     arr[0] = new Another();
     arr[0].no = 69;

     arr[1] = new Another();
     arr[1].no = 42;

     arr[2] = new Another();

    for(Another obj: arr){
        obj.hello();
    }
}
}