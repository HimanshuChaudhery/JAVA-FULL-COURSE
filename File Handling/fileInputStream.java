// Reading fram a file
import java.io.*;

public class fileInputStream {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\JAVA FULL COURSE\\File Handling\\LC.txt");
            try{
                int i;
                while((i=fis.read()) != -1){
                    System.out.print((char)i);
                }
            }
            finally{
                fis.close();
            }
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
}
