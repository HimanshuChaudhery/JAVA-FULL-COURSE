package Homework;

import java.util.Scanner;

public class nested {
    public static void main(String args[]){
        int num1,num2, num3;
        System.out.println("Enter the three numbers: ");
        Scanner obj = new Scanner(System.in);
        num1=obj.nextInt();
        num2=obj.nextInt();
        num3=obj.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("Num1 is Greater");
            }
            else{
                System.out.println("Num3 is greater");
            }
        }

        else{
            if(num2>num3){
                System.out.println("Num2 is greater");
            }
            else{
                System.out.println("Num3 is greater");
            }
        }
        obj.close();

    }
}
