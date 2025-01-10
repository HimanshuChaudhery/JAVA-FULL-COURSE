class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}

public class UserDefinedException {
    public static void main(String[] args){
        try{
            vote(12);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not Eligible for vote"); // we have to make a class of this exception otherwise Userdefined exception will not going to work.
        }
        else{
            System.out.println("You are eligible for vote");
        }
    }
}
