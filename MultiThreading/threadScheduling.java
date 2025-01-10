
class A extends Thread{
    @Override
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i = 1; i<=3; i++){
            System.out.println(n);
        }
    }
}

public class threadScheduling {
    public static void main(String[] args){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        // setName will have getName()
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
