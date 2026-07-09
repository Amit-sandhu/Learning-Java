import java.util.Scanner;

public class objects_using_loops {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter name of new student: ");
            String a = sc.nextLine();

            System.out.printf("Enter age of %s: ", a);
            int b = sc.nextInt();

            System.out.printf("Enter GPA scored by %s: ", a);
            double c = sc.nextDouble();

            sc.nextLine();

            Student s = new Student(a, b, c);
            students[i] = new Student(a, b, c);

        }
        sc.close();

        // to access the created objects through the students array of objects

        int totalMarks =  0;
        for(int i = 0;i<5;i++){

            if(students[i].age < 20){
                totalMarks+=students[i].gpa;
            }

        }
        System.out.println("Total marks of students with age < 20 : "+totalMarks);
    }
}

class Student { // student class

    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age; // constructor
        this.gpa = gpa;
    }

    void print_name_age() {
        System.out.printf("Student %s is %d years old.", this.name, this.age);
    }

    void print_gpa() {
        System.out.printf("Student %s scored a gpa of %.2f", this.name, this.gpa);
    }

}