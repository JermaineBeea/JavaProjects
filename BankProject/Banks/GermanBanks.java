package BankProject.Banks;
import BankProject.BankPackage.EuropeanBank;
import BankProject.BankPackage.BankInterfaces.GermanBank;

public class GermanBanks {

    public abstract class AbstractGermanBank extends EuropeanBank implements GermanBank {
        
        public AbstractGermanBank(String holder, double balance) {
            super(holder, balance);
        }

        public void local_transfer(GermanBank target_account, double amount) {
            if (amount > this.get_balance()) {
                System.out.println("Insufficient funds for local transfer");
            } else {
                this.withdraw(amount);
                target_account.deposit(amount);
            }
        }
    }

    public class Deutsche extends AbstractGermanBank {
        public Deutsche(String holder, double balance) {
            super(holder, balance);
        }
    }

    public class Commerz extends AbstractGermanBank {
        public Commerz(String holder, double balance) {
            super(holder, balance);
        }
    }

}