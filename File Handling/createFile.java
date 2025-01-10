import java.io.*;

public class createFile{
    public static void main(String[] args) throws IOException{
        File f = new File("C:\\Users\\Admin\\Desktop\\JAVA FULL COURSE\\File Handling\\LC.txt");
        // try{
        //     if(f.createNewFile()){
        //         System.out.println("File Created Successfully!....");
        //     }
        //     else{
        //         System.out.println("Already existed file!....");
        //     }
        // }
        // catch(IOException i){
        //     System.out.println(i);
        // }

        if(f.createNewFile()){
            System.out.println("File Created Successfully!....");
        }
        else{
            System.out.println("Already existed file!....");
        }
    }
}