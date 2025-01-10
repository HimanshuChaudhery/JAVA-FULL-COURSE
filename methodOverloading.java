// Compile time polymorphism also knowns as early binding as known as Static polymorphism

class A{
    public int cal(int a,int b){
        return a+b;
    }

    public int cal(int a, int b, int c){
        return a+b+c;
    }
}

public class methodOverloading {
    public static void main(String[] args){
        A obj = new A();
        System.out.println("The sum of two number is: "+obj.cal(4,5));
        System.out.println("The sum of two number is: "+obj.cal(4,5,6));
    }
}
