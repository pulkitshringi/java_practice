package daily;
import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
            File file1 = new File("src/daily/pooki.txt");
            FileWriter writer = new FileWriter(file1);
            try{
            writer.write("I have overriden the text :) \n");
            writer.write("I'm in new line hehe\n"); 
            writer.write(97); 
            }
            catch(Exception e){}
            finally{
                writer.close(); // always close it at end 
            };

       }    
};
