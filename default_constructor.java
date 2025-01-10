class A{
    int a;
    String b;
    boolean c;
    A() // Default constructor
    {
        a = 10;
        b = "RAHUL";
        c = true;
    }
    
    void Disp(){
        System.out.println(a+" "+b+" "+c);
    }
}

public class default_constructor {
    public static void main(String[] args){
        A obj = new A();
        obj.Disp();
    }
}
