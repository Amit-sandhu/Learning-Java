package interfaces;

interface Payable {
    double calculatePay();          // implicitly public and abstract

    default void printPayslip(){    // default method has a body, is optional to override
        System.out.println("Pay: $"+calculatePay());
    }
}

class FullTimeEmployee implements Payable {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public double calculatePay(){
        return monthlySalary;
    }
}

class Freelancer implements Payable {
    double hourlyRate;
    int hoursWorked;

    Freelancer(double hourlyRate, int hoursWorked){
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay(){
        return hourlyRate * hoursWorked;
    }
}

public class InterfaceBasics {
    public static void main(String[] args){
        Payable[] workers = { new FullTimeEmployee(5000), new Freelancer(40, 60) };

        for(Payable p : workers){
            p.printPayslip();
        }
    }
}

// Practice: Add an Intern class implementing Payable with a fixed
// stipend, and add it to the workers array.
