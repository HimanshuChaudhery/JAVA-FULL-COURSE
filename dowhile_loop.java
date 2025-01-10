import java.util.Scanner;

public class dowhile_loop {
    public static void main(String args[]){
        int num;
        int i = 1;

        System.out.println("Enter any number: ");
        Scanner s = new Scanner(System.in);
        
        num = s.nextInt();
        
        do{
            System.out.println(i+" ");
            ++i; // pre increment
        }
        while(i<=num);

        s.close();

    }
}
