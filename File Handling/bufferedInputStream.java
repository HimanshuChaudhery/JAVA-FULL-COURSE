import java.io.*;
public class bufferedInputStream {
    public static void main(String args) throws IOException{
        FileInputStream f = new FileInputStream("C:\\Users\\Admin\\Desktop\\JAVA FULL COURSE\\File Handling\\LC.txt");
        BufferedInputStream b = new BufferedInputStream(f);
        int i;
        while((i=b.read())!=-1){
            System.out.println((char)i);
        }
        b.close();
    }
}
