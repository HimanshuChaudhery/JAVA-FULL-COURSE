// MultiDimensional array also called 2D array
import java.util.Scanner;
public class multiD_array {
    public static void main(String args[]){
        int arr[][] = new int[2][2];
        System.out.print("Enter Array Elements:");
        Scanner obj = new Scanner(System.in);
        for(int i =0; i<2; i++){
            for(int j =0; j<2; j++){
                arr[i][j]=obj.nextInt();
            }
        }

        System.out.println("2D array elements");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        obj.close();
    }
}
