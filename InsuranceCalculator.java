public class InsuranceCalculator implements AccountVisitor {
    private double insurance;

    public double getInsurance() {
        return insurance;
    }

    @Override
    public void visitCimb(CimbAccount account) {
        double balance = account.getBalance();
        if (balance >= account.getMinBalanceForInsurance()) {
            insurance = Math.min(balance, account.getMaxInsurance());
        } else {
            insurance = 0;
        }
    }

    @Override
    public void visitSeaBank(SeaBankAccount account) {
        double balance = account.getBalance();
        if (balance >= account.getMinBalanceForInsurance()) {
            insurance = Math.min(balance, account.getMaxInsurance());
        } else {
            insurance = 0;
        }
    }

    @Override
    public void visitGoTyme(GoTymeAccount account) {
        insurance = 0;
    }
}
