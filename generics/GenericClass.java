package generics;

// T is a type placeholder, decided when the class is actually used
class Box<T> {
    private T item;

    void set(T item){
        this.item = item;
    }

    T get(){
        return item;
    }
}

public class GenericClass {
    public static void main(String[] args){
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("hello generics");
        System.out.println(stringBox.get());

        // without generics, Box would need to use Object and require
        // casting every time it's read back, which is unsafe and clunky
    }
}

// Practice: Create a Pair<K, V> class that holds two values of
// potentially different types, with getKey() and getValue() methods.
