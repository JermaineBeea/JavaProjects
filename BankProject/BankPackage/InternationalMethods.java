package BankProject.BankPackage;

public class InternationalMethods {
        
    public void international_transfer(MainMethods primary_account, MainMethods target_account, double amount) {
        if (amount > primary_account.get_balance()) {
            System.out.println("Insufficient funds for international transfer");
        } else {
            primary_account.withdraw(amount);
            target_account.deposit(amount);
        }
    }
}