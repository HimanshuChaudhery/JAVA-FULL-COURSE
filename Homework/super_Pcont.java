package Homework;

class A{
    A(int a){
        System.out.println("Hello Viewer"+a);
    }
}

class B extends A{
    B(){
        super(100);// It is important to write super keyword when we have parameterized constructor in super class. 
        System.out.println("Hello Learner");
    }
}

public class super_Pcont {
    public static void main(String[] args) {
        B obj = new B();
    }
}
