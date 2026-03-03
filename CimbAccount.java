public class CimbAccount implements Account {
    private double balance;

    public CimbAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visitCimb(this);
    }

    public double getInterestRate() {
        return 0.026; // 2.6%
    }

    public double getMinBalanceForInsurance() {
        return 50000;
    }

    public double getMaxInsurance() {
        return 250000;
    }
}
