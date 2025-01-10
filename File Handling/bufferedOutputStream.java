import java.io.*;

public class bufferedOutputStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\JAVA FULL COURSE\\File Handling\\LC.txt");
            BufferedOutputStream b = new BufferedOutputStream(fos);
            String s = "Java is best programming Language";
            byte a[] = s.getBytes();
            try{
                b.write(a);
            }
            finally{
                b.close();
                fos.close();
            }
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
}
