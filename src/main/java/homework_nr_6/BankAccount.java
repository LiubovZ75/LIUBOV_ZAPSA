package homework_nr_6;

public class BankAccount {
    String  accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Счет пополнен на: " + amount +"Текущий баланс: " + balance );
        } else {
            System.out.println("Сумма баланса должна быть больше 0");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount >= 0){
            balance -= amount;
            System.out.println("Со счета снято: " + amount + "Текущий баланс: " + balance);
        }else {
            System.out.println("Сумма снятия должна быть больше 0");
        }
    }
}
