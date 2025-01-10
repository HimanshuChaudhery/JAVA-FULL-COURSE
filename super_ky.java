/* super keyword is used to access the methods,variables and constructor of super class(Parent Class) from sub class, when both have members of same name. */

class A{
    int a=10;
    void mess(){
        System.out.println("I am from Class A");
    }
}

class B extends A{
    int a =20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
    void mess(){
        super.mess();
        System.out.println("I am from class B");
    }
}

public class super_ky {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.mess();
    }
}
