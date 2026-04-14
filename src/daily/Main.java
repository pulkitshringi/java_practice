package daily;
import java.util.*;

class Student{
    private String name;
    private int age;
    // constructor 
    public Student(String name) {
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
        List<Student> s1 = new ArrayList<>();
       s1 = l1.stream().map(Student::new).toList(); 
       System.out.println(s1);
    }
};
