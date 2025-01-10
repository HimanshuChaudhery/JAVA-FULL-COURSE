import java.util.Scanner; 
// Using Scanner class from util package, we will not use "*" on util bacause it will make out program slow

public class A {
    public static void main(String[] args) {
        
        int a,b,c;
        System.out.println("Enter any two numbers: ");
        Scanner s = new Scanner(System.in); // System.in for taking input from user.

        // nextInt() is a method of Scanner class which is defining which type of input to take from user. 
        a=s.nextInt();
        b=s.nextInt();

        c=a+b;
        System.out.println("Sum of two numbers: "+c);
        s.close();
    }
    
}
