import java.util.Scanner;

public class throwsDemo {

    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i<=a; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
        sc.close();
    }
}