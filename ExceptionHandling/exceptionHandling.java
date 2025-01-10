// Why we need to do Exception Handling ?
// Ans: So, the flow of the program be maintained.

public class exceptionHandling {

    public static void main(String[] args){

        System.out.println("Main Method Started");

        int a=10,b=0,c;

        // For predefined Exceptions
        try{
            c=a/b; //c = 10/0
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Can't divide by zero");
        }

        System.out.println("Main Method ended");
    }
}

