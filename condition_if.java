import java.util.Scanner;

public class condition_if {
    public static void main(String args[]){
        
        int pwd;
        System.out.print("Enter your password: ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if(pwd==2731){
            System.out.println("My name is Himanshu");
            System.out.println("My age is 23");
            System.out.println("My address is Uttrakhand");
            System.out.println("my contact is 546543423");
        }
        else{
            System.out.println("The Password is Wrong!");
        }
        s.close();

    }
}
