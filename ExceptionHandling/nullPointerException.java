public class nullPointerException {

    public static void main(String[] args){
        String s = null;
        try{
            System.out.println(s.charAt(4));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}