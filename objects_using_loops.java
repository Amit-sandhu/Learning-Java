import java.util.Scanner;

public class objects_using_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i <= 1; i++) {

            System.out.print("Enter name of new student: ");
            String a = sc.nextLine();

            System.out.printf("Enter age of %s: ", a);
            int b = sc.nextInt();

            System.out.printf("Enter GPA scored by %s: ", a);
            double c = sc.nextDouble();

            sc.nextLine();

            Student s = new Student(a, b, c);
            students[i] = new Student(a, b, c);

            s.print_name_age();
            System.out.println();

            s.print_gpa();
            System.out.println("\n");
        }
        sc.close();

        // to access the created objects through the students array of objects

        System.out.println(students[1].name);
        System.out.println(students[1].age);
        System.out.println(students[1].gpa + "\n");

        System.out.println(students[0].name);
        System.out.println(students[0].age);
        System.out.println(students[0].gpa);
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