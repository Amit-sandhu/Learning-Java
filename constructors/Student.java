package constructors;

public class Student {
      
    // constructors : a special method to initialize objects
    //                arguments can be passed to constructors
    //                and setup intial values.

    String name;
    int age;
    String grade;
    double gpa; 

    Student(String name, int a, String b ,double gpa){
        this.name = name;
        this.age = a;                      // this keyword : In Java, the this 
        this.grade = b;                    // keyword is a special reference variable 
        this.gpa = gpa;                    // that points directly to the current 
    }                                      // object or instance currently while executing the code
}
