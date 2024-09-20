package finalKeyword;

public class Property {

    public   double bankBalance;

    public  final double investments;

    public Property(double bankBalance, double investments) {
        this.bankBalance = bankBalance;
        this.investments = investments;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public double getInvestments() {
        return investments;
    }

}
