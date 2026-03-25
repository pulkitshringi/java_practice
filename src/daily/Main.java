package daily;
import java.lang.reflect.Array;
import java.util.*;

class Human{
    void sleep(){
        System.out.println("Human sleeps.");
    }
}

class Employee extends Human{
    @Override
    void sleep(){
        System.out.println("Employee sleeps.");
    }
}
class Developer extends Employee{
    @Override
    void sleep(){
        System.out.println("Developer sleeps.");
    }
}

class Main {

    public static void main(String[] args) {
        List<Human> h1 = new ArrayList<>(Arrays.asList(new Human()));
        List<Employee> e1 = new ArrayList<>(Arrays.asList(new Employee()));
        List<Developer> d1 = new ArrayList<>(Arrays.asList(new Developer()));
            func(h1);
            func(e1);
            func(d1);
    }
    public static void func(List<? extends Human> l1){
        for(Human obj: l1){
            obj.sleep();
        }
    }
};
