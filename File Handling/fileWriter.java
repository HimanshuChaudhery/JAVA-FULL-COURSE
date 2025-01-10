import java.io.*;

public class fileWriter {
    public static void main(String[] args){

        try{
            FileWriter f = new FileWriter("C:\\Users\\Admin\\Desktop\\JAVA FULL COURSE\\File Handling\\LC.txt");
            try{
                f.write("Java is best programming language");
            }
            finally{
                f.close();
            }
            System.out.println("File wrote Successfully");
        }
        catch(IOException i){
            System.out.println(i);
        }

    }
}
