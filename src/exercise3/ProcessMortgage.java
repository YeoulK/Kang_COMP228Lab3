package exercise3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current prime interest rate (in %): ");
        double primeRate = scanner.nextDouble();

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i< mortgages.length; i++){
            scanner.nextLine();

            System.out.println("Enter mortgage number: ");
            String mortgageNumber = scanner.nextLine();

            System.out.println("Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.println("Enter mortgage amount:");
            double amountOfMortgage = scanner.nextDouble();

            System.out.println("Enter mortgage term (1 for short, 3 for medium, 5 for long): ");
            int term = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter mortgage type (1 for Business, 2 for Personal): ");
            int type = scanner.nextInt();

            if (type == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amountOfMortgage, primeRate, term);
            } else if (type == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amountOfMortgage, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type. Skipping entry.");
                i--;
            }
        }

        for (Mortgage mortgage : mortgages) {
            System.out.println("\nMortgage Details:");
            System.out.println(mortgage.getMortgageInfo());
            System.out.println("Total Amount Owed: $" + mortgage.getTotalOwed());
        }




    }
}
