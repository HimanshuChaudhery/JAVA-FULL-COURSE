import java.util.Arrays;
import java.util.Scanner;

public class arrayClass {
    public static void main(String args[]){
        
        // int arr[] = {10,20,30,40,50};

        Scanner s = new Scanner(System.in);
        int arr[] = new int[5]; // Use this in java
        System.out.print("Enter array elements: ");
        for(int i=0;i<5;i++){
            arr[i]=s.nextInt();
        }

        // for each loop
        System.out.print("\nArray elements: ");
        for(int b:arr){
            System.out.print(b+" ");
        }
        s.close();

        // Sorting elements of array using predefined sort() from "Arrays" Class.
        Arrays.sort(arr);

        System.out.print("\nSorted Array elements: ");
        for(int b:arr){
            System.out.print(b+" ");
        }
    }
}
