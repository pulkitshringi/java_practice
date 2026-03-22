package data_structures.collections;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("pooki",100);
        mp.put("mitu", 101);
        mp.put("sohpy", 200);
        mp.put("pooki", 42); 
        for(Map.Entry<String, Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    };
}