package daily;

import jdk.jshell.spi.ExecutionControl;

class First implements Runnable {

    @Override
    public void run() {
    }
;

}
class Second implements Runnable {

    @Override
    public void run() {
    }
;

}


class Main {

    public static void main(String[] args) {
        Runnable obj1 = new First() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("i'm here to stay");
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }
                }

            }
        };
        Runnable obj2 = new Second() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Win.");
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }
                }

            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
