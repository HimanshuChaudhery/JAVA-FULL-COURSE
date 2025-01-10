package Homework;

class A{
    int a;
    String name;
    A(int num, String n){
        a = num;
        name = n;
        System.out.println(a+" "+name);
    }

    A(A ref){
        a = ref.a;
        name = ref.name;
        System.out.println(a+" with "+name);
    }
}

public class constructor_P {
    public static void main(String[] args){
        A obj = new A(100,"FullStack");
        A obj2 = new A(obj); // Sending obj as parameter
    }
}
