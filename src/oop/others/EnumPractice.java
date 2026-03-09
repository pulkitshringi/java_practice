package oop.others;
import java.util.Arrays;

enum Status{
    Running, Success, Waiting, Failed
};

public class EnumPractice {
    public static void main(String[] args){
        Status s1 = Status.Failed;
        switch(s1){
            case Running: System.out.println("We are running"); break;
            case Waiting: System.out.println("we are waiting");break;
            case Success: System.out.println("Website has loaded"); break;
            default: System.out.println("Website has failed");
        }
    }
}
