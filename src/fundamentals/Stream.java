package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            nums.add((int) (Math.random() * 100) + 1); // adding 10 thousand random values.
        }
        // sequential stream (normal)
        long startSeq = System.currentTimeMillis();
        int sum1 = nums.stream().mapToInt(x -> {
            try {
                Thread.sleep(1); // waiting 1 milliseconds 
            } catch (Exception e) {
            };
            return x * 2;

        }).sum();
        long endSeq = System.currentTimeMillis();

        // parallel stream
        long startPara = System.currentTimeMillis();
        int sum2 = nums.parallelStream().mapToInt(x -> {
            try {
                Thread.sleep(1); // waiting 1 milliseconds 
            } catch (Exception e) {
            };
            return x * 2;
        }
        ).sum();
        long endPara = System.currentTimeMillis();

        System.out.println("Time taken by sequential stream = " + (endSeq - startSeq) + " miliseconds");
        System.out.println("Time taken by parallel stream = " + (endPara - startPara) + " miliseconds");
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
