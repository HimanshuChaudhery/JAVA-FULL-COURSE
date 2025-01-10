import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>(); 
        name.add("Ankit");
        name.add("Ankush");
        name.add("Ninja");
        System.out.println(name);
        name.add(1,"Noman");
        System.out.println(name);
        name.remove(1);
        name.set(1,"Peter"); //It will replace the value
        System.out.println(name);
        System.out.println(name.get(2));
    }
    
}