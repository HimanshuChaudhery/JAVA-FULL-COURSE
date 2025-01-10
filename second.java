public class second{

    int a = 10; //Instance Variable
    static double b = 20.5; //Static variable
    public static void main(String[] args) {
        
        boolean c = true; // local variable

        second s = new second(); 
        /* Since "a" is variable of class it can only be accessed using object */
        System.out.println(s.a);
        System.out.println(b); // Static variable can be accessed directly without any object 
        System.out.println(c);

        System.out.println(s.a+" "+b+" "+c); // Concatination
    }
}