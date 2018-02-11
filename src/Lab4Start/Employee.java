package Lab4Start;

public class Employee implements Rules {
    private double salary;
    private String name;

    public Employee( String sig,double money){
        salary= money;
        name= sig;
    }

    public Employee(){
        salary=0;
        name= "No Name";
    }


    public String toString() {
        return ( name +" has a salary of: "+String.format("%.2f", salary));
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
