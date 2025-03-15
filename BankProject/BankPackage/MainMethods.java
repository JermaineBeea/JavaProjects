package BankProject.BankPackage;

import java.util.Random;
import java.util.Arrays;

public abstract class MainMethods {

    protected String account_holder;
    protected int account_number;
    protected double account_balance;

    public String get_holder() {
        return account_holder;
    }

    public int get_accountNumber() {
        return account_number;
    }

    public double get_balance() {
        return account_balance;
    }

    public void deposit(double amount) {
        this.account_balance += amount;
    }

    public void withdraw(double amount) {
        this.account_balance -= amount;
    }

    public void change_holder(String new_holder) {
        this.account_holder = new_holder;
    }


    // Function to generate account number
    public int random_number(int account_num_len) {
        Random instance_rand = new Random();
        Integer[] int_list = new Integer[account_num_len];
        int[] rand_int = new int[1];

        for (int n = 0; n < account_num_len; n++) {
            do {
                rand_int[0] = instance_rand.nextInt(10);
            } while (Arrays.asList(int_list).stream().anyMatch(k -> k != null && k.equals(rand_int[0])));
            int_list[n] = rand_int[0];
        }

        return Arrays.asList(int_list).stream().reduce(0, (m, n) -> m * 10 + n);
    }
}