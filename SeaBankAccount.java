public class SeaBankAccount implements Account {
    private double balance;

    public SeaBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visitSeaBank(this);
    }

    public double getInterestRate() {
        return 0.05; // 5%
    }

    public double getMinBalanceForInsurance() {
        return 50000;
    }

    public double getMaxInsurance() {
        return 1000000;
    }
}
