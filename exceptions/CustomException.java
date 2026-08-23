package exceptions;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message){
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException("Not enough balance to withdraw $"+amount);
        }
        balance -= amount;
        System.out.println("Withdrew $"+amount+", remaining balance: $"+balance);
    }
}

public class CustomException {
    public static void main(String[] args){
        BankAccount account = new BankAccount(500);

        try{
            account.withdraw(200);
            account.withdraw(1000);
        }
        catch(InsufficientBalanceException e){
            System.out.println("Transaction failed: "+e.getMessage());
        }
    }
}

// Practice: Create an InvalidAgeException and throw it from a method
// that rejects any age below 0 or above 120.
