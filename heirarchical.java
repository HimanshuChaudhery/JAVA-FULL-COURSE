class A{
    void ask(){
        System.out.println("What is your name :");
    }
}

class B extends A{
    void tell(){
        System.out.println("My name is Athony Golsalwhis");
    }
}

class C extends A{
    void tell(){
        System.out.println("My name is Amar RAJ SEXSENA");
    }
}

public class heirarchical {
    public static void main(String[] args){
        C obj1 = new C();
        B obj2 = new B();
        obj1.ask();
        obj1.tell();
        obj2.ask();
        obj2.tell();
    }
}
