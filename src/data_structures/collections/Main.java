package data_structures.collections;
import java.util.*;

class Student{
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    };

    @Override
    public String toString(){ 
        return "Student name is " + name + " and age is " + age;
    }
}


public class Main {
    public static void main(String[] args) {
        List<Student> l1 = new ArrayList<>();
        l1.add(new Student("pooki", 23));
        l1.add(new Student("mitu", 21));
        l1.add(new Student("Chad", 69));
        Comparator<Student> cmp = (obj1, obj2) -> obj1.age - obj2.age;
        Collections.sort(l1, cmp);
        for(Student obj: l1){
            System.out.println(obj);
        }
            };  
        };

