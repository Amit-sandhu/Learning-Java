package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Comparable defines the "natural" ordering for the class itself
    public int compareTo(Employee other){
        return this.age - other.age;
    }

    public String toString(){
        return name+"("+age+")";
    }
}

public class ComparatorComparable {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alex", 35));
        employees.add(new Employee("Bella", 28));
        employees.add(new Employee("Cody", 42));

        Collections.sort(employees);                     // uses compareTo() -> sorted by age
        System.out.println(employees);

        // Comparator lets you define extra, custom orderings without
        // changing the class itself
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println(employees);

        employees.sort(Comparator.comparingInt((Employee e) -> e.age).reversed());
        System.out.println(employees);
    }
}

// Practice: Sort the employees list by name length, and if two names
// have equal length, fall back to sorting by age (Comparator chaining
// with .thenComparing()).
