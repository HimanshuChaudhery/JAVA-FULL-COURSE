interface vehical{
    String Name = "TVS"; // public + static + final
    int speed = 100; // public + static + final

    void start(); // public + abstract
    void stop(); // public + abstract

    default void color(){
        System.out.println("TVS color is RED");
    }

    static void velocity(){
        System.out.println("TVS velocity is 100km/h");
    }
}

class Customer implements vehical{
    @Override
    public void start(){
        System.out.println("Start(): Insert the key and press start button");
    }

    @Override
    public void stop(){
        System.out.println("Stop(): exit key");
    }
}

public class interface_EX {
    public static void main(String[] args){
        Customer obj = new Customer();
        obj.start();
        obj.stop();
        obj.color();
        vehical.velocity(); // Correct way to call static method
    }
}
