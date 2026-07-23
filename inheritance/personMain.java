package inheritance;

abstract class person{
    
    String name;
    boolean isAlive = true;
    int age;
    boolean livesOnEarth = true;

    person(String n, int a){
        this.name = n;
        this.age = a;
    }
}

class employee extends person{

    employee(String n,int a){
        super(n,a);
    }

    int salary;
    String employeeId;
}

class student extends person{

    student(String n,int a){
        super(n,a);
    }
    int roll;
    String standard;

}
class btech extends student{

    btech(String n,int a){
        super(n,a);
    }
    int fees;
    int duration;
}
class CSE extends btech{
    
    CSE(String n,int a){
        super(n,a);
    }
    String specialization;
    int fees;
}
class AI extends btech{
    
    AI(String n,int a){
        super(n,a);
    }
    String specialization;
    int fees;
}

public class personMain {
    public static void main(String[] args){

        student s1 = new student("ryan",20);
        
        System.out.println(s1.livesOnEarth);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
