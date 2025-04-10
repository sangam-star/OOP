class MyThreadA extends Thread {
    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println("runnable1: " + i);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class MyThreadB extends Thread {
    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println("runnable2: " + i);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Threadd {
    public static void main(String[] args) {
        MyThreadA a = new MyThreadA();
        MyThreadB b = new MyThreadB();

        a.start();  // Start the first thread
        b.start();  // Start the second thread
    }
}
