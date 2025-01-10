class A extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class threadPriority {
    public static void main(String[] args){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("T1 Thread");
        t2.setName("T2 Thread");
        t3.setName("T3 Thread");

        t1.setPriority(4);
        t2.setPriority(10);
        t3.setPriority(2);

        t1.start();
        t2.start();
        t3.start();

    }
}
