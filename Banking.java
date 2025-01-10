import java.util.Scanner;

class Bank{
    private double bal = 5000;
    private int pwd; // Password

    public void Deposite(double money){
        System.out.println("Enter the password: ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        if(pwd==123){
            bal=bal+money;
            System.out.println("Deposited Money: "+money);
            System.out.println("Total Balance: "+bal);
        }
        else{
            System.out.println("Wrong Password");
        }
        sc.close();
    }

    public void Withdraw(double money){
        System.out.println("Enter the password: ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        if(pwd==123){
            bal = bal - money;
            System.out.println("Money Withdwarn : "+money);
            System.out.println("Total Balance: "+bal);
        }
        else{
            System.out.println("Password is incorrect.");
        }
        sc.close();
    }

    public void CheckBalance(){
        System.out.println("Enter the Password: ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        if(pwd==123){
            System.out.println("The Balance is "+bal);
        }
        else{
            System.out.println("Wrong Password");
        }
        sc.close();
    }

}

public class Banking {
    public static void main(String[] args){
        Bank obj = new Bank();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i==1){
            System.out.println("WElCOME TO CANERA BANK...");
            System.out.println("Choose your options");
            System.out.println(" 1.Deposite Money\n 2.Withdraw Money\n 3.Check Balance\n 4.Exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1: obj.Deposite(1000);
                break;

                case 2: obj.Withdraw(2000);
                break;

                case 3: obj.CheckBalance();
                break;
                
                case 4: i = 1;
                break;

                default: System.out.println("Invalid Option");
                break;
            }
        }
        sc.close();
    }
}
