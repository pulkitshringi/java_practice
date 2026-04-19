package daily;
import java.io.*;
import java.util.Arrays;

class Human implements Serializable{
    String name;
    transient int age; // won't be sent to file

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "name = " + name + " age = " + age;
    }
}

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
            FileInputStream fis = new FileInputStream("src/daily/pooki.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Human h1 = (Human) ois.readObject();
            System.out.println(h1);
            ois.close(); 
       }    
};
