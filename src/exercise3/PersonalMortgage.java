package exercise3;

public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(String mortgageNumber, String customerName, double amountOfMortgage, double primeRate, int term) {
        super(mortgageNumber, customerName, amountOfMortgage, primeRate + 2, term);
    }

        @Override
        public double calculateInterest () {
            return amountOfMortgage * (interestRate / 100) * term;

        }
    }
