package exercise1;

import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args){

        Insurance[] insurances = new Insurance[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Insurance type:");
        String typeOfInsurance = scanner.nextLine();
        System.out.println("Enter the monthly cost :");
        double monthlyCost = scanner.nextDouble();

        if(typeOfInsurance.equals("Health")) {
            insurances[0] = new Health();
        } else if(typeOfInsurance.equals("Life")) {
            insurances[1] = new Life();
        } else {
            System.out.println("Invalid type of insurance");
            return;
        }

        for(Insurance insurance: insurances){
            if (insurance != null) {
                insurance.displayInfo();
            }
        }
    }
}
