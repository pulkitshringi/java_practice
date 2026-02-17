package daily.feb_26;
class Main{
    public static void main(String[] args) {
}

}
class Smartphone{
    static String name;
    String brand;
    int price;

    static void show(Smartphone s1){  // passing instance as argument
        System.out.println(name + " " + s1.brand + " " + s1.price);
    }
}
