package student;

public class test{
    public static void main(String[] args){
        student_class s = new student_class();    // s id a reference variable, stores address of the class and its size is dependent on the system archietecture
        s.name = "panda";
        student_class s2 = new student_class();    
        s2.name = "panda2";
        s.printname();
        s2.printname();
    }
}
