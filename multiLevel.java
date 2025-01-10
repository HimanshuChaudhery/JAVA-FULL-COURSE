class a{
    int num1;
    int num2;
    int res;
    void add(){
        num1 = 10;
        num2 = 4;
        res = num1+num2;
        System.out.println("Sum: "+res);
    }

    void sub(){
        num1 = 6;
        num2 = 4;
        res = num1-num2;
        System.out.println("Sub: "+res);
    }
}

class b extends a{
    void multi(){
        num1 = 12;
        num2 = 2;
        res = num1*num2;
        System.out.println("Multiply: "+res);
    }
}

class c extends b{
    void div(){
        num1 = 10;
        num2 = 5;
        res = num1/num2;
        System.out.println("Divide: "+res);
    }
}

public class multiLevel {
    public static void main(String[] args){
        c obj = new c();
        obj.add();
        obj.sub();
        obj.multi();
        obj.div();
    }
}
