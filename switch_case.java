import java.util.Scanner;

public class switch_case {
    public static void main(String Args[]){
        int a,b,c,ch;
        System.out.println("Enter two numbers: ");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();

        System.out.println("Enter your choice from 1 to 5:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Reminder");
        System.out.println("5.Divide");
        ch=s.nextInt();

        switch(ch){

            case 1:
                c=a+b;
                System.out.println("The result is "+c);
                break;

            case 2:
                c=a-b;
                System.out.println("The result is "+c);
                break;

            case 3:
                c=a*b;
                System.out.println("The result is "+c);
                break;

            case 4: 
                c=a%b;
                System.out.println("The result is "+c);
                break;

            case 5: 
                c=a/b;
                System.out.println("The result is "+c);
                break;

            default:
                System.out.println("Input is invalid");
                break;
        }
        s.close();
    }
}
