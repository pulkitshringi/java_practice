package data_structures.collections;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>();
            obj.add(42);
            obj.add(16);
            obj.add(53);
            obj.add(19);
            Comparator<Integer> cmp = (no1,no2) -> no1%10<no2%10?-1:1;
            Collections.sort(obj,cmp); // passing it here
            System.out.println(obj);
            };  
        };

        