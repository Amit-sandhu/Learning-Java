package encapsulation;

class Account {

    // fields are private so they can't be changed directly from outside the class
    private double balance;
    private String owner;

    Account(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    // public getters and setters control how the private fields are accessed
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Invalid withdrawal amount");
        }
    }

    public String getOwner(){
        return owner;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Account acc = new Account("Alex", 1000);

        acc.deposit(500);
        acc.withdraw(2000);       // rejected, protects balance from going negative
        acc.withdraw(300);

        System.out.println(acc.getOwner()+"'s balance: $"+acc.getBalance());

        // acc.balance = -9999;   // this line would not even compile, balance is private
    }
}

// Practice: Add a setOwner() method that only allows non-empty names,
// rejecting blank strings.
