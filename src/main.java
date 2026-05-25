public class main {

    public static void main(String[] args) {
        BankAccount kontolucas = new BankAccount("Lucas", 2500);
        BankAccount kontotess = new BankAccount("Tess", 50000);

        kontolucas.deposit(1000);
        kontolucas.withdraw(5000);

        kontolucas.transfer(kontotess, 3500);
    }
}