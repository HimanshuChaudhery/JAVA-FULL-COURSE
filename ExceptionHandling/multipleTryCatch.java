public class multipleTryCatch {
    public static void main(String[] args){
        int a=10,b=0,c;
        String name = null;
        int arr[] = {1,2,3,4};

        try{
            c=a/b;

        }catch(ArithmeticException e){
            System.out.println("You cannot divide number with zero");
        }

        try{
            System.out.println(name.charAt(4));
        }catch(NullPointerException n){
            System.out.println("This is BHARAT");
        }

        try{
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException u){
            System.out.println("NO FIFTH ELEMENT EXIST");
        }
    }
}
