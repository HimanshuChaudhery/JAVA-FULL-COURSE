package Homework;
import java.util.Scanner;
public class for_hw {

    public static void main(String args[]){
        int num;
        System.out.println("Enter any number: ");
        Scanner s =  new Scanner(System.in);
        num=s.nextInt();

        for(int i =1 ;i<=num;i++){
            System.out.println(i);
        }
        s.close();
    }

}

