class A{
    int x,y;
    A(int a, int b) // Parameterized Constructor
    {
        x = a;
        y = b;
    }

    A(int a, String b){
        System.out.println(a+" "+b);
    }

    void disp(){
        System.out.println(x+" "+y);
    }
}

public class parameterized_constructor {
    public static void main(String[] args){
        A obj = new A(100,200);
        A ref = new A(20,"Peter");
        obj.disp();
    }
}
