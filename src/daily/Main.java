package daily;

class Counter{
    int counter = 0;
    public synchronized void increment(){
        counter++;
    }
}

class Main {

    public static void main(String[] args) {
        Counter cnt = new Counter();
        Runnable obj1 = () ->{
            for (int i = 0; i < 1000; i++) {
                cnt.increment();
            }
        };

        Runnable obj2 = () ->{
            for (int i = 0; i < 1000; i++) {
                cnt.increment();
            }
        };
        Thread t1 = new Thread(obj1); 
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        try{
        t1.join();  // waiting for thread 1 to complete
        t2.join(); // waiting for thread 2 complete
        }catch(Exception e){

        };
        System.out.println(cnt.counter);
    }
}
