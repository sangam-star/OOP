


class MyThreadA implements Runnable{
    
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("runnable1: " + i);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
             

        }

    }
}


class MyThreadB implements Runnable{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("runnable2 : " + i);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
             

        }

    }
}

public class threadd {
    public static void main(String[] args) {
        MyThreadA a = new MyThreadA();
        MyThreadB b = new MyThreadB();
        Thread t1 = new Thread(a);  
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
    
}
