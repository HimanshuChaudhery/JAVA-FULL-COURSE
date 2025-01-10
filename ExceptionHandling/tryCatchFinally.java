public class tryCatchFinally {
    
    public static void main(String[] args){
        // No Exception
        try{
            System.out.println("Learn Coding");
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Like Share");
        }catch(ArithmeticException a){
            System.out.println("Can't divide by zero");
            // System.out.println(z);
        }
        finally
        {
            System.out.println("Susbscribe");
            // int m=10,n=0,o;
            // o=m/n;
            // System.out.println(o);
        }
        System.out.println("Himanshu");

    }

}
