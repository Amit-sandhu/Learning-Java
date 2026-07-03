public class testg {
    public static void main(String[] args){
        student_class s = new student_class();    // s id a reference variable, stores address of the class and its size is dependent on the system archietecture
        s.name = "amit";
        System.out.println(s.name);
        System.out.print(s+"\n");
    }
}
