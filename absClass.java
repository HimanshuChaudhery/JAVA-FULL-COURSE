abstract class animal{
    void legs(){
        System.out.println("All animals have 4 legs");
    }
    abstract void sound();
    abstract void eat();
}

class Dog extends animal{
    void sound(){
        System.out.println("Woof Woof...");
    }

    void eat(){
        System.out.println("Meat.....");
    }
}

class Cow extends animal{
    void sound(){
        System.out.println("Mow Mow...");
    }

    void eat(){
        System.out.println("Grass.....");
    }
}

public class absClass {
    public static void main(String[] args) {
        Dog obj = new Dog();
        Cow obj2 = new Cow();
        obj.legs();
        obj.sound(); obj.eat();
        obj2.legs();
        obj2.sound(); obj2.eat();
    }
}
