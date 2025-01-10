public class operator {
    public static void main(String[] args) {
        
        int a=10, b=20, c=30;

        //Relational Operator
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        //Logical Operator
        System.out.println("\n Logical Operator");
        System.out.println(a==b && a!=b); //Both condition needs to be true
        System.out.println(a==b || a!=b); //One condition needs to be true
        System.out.println((a>b)); // ! :it will reverse the result. like 10>20 ==> False but it will show True

        //Ternary Operator
        System.out.println("\n Ternary Operator example");
        int r = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(r);
    }
}
