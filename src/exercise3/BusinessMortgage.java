package exercise3;

public class BusinessMortgage extends Mortgage{
    public BusinessMortgage(String mortgageNumber, String customerName, double amountOfMortgage, double primeRate, int term) {
        super(mortgageNumber, customerName, amountOfMortgage, primeRate + 1, term);
    }
    @Override
    public double calculateInterest() {
        return amountOfMortgage * (interestRate / 100) * term;
    }

}