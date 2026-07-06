class Employee {

    String name;
    String eid;
    double salary;

    static int numOfEmployees = 0;
    static String company = "Google";

    Employee(String name, String eid, double salary) {
        this.name = name;
        this.eid = eid;
        this.salary = salary;
        numOfEmployees++;
    }

    void display() {
        System.out.println(name + " works in " + company +
                " has employee id: " + eid +
                ", earns $" + salary);
    }
}

public class Static {

    public static void main(String[] args) {

        System.out.println(Employee.numOfEmployees +" employees work in " + Employee.company);

        Employee e1 = new Employee("Ryan", "1245E", 150000);
        e1.display();
        System.out.println(Employee.numOfEmployees +" employees work in " + Employee.company);

        Employee e2 = new Employee("Bob", "1246E", 160000);
        e2.display();
        System.out.println(Employee.numOfEmployees +" employees work in " + Employee.company);

        Employee e3 = new Employee("Sam", "1247E", 145000);
        e3.display();
        System.out.println(Employee.numOfEmployees +" employees work in " + Employee.company);
    }
}