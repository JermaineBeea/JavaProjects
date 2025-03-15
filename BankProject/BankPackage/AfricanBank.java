package BankProject.BankPackage;

public class AfricanBank extends MainMethods {

    public AfricanBank(String holder, double balance) {
        this.account_holder = holder;
        this.account_balance = balance;
        this.account_number = random_number(10);
    }

    // MMT(mobile money transfer)
    public void mobile_money_transfer(AfricanBank target_account, double amount) {
        if (this.account_balance >= amount) {
            this.withdraw(amount);
            target_account.deposit(amount);
            System.out.println("Mobile Money Transfer Successful");
        } else {
            System.out.println("Insufficient funds for Mobile Money Transfer");
        }
    }
}