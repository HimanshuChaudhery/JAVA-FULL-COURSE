public class multipleCatch {
    public static void main(String[] args){
        try{
            int a=10,b=5,c;
            c= a/b;
            System.out.println(c);

            int arr[] = {1,2,3,4};
            System.out.println(arr[7]);

            String n = null;
            System.out.println(n.charAt(7));
        }
        catch(ArithmeticException e){
            System.out.println("AM");
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("AIOOBE");
        }
        catch(Exception m){
            System.out.println("EEEE");
        }
    }
}
