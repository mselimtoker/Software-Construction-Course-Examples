package labbb3;

public class Employee extends Person {

    private double monthlySalary;
   // Boss boss;
   

    public Employee(String firstName, String lastName, int birthYear, Address address, boolean isMarried, boolean hasChildren, double monthlySalary) {
        
        super(firstName,lastName,birthYear,address,isMarried,hasChildren);
        this.monthlySalary = monthlySalary;
        
    }

   
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            return;
        }
        this.monthlySalary = monthlySalary;
    }

    public void makeSalaryIncrease(double percentage) {
        double newSalary = monthlySalary;
        if (checkSalary(percentage,super.isMarried(),super.hasChildren(),super.getAge())) {
            newSalary += (newSalary * percentage) / 100;
        }
        monthlySalary = newSalary;
    }
    
    boolean checkSalary(double percantage, boolean isMarried, boolean hasChildren, int age){
        if(percantage>0){
          boolean familyStat = isMarried && hasChildren;
          boolean ageStat= age>40;
          boolean checkStat = familyStat && ageStat;
          return checkStat;
        }     
          return false;
    }

    public double calculateCreditAmount(double salary) {
        double creditAmount;
        creditAmount=salary*3.5;
        return creditAmount;
    }
    
    

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

   

    
}
