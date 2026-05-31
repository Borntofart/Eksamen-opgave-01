public class BankAccount {

    //Constructor
    BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;

    }

    //attributes
    String owner;
    double balance;

//getters
    private double getBalance() {

        return balance;
    }

    private String getOwner() {

        return owner;
    }

//metoder
    public double deposit(double amount) {
        System.out.println("Du har sat " + amount + " ind på din konto");
        balance = balance + amount;
        showBalance();
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("AFVIST Ikke nok penge, på din debit konto");
        } else {
            balance = balance - amount;
            System.out.println("overførsel klaret! du har trukket " + amount + " ud i kontanter");
        }

        return balance;
    }

    public double transfer(BankAccount target, double amount) {
        if (amount > balance){
            System.out.println("Afvist ikke nok penge til at lave denne overførsel");
        } else {
            this.balance = this.balance - amount;
            target.balance = target.balance + amount;
            System.out.println("overførsel klaret! " + this.owner + " gav " + amount + " til " + target.owner);
        }

        return this.balance;
    }

    public void showBalance() {

        System.out.println("Din balance er " + balance);
    }


}
