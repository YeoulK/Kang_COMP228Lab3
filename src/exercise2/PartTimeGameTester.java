package exercise2;

public class PartTimeGameTester extends GameTester {

    int hours;

    public PartTimeGameTester(String name,int hours) {
        super(name, false);
        this.hours = hours;
    }


    public double getSalary(){
        return 20 * hours;
    }
}


