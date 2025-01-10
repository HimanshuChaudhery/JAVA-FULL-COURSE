class A{
    int a;
    String name;
    /*A() // Constructor
    {
        a = 0;
        name = null;
        System.out.println("Himanshu");
    }*/

    void show() // Normal method
    {
        System.out.println(a+" "+name);
    }
}

public class constructor {
    public static void main(String[] args) {
        // Object Creation
        A obj = new A(); // Constructor will call itself automatically during object creation.
        obj.show();
    }
}

