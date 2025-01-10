public class nested_ifelse {

    public static void main(String args[]){
        int num1=10,num2=15, num3=20;

        if(num1>num2){
            if(num1>num3){
                System.out.println("Num1 is Greater");
            }
            else{
                System.out.println("Num3 is greater");
            }
        }

        else{
            if(num2>num3){
                System.out.println("Num2 is greater");
            }
            else{
                System.out.println("Num3 is greater");
            }
        }

    }

}