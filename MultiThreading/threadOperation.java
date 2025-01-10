// By Extending Thread class

class A extends Thread 
{
    @Override
    public void run() // This method is alrady available in thrad class we are jsut overriding it.
    {
        try{
            for(int i=1; i<=5; i++){
                System.out.println("Himanshu");
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException i){
            System.out.println(i);
        }
    }
}

public class threadOperation {
    public static void main(String[] args) throws InterruptedException{
        A obj = new A();
        obj.run(); // Start() to run the thread.

        for(int i = 1; i<=5; i++){
            System.out.println("Rahul");
            Thread.sleep(1000);
        }
    }
}
