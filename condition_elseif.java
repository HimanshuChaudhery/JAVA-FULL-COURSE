import java.util.Scanner;

public class condition_elseif {
    public static void main(String args[]){
        int marks;
        System.out.print("Enter your marks: ");
        Scanner obj = new Scanner(System.in);
        marks=obj.nextInt();

        if(marks>=60 && marks<=100){
            System.out.println("First Division");
        }

        else if(marks>=40 && marks>=59){
            System.out.println("Second Division");
        }

        else if(marks>=33 && marks<=40){
            System.out.println("Third Division");
        }

        else{
            System.out.println("Failed....");
        }
        obj.close();
    }
}
