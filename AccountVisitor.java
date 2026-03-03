public interface AccountVisitor {
    void visitCimb(CimbAccount account);
    void visitSeaBank(SeaBankAccount account);
    void visitGoTyme(GoTymeAccount account);
}
