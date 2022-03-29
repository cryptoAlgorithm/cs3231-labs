package lab.ten;

public class TestBank {
    public static void main(String[] args) {
        //Uncomment this for testing

        Bank firstBank = new Bank();
        firstBank.addAccount(new BankAccount(1001,10000));
        firstBank.addAccount(new BankAccount(1002,20000));
        firstBank.addAccount(new BankAccount(1003,30000));

        System.out.printf("Total balance = $%5.2f",firstBank.getTotalBalance());

    }
}
