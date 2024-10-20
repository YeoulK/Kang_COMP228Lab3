package exercise2;

 abstract class GameTester {

     protected String name;
     protected boolean fullTime;

     public GameTester(String name, boolean fullTime ){
         this.name = name;
         this.fullTime = fullTime;
     }

     public String getName(){
         return name;
     }

     public void setName(String name){
         this.name = name;
     }


     public boolean isFullTime() {
         return fullTime;
     }

     public void setFullTime(boolean fullTime){
         this.fullTime = fullTime;
     }

     public abstract double getSalary();

 }


