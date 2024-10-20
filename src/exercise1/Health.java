package exercise1;

 class Health extends Insurance{

     public Health () {
         super("Health", 100);
     }

     @Override
     public  void setInsuranceCost(double cost){

     }


     @Override
     public void displayInfo(){
         System.out.println("Insurance type: " + typeOfInsurance);
         System.out.println("Monthly cost" + monthlyCost);
     }
}
