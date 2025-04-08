// package unit 6.multithreading.second thread;


class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t= new Thread (this,"Demo Thread");
        System.out.println("child thread," +t);
        t.start();


    }

    public void run (){
        try {
            for (int i= 5;i>0; i--){
                System.out.println("child thread," +i);
                Thread.sleep(500);
            }

            
        } catch ( InterruptedException e) {
            System.out.println("Child interrupted.");

        }
        System.out.println("existing child thread");

    }
}

public class thread {
    public static void main(String[] args) {
        new NewThread ();

        try {
            for (int i = 5 ; i > 0; i--){
                System.out.println("main Thread," + i);
                Thread.sleep(1000);
            }
            
        } catch(InterruptedException e) {
            System.out.println("main thread interrupted");

        }
        System.out.println("main thread existing.");
        
    }


    
}
