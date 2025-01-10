
class A extends Thread{
    public void run(){
        String s = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){

        }
    }
}

public class suspendAndResumeThread {
    public static void main(String[] args){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Raja");
        t2.setName("Babu");
        t3.setName("Mena");

        t1.start();

        t2.start();
        t2.suspend();

        t3.start();

        t2.resume();

    }
}
