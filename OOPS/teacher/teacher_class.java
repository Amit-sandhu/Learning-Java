package teacher;

public class teacher_class {
    String name;
    String designation;
    String subject;
    void printname(){
        System.out.print("Dr."+name+"\n");
    }
    void printdesignation(){
        System.out.println(designation);
    }
    void printsubject(){
        System.out.printf("Dr.%s teaches %s\n",name,subject);
    }
}
