package lab.seven;


public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123-12345-3", "Pete Tan", 1000.0);
        System.out.println("Balance before deposit = $" + acc1.getBalance());
        acc1.deposit(100);
        System.out.println("Balance after $100 deposit = $" + acc1.getBalance());
        acc1.withdraw(50.50);
        System.out.println("Balance after $50 withdrawal = $" + acc1.getBalance());


        BankAccount acc2 = new BankAccount("155-12345-3", "Jane Chin", 5000.0);
        acc2.withdraw(6000);
        System.out.println(acc2.getBalance());
        System.out.println("Number of accounts created = " + BankAccount.getNumAccount());

        BankAccount acc3 = new BankAccount("ABC-12345-3", "John Lim", 2000.0);
        BankAccount acc4 = new BankAccount("ABC-12345-3", "John Lim", 2000.0);
        BankAccount acc5 = new BankAccount("ABC-12345-3", "John Lim", 2000.0);
        System.out.println(BankAccount.getNumAccount());
    }

}
