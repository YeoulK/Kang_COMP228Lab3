package exercise3;

public abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber ;
    protected String customerName;
    protected double amountOfMortgage;
    protected double interestRate;
    protected int term;

    public Mortgage(String mortgageNumber, String customerName, double amountOfMortgage, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.amountOfMortgage = amountOfMortgage;


        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;
        } else {
            this.term = term;

        }
        this.interestRate = interestRate;
    }

      public abstract double calculateInterest();

    public double getTotalOwed() {
        return amountOfMortgage + calculateInterest();
    }


    public String getMortgageInfo() {
        return "Mortgage Number: " + mortgageNumber + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Amount: $" + amountOfMortgage + "\n" +
                "Interest Rate: " + interestRate + "%\n" +
                "Term: " + term + " years\n" +
                "Total Amount Owed: $" + (amountOfMortgage + calculateInterest()) + "\n";
    }

}


