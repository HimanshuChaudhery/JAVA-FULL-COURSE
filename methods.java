public class methods {

    // main method also a user-defined method and it is called by JVM.
    // Program execution starts from main method. 
    public static void main(String args[]){
        int n=sum(10,20);
        System.out.println("Addition "+n);

        //We have to use object of method class so that we can use call non-static method(msg())
        methods m = new methods(); // inbuilt class of lang package.
        m.msg();
        
    }

    // We use static because we cannot call non-static function inside static function.
    static int sum(int a,int b){
        return a+b;
    }

    // Calling non-static method inside static keyword.
    void msg(){
        System.out.println("Learning Method");
    }

}
