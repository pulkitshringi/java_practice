package fundamentals.arrays;

class Other{
    private int data;
    public void setData(int data){
        this.data = data;
        System.out.println(this.data);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Other[] arr = new Other[3];
        arr[0] = new Other();
        arr[0].setData(69);
        arr[1] = new Other();
        arr[1].setData(23);
        arr[2] = new Other();
        arr[2].setData(44);
    }
}
