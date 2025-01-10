// Whenever we create object a unique Reference ID of class gets generated which stored in reference variable. 

public class this_p {
    int a; // Instance Variable: it is a part of object

    this_p(){
        System.out.println("I am a Learner");
    }
    this_p(int a)//Local Variable
    {
        this();// this keyword is also to call the default constructor inside a another constructor.
        this.a=a; // this keyword to tell the compiler which one is instance variable or which one is part of the object.
    }

    void show(){
        System.out.println(a);
    }
    public static void main(String[] args){
        this_p obj = new this_p(100);
        obj.show();
    }
}
