package inheritance;

public class Main {
    public static void main(String[] args){
        Dog spark = new Dog();
        Cat tinkle = new Cat();

        System.out.println(spark.numOfLimbs);
        System.out.println(tinkle.hasTail);

        spark.speak();
        tinkle.speak();
    }
}
