package BankProject;

import BankProject.BankPackage.InternationalMethods;
import BankProject.Banks.GermanBanks;
import BankProject.Banks.SouthAfricanBanks;
import BankProject.Banks.SwedishBanks;
import BankProject.Banks.ZimbabwenBanks;

public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // African Banks
        SouthAfricanBanks.Capitec capitec_1 = new SouthAfricanBanks().new Capitec("Capitec Account Holder", 1000);
        SouthAfricanBanks.Capitec capitec_2 = new SouthAfricanBanks().new Capitec("Capitec Account Holder", 1000);
        SouthAfricanBanks.Nedbank nedbank_1 = new SouthAfricanBanks().new Nedbank("Nedbank Account Holder", 1000);
        SouthAfricanBanks.Nedbank nedbank_2 = new SouthAfricanBanks().new Nedbank("Nedbank Account Holder", 1000);

        // Zimbabwean Banks
        ZimbabwenBanks.EcoBank ecobank_1 = new ZimbabwenBanks().new EcoBank("EcoBank Account Holder", 1000);
        ZimbabwenBanks.EcoBank ecobank_2 = new ZimbabwenBanks().new EcoBank("EcoBank Account Holder", 1000);
        ZimbabwenBanks.CapitalBankZim CapitalBankZim_1 = new ZimbabwenBanks().new CapitalBankZim("CapitalBankZim Account Holder", 1000);
        ZimbabwenBanks.CapitalBankZim CapitalBankZim_2 = new ZimbabwenBanks().new CapitalBankZim("CapitalBankZim Account Holder", 1000);

        // European Banks
        GermanBanks.Deutsche deutsche_1 = new GermanBanks().new Deutsche("Deutsche Account Holder", 1000);
        GermanBanks.Deutsche deutsche_2 = new GermanBanks().new Deutsche("Deutsche Account Holder", 1000);
        GermanBanks.Commerz commerz_1 = new GermanBanks().new Commerz("Commerz Account Holder", 1000);
        GermanBanks.Commerz commerz_2 = new GermanBanks().new Commerz("Commerz Account Holder", 1000);

        // Swedish Banks
        SwedishBanks.DanskeBank DanskeBank_1 = new SwedishBanks().new DanskeBank("DanskeBank Account Holder", 1000);
        SwedishBanks.DanskeBank DanskeBank_2 = new SwedishBanks().new DanskeBank("DanskeBank Account Holder", 1000);
        SwedishBanks.Handelsbanken handelsbanken_1 = new SwedishBanks().new Handelsbanken("Handelsbanken Account Holder", 1000);
        SwedishBanks.Handelsbanken handelsbanken_2 = new SwedishBanks().new Handelsbanken("Handelsbanken Account Holder", 1000);

        InternationalMethods bank_methods = new InternationalMethods();

        // International Transfers
        bank_methods.international_transfer(capitec_1, deutsche_2, 50);
        System.out.println("International transfer");
        System.out.println("Capitec 1 balance: " + capitec_1.get_balance());
        System.out.println("Deutsche 2 balance: " + deutsche_2.get_balance());

        // African Local Transfers South Africa to Zimbabwe banks
        capitec_1.mobile_money_transfer(CapitalBankZim_2, 10);
        System.out.println("\nAfrican Local transfer");
        System.out.println("Capitec 1 balance: " + capitec_1.get_balance());


        // European Local Transfers Germany to Sweden banks
        deutsche_1.sepa_transfer(DanskeBank_2, 10);
        System.out.println("\nEuropean Local transfer");
        System.out.println("Deutsche 1 balance: " + deutsche_1.get_balance());
        System.out.println("DanskeBank 2 balance: " + DanskeBank_2.get_balance());

        // Zimbabwean Local Transfers
        ecobank_1.local_transfer(CapitalBankZim_2, 20);
        System.out.println("\nZimbabwean Local transfer");
        System.out.println("EcoBank 1 balance: " + ecobank_1.get_balance());
        System.out.println("CapitalBankZim 2 balance: " + CapitalBankZim_2.get_balance());


        // German Local Transfers
        deutsche_1.local_transfer(commerz_2, 10);
        System.out.println("\nGerman Local transfer");
        System.out.println("Deutsche 1 balance: " + deutsche_1.get_balance());
        System.out.println("Commerz 2 balance: " + commerz_2.get_balance());
    }
}