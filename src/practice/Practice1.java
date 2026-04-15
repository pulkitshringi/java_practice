package practice;
import java.util.*;

class Practice1{
    private String name;
    private int age;
    // constructor 
    public Practice1(String name) {
        this.name = name;
        this.age = 69;
    }
    // getters
    public String getName() {
        return name;
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}

class Main {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("Pooki", "Sophy", "Mitu"));
        List<Practice1> s1 = new ArrayList<>();
       s1 = l1.stream().map(Practice1::new).toList(); 
       System.out.println(s1);
    }
};
