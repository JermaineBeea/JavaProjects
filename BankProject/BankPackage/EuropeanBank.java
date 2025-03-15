package BankProject.BankPackage;

public class EuropeanBank extends MainMethods {

    public EuropeanBank(String holder, double balance) {
        this.account_holder = holder;
        this.account_balance = balance;
        this.account_number = random_number(10);
    }

    // SEPA(Single Euro Payments Area) transaction
    public void sepa_transfer(EuropeanBank target_account, double amount) {
        if (this.account_balance >= amount) {
            this.withdraw(amount);
            target_account.deposit(amount);
            System.out.println("SEPA Transfer Successful");
        } else {
            System.out.println("Insufficient funds for SEPA Transfer");
        }
    }
}