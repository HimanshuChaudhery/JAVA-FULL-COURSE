// By Default priority will be Norm priority
class A extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
            Thread.yield();
        }
    }
}

class B extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}

public class yieldThread {
    public static void main(String[] args){
        A t1 = new A();
        B t2 = new B();

        t1.start();
        t2.start();

    }
}
