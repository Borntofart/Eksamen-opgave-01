public class BankAccount {

    //Constructor
    BankAccount(String owner, double belance){
        this.owner = owner;
        this.balance = balance;

    }

    //attributes
    String owner;
    double balance;

//getters
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

//metoder
    public double deposit(double amount) {
        balance = balance + amount;
        System.out.println("Du har sat " + balance + " ind på din konto");
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
            System.out.println("overførsel klaret! " + this + "gav " + amount + " til " + target);
        }

        return this.balance;
    }

    private void showbalance(BankAccount target) {
        System.out.println("Din balance er " + balance);
    }


}
