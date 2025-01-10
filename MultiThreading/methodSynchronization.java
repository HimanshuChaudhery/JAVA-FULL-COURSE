class Bus implements Runnable{
    int available = 1, passenger;
    Bus(int passenger){
        this.passenger = passenger;
    }
    public synchronized void run(){
        String n = Thread.currentThread().getName();
        if(available>=passenger){
            System.out.println(n);
            available = available-passenger;
        } 
        else{
            System.out.println("Not seats available");
        }
    }
}

public class methodSynchronization {
    public static void main(String[] args) {
        Bus obj = new Bus(1);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);

        t1.setName("Raja");
        t2.setName("Babu");
        t3.setName("hello");

        t1.start();
        t2.start();
        t3.start();
    }
}
