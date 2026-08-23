package polymorphism;

class Shape2 {
    void draw(){
        System.out.println("Drawing a generic shape");
    }
    // overloading: same method name, different parameter list, resolved at compile time
    void draw(String color){
        System.out.println("Drawing a "+color+" shape");
    }
}

class Circle2 extends Shape2 {
    // overriding: same method name AND signature, resolved at runtime
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}

public class OverridingVsOverloading {
    public static void main(String[] args){
        Shape2 s = new Circle2();
        s.draw();              // overridden version runs -> "Drawing a circle"
        s.draw("red");         // overloaded version runs, inherited from Shape2
    }
}

// Practice: In a comment, list two differences between overloading
// and overriding (hint: think about which class the method lives in,
// and when Java decides which version to call).
