package daily;
import java.time.*;

class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
    }
};
