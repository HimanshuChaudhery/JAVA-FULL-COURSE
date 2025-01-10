// Runnable interface has only one method call run() method and the statement inside this block is it's job.

//defining a thread
class A implements Runnable{
    public void run()
    {
        // Job of thread
        for(int i=1;i<=5;i++){
            System.out.println("Peter");
        }

    }
}

public class threadRunnable {
    public static void main(String[] args){
        A r = new A();
        Thread t = new Thread(r); // Reason we make a object of Thread class because we need start() method to run a defined thread which is only available in Thread class not in Runnnable Interface.
        // We use class object as parameter to tell Thread class to execute run() method of  interface.
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("Main Thread");
        }
    }
}
