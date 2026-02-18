package daily.feb_26;
// 18th feb 26
class Human{
        private String name;
        private int age;
        public Human(){   
            name = "default name";
            age = 1;

        }
        public Human(String name, int age){  // constructor overloading 
            this.name = name; 
            this.age = age;
            System.out.println(this.name);
            System.out.println(this.age);
        }

        
    }
    
public class Main{
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human("pooki", 23);
    }
}