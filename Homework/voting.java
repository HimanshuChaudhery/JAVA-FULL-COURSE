package Homework;
import java.util.Scanner;
public class voting {
    public static void main(String[] args) {
        int age;

        System.out.print("Enter your age: ");
        Scanner s = new Scanner(System.in);
        age=s.nextInt();
        
        if(age>=18){
            System.out.println("You are eligible for voting.");
        }
        else{
            System.out.println("Not eligible for voting.");
        }
        s.close();
    }
}
