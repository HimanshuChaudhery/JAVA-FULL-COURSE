import java.util.Scanner;

public class Revision {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int ans;

        System.out.println("Testing a exception");
        //Exception handling
        try{
            ans=a/b;
            System.out.println("The Answer is "+ ans);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        finally{
            System.out.println("THe value of a "+ a);
        }

        // Throw
        // if(a<0){
        //     throw new InvalidException("The answer is even");
        // }
        // else{
        //     System.out.println("The is Odd");
        // }

        //throws
        for(int i = 1; i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Finishing the program");
        sc.close();
    }
}
