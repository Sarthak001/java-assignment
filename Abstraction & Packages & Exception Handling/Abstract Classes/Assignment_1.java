abstract class GeneralBank {
    abstract String getSavingsInterestRate();

    abstract String getFixedDepositIntrestRate();
}

class ICICBank extends GeneralBank {

    String getSavingsInterestRate() {

        return ("Savings Intrest : " + "4%");

    }

    String getFixedDepositIntrestRate() {

        return ("Fixed deposit Intrest : " + "8.5%");

    }

}

class KotMBank extends GeneralBank {

    String getSavingsInterestRate() {

        return ("Savings Intrest : " + "6%");

    }

    String getFixedDepositIntrestRate() {

        return ("Fixed deposit Intrest : " + "9%");

    }

}

public class Assignment_1 {

    public static void main(String[] args) {

        ICICBank i = new ICICBank();
        KotMBank k = new KotMBank();
        GeneralBank g = new ICICBank();
        GeneralBank g1 = new KotMBank();

        System.out.println(i.getSavingsInterestRate());
        System.out.println(i.getFixedDepositIntrestRate());

        System.out.println(k.getSavingsInterestRate());
        System.out.println(k.getFixedDepositIntrestRate());

        System.out.println(g.getSavingsInterestRate());
        System.out.println(g.getFixedDepositIntrestRate());

        System.out.println(g1.getSavingsInterestRate());
        System.out.println(g1.getFixedDepositIntrestRate());

    }
}