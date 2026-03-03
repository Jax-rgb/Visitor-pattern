public class InterestCalculator implements AccountVisitor {
    private double interest;

    public double getInterest() {
        return interest;
    }

    @Override
    public void visitCimb(CimbAccount account) {
        interest = account.getBalance() * account.getInterestRate();
    }

    @Override
    public void visitSeaBank(SeaBankAccount account) {
        interest = account.getBalance() * account.getInterestRate();
    }

    @Override
    public void visitGoTyme(GoTymeAccount account) {
        interest = account.getBalance() * account.getInterestRate();
    }
}
