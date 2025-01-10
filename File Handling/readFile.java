import java.io.*;

public class readFile {
    public static void main(String[] args){
        try{
            FileReader f = new FileReader("C:\\Users\\Admin\\Desktop\\JAVA FULL COURSE\\File Handling\\LC.txt");
            try{
                int i;
                while((i=f.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                f.close();
            }
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
}
