package daily;

import java.util.Objects;

class A{
    String name;
    int age;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final A other = (A) obj;
        if (this.age != other.age) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    
}

public class Main{
    public static void main(String[] args) {
        A obj = new A();
        obj.name = "mitu";
        obj.age = 23;
        A obj2 = new A();
        obj2.name = "pooki";
        obj2.age = 23;
        System.out.println(obj.equals(obj2)); 
    }
}