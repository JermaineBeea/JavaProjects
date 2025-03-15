package BankProject.Banks;
import BankProject.BankPackage.AfricanBank;
import BankProject.BankPackage.BankInterfaces.SouthAfricanBank;

public class SouthAfricanBanks {

    public abstract class AbstractSouthAfricanBank extends AfricanBank implements SouthAfricanBank {
        public AbstractSouthAfricanBank(String holder, double balance) {
            super(holder, balance);
        }

        public void local_transfer(SouthAfricanBank target_account, double amount) {
            if (amount > this.get_balance()) {
                System.out.println("Insufficient funds for local transfer");
            } else {
                this.withdraw(amount);
                target_account.deposit(amount);
            }
        }
    }

    public class Capitec extends AbstractSouthAfricanBank {
        public Capitec(String holder, double balance) {
            super(holder, balance);
        }
    }

    public class Nedbank extends AbstractSouthAfricanBank {
        public Nedbank(String holder, double balance) {
            super(holder, balance);
        }
    }
}