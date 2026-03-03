public interface Account {
    void accept(AccountVisitor visitor);
    double getBalance();
}
