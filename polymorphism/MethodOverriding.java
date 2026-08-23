package polymorphism;

class Instrument {
    void play(){
        System.out.println("The instrument makes a sound");
    }
}

class Guitar extends Instrument {
    @Override
    void play(){
        System.out.println("The guitar strums a chord");
    }
}

class Piano extends Instrument {
    @Override
    void play(){
        System.out.println("The piano plays a melody");
    }
}

public class MethodOverriding {
    public static void main(String[] args){

        // runtime polymorphism: the reference type is Instrument,
        // but the actual method that runs depends on the real object type
        Instrument[] band = { new Guitar(), new Piano(), new Instrument() };

        for(Instrument i : band){
            i.play();
        }
    }
}

// Practice: Add a Drums class overriding play(), and add it to the
// band array to hear the correct method get called automatically.
