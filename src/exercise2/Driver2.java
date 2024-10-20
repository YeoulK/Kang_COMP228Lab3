package exercise2;

import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the type of game tester (full-time/part-time): ");
        String type = scanner.nextLine();

        System.out.println("Enter the name of the game tester: ");
        String name  = scanner.nextLine();

        GameTester tester =null;

        if(type.equalsIgnoreCase("full-time")){
            tester = new FullTimeGameTester(name);
        } else if(type.equalsIgnoreCase("part-time")){
            System.out.println("Enter the number of hours worked: ");
            int hours = scanner.nextInt();
            tester = new PartTimeGameTester(name,hours);
        } else{
            System.out.println("Invalid tester type");
        }

        System.out.println("Game Tester Name : "+ tester.getName());
        System.out.println("Salary: $"+ tester.getSalary());





    }


}