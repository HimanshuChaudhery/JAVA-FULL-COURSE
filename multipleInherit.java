// MUTLIPLE INERITANCE using Interface

interface a{
    void disp(); //public + abstract
}

interface b{
    void show(); //public + abstract
}

class c implements b,a{
    public void show(){
        System.out.println("Interface B");
    }

    public void disp(){
        System.out.println("Interface A");
    }
}
public class multipleInherit {
    public static void main(String[] args){
        c obj = new c();
        obj.show();
        obj.disp();
    }
}
