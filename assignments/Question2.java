/*
2. Create a class named "Car" with attributes like make, model, and year. Implement methods to set and display these attributes for different car objects.
*/
class Car{
  private String name;
    private String model;
    private int year;
    public void setCar(String name, String model, int year){
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public void getCar(){
        System.out.println("name : " + name + "\nmodel: " + model + "\nyear: " + year);
    }
}

public class Question2 {
    public static void main(String[] args) {
          Car obj = new Car();
          obj.setCar("Volvo", "XC90", 2026);
          obj.getCar();
    }
}

