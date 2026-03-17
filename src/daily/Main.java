package daily;
import java.io.FileReader;

class Other{
    public void d() throws ClassNotFoundException{
        Class.forName("daily.Main"); // no error as Class 'Main' exists
    }
    public void e() throws ClassNotFoundException{
        Class.forName("daily.Animal"); // error as class does not exist
    }
}
class Main{
    public static void main(String[] args){

        Other obj = new Other();
        try {
            obj.d();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            obj.e();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("last statement");
    }
}