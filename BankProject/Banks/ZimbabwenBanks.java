package BankProject.Banks;
import BankProject.BankPackage.AfricanBank;
import BankProject.BankPackage.BankInterfaces.ZimbabweBank;

public class ZimbabwenBanks {

    public abstract class AbstractZimbabweBank extends AfricanBank implements ZimbabweBank {
        public AbstractZimbabweBank(String holder, double balance) {
            super(holder, balance);
        }

        public void local_transfer(ZimbabweBank target_account, double amount) {
            if (amount > this.get_balance()) {
                System.out.println("Insufficient funds for local transfer");
            } else {
                this.withdraw(amount);
                target_account.deposit(amount);
            }
        }
    }

    public class EcoBank extends AbstractZimbabweBank {
        public EcoBank(String holder, double balance) {
            super(holder, balance);
        }
    }

    public class CapitalBankZim extends AbstractZimbabweBank {
        public CapitalBankZim(String holder, double balance) {
            super(holder, balance);
        }
    }

}