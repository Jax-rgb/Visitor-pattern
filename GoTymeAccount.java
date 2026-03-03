public class GoTymeAccount implements Account {
    private double balance;

    public GoTymeAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visitGoTyme(this);
    }

    public double getInterestRate() {
        return 0.045; // 4.5%
    }

    public double getMinBalanceForInsurance() {
        return Double.MAX_VALUE; // Effectively no insurance
    }

    public double getMaxInsurance() {
        return 0;
    }
}
