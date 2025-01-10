class student{
    int roll_no;
    String name;
    // private int number; 
    protected int num;
    void ask(){
        System.out.println("What is your rollno and name: ");
    }
}

class result extends student{
    void show(){
        roll_no = 21;
        name = "Peter";
        // number = 98765432; // Only accessible in the class where it is declared.
        num = 8765674;
        System.out.println(roll_no+" "+name+" "+num);
    }
}

public class single_inheri {
    public static void main(String[] args){
        result a = new result();
        a.ask();
        a.show();
    }
}
