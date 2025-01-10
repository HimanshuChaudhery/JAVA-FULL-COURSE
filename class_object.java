public class class_object {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.color);

        p.eat();
        p.sleep();
    }
}

class Person{ // Virtual part 
    int age = 21;
    int weight = 67;
    String color ="Light";

    void eat(){
        System.out.println("I'm Eating");
    }

    void sleep(){
        System.out.println("I am Sleeping");
    }
}



