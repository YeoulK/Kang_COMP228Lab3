package exercise1;

 class Life extends Insurance {

     public Life(){
         super("Life", 200);
     }


     @Override
     public void setInsuranceCost(double cost){
     }

     public void displayInfo(){
         System.out.println("Insurance type: " + typeOfInsurance);
         System.out.println("Monthly cost: " + monthlyCost );
     }
     }

