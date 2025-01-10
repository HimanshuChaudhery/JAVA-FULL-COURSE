import java.io.*;

public class fileOutputStream {
    public static void main(String[] args){
        byte by[] = {'U','A','E'};
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\JAVA FULL COURSE\\File Handling\\LC.txt");
            try{
                fos.write(by);
            }
            finally{
                fos.close();
            }

        }
        catch(IOException i){
            System.out.println(i);
        }
    }
}