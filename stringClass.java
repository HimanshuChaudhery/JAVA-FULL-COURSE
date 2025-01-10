public class stringClass {
    public static void main(String[] args) {
        
        String str1 = "ankush";
        int l=str1.length(); //To get the length of the String
        System.out.println("Length of the String is "+l);
        System.out.println(str1.toUpperCase());

        String str2 = "ANKUSHESS";
        System.out.println(str2.toLowerCase());

        String str3 = new String("ankush");
        if(str1.equals(str3)){
            System.out.println("Both are Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        // if(str1==str3){
        //     System.out.println("Both are Equal");
        // }
        // else{
        //     System.out.println("Not Equal");
        // }
        /* Why its showing not equals even after having same content?
         * Because relational operator compares the reference variable of string since both variables are different thats why is will show "Not equal".
         * So we will use pre-defined method of string called equals() because it compares only the content of the variable it doesn't care about reference variable
         */

    }
}
