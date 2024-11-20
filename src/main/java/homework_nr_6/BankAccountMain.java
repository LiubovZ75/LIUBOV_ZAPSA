package homework_nr_6;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("123456", 1452.55);

        System.out.println(" Nомер счета: " + b1.getAccountNumber());
        System.out.println(" Текущий баланс: " + b1.getBalance());


        b1.deposit(300.0);
        b1.withdraw(1000.0);
        b1.withdraw(5000.0);
    }
}
