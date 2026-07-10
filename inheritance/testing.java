package inheritance;
class student{
    String name;
    int age;
}
class teacher extends student{
    String name;
    int age;
}
public class testing {
    public static void main(String[] args){
        student s1 = new teacher();
        System.out.println(s1);
    }
}
