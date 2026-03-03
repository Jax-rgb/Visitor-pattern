public class Client {
    public static void main(String[] args) {
        // Example with Cimb
        Account cimb = new CimbAccount(100000); // Balance: ₱100,000
        InterestCalculator interestCalc = new InterestCalculator();
        cimb.accept(interestCalc);
        System.out.println("Cimb Interest: ₱" + interestCalc.getInterest());

        InsuranceCalculator insCalc = new InsuranceCalculator();
        cimb.accept(insCalc);
        System.out.println("Cimb Insurance Coverage: ₱" + insCalc.getInsurance());

        // Example with SeaBank
        Account seaBank = new SeaBankAccount(60000);
        seaBank.accept(interestCalc);
        System.out.println("SeaBank Interest: ₱" + interestCalc.getInterest());
        seaBank.accept(insCalc);
        System.out.println("SeaBank Insurance Coverage: ₱" + insCalc.getInsurance());

        // Example with GoTyme
        Account goTyme = new GoTymeAccount(70000);
        goTyme.accept(interestCalc);
        System.out.println("GoTyme Interest: ₱" + interestCalc.getInterest());
        goTyme.accept(insCalc);
        System.out.println("GoTyme Insurance Coverage: ₱" + insCalc.getInsurance());
    }
}
