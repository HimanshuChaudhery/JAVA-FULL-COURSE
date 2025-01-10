import java.util.Scanner;

//WE will use will loop when we don't know how many times the statement get executed.
public class while_loop {
    public static void main(String args[]){
        int num;
        int i = 1;
        System.out.println("Enter any number: ");
        Scanner s =  new Scanner(System.in);
        num=s.nextInt();

        while(i<=num){
            System.out.println(i);
            i=i+1;
        }
        s.close();
    }
}
