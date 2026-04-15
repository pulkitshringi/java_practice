package daily;
import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
       String filepath = "src/daily/pooki.txt";
       String dirpath = "src/daily/pookiFolder";
       String rootFolder = "src";
       File file1 = new File(rootFolder);
       String[] totalFiles = file1.list();
       System.out.println(Arrays.toString(totalFiles));
       }    
};
