package cs3233.lab.twoPointOne;

public class SavingAccount extends BankAccount {
    private Double interestRate = 0.1;
    public SavingAccount(String name) {
        super(name);
    }
    public SavingAccount(String name, double balance) {
        super(balance, name);
    }

    public void addInterest() {
        super.deposit(super.getAccountBalance()*interestRate);
    }

    @Override
    public String toString() {
        return super.getOwnerName() + " Saving Account> account num:"+ super.getAccountNumber()+",bal:"+super.getAccountBalance();
    }

    public static void main(String[] args) {
        SavingAccount m = new SavingAccount("Mary");
        System.out.println(m);
        m.addInterest();
        System.out.println(m);
    }
}
