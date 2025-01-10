class A{
    int a;
    String name;
    A(){
        a = 10;
        name = "Learn Coding";
        System.out.println(a+" "+name);
    }

    A(A ref) // Create a copy construtor
    {
        a=ref.a;
        name=ref.name;
        System.out.println(a+" "+name);
    }
}

public class copy__constructor {
    public static void main(String[] args){
        A obj = new A();
        A obj2 = new A(obj); // Calling a copy Constructor 
    }
}
