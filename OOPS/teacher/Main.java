package teacher;

public class Main {
    static public void main(String[] args){
        teacher_class t1 = new teacher_class();
        t1.name = "pikachu";
        t1.designation = "Proffessor";
        t1.subject = "python";
        t1.printdesignation();
        t1.printname();
        t1.printsubject();
    }
}
