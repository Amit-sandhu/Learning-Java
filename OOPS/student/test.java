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

// Practice: Add a printMarks() method to student_class and call it
// for both s and s2 after assigning different marks values.
