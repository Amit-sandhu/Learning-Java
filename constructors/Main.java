package constructors;

public class Main {
    static public void main(String[] args){
        Student s1 = new Student("john", 18, "sem 2", 8.9);
        Student s2 = new Student("rob", 18, "sem 2", 10);
        System.out.println(s1.name);
        System.out.println(s2.gpa);
        
    }
}
