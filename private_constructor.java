public class private_constructor {

    // private_constructor(){ Default Construtor

    // }
    int a; double b; String c;
    private private_constructor() //Private Constructor
    {
        a = 10; b = 59.69; c="FullStack";
        System.out.println(a+" "+b+" "+c);
    }

    // Private constructor can only be accessed within same class.
    // It can be accessed in other class.

    public static void main(String[] args) {
        private_constructor obj = new private_constructor();
    }
}
