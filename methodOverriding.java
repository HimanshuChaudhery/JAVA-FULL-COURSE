class shape{
    void draw(){
        System.out.println("Can't say shape type");
    }
}

class square extends shape{
    void draw(){
        System.out.println("We are talking about SQUARE.");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        //parent_classname object = new sub_classname();
        shape r = new square(); //This is also a way of defining object
        r.draw();
    }
}
