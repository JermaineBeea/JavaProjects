package BankProject.Banks;
import BankProject.BankPackage.EuropeanBank;
import BankProject.BankPackage.BankInterfaces.SwedishBank;

public class SwedishBanks {

    public abstract class AbstractSwedishBank extends EuropeanBank implements SwedishBank {
        public AbstractSwedishBank(String holder, double balance) {
            super(holder, balance);
        }

        public void local_transfer(SwedishBank target_account, double amount) {
            if (amount > this.get_balance()) {
                System.out.println("Insufficient funds for local transfer");
            } else {
                this.withdraw(amount);
                target_account.deposit(amount);
            }
        }
    }

    public class DanskeBank extends AbstractSwedishBank {
        public DanskeBank(String holder, double balance) {
            super(holder, balance);
        }
    }

    public class Handelsbanken extends AbstractSwedishBank {
        public Handelsbanken(String holder, double balance) {
            super(holder, balance);
        }
    }

}