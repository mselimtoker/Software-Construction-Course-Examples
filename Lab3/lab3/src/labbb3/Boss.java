package labbb3;


public class Boss extends Employee{
    private double profitOfCompany;

    public Boss(String firstName, String lastName, int birthYear, Address address, boolean isMarried, boolean hasChildren, double monthlySalary, double profitOfCompany) {
        super(firstName, lastName, birthYear, address, isMarried, hasChildren, monthlySalary);
        this.profitOfCompany = profitOfCompany;
    }


    public double getProfitOfCompany() {
        return profitOfCompany;
    }

    public void setProfitOfCompany(double profitOfCompany) {
        this.profitOfCompany = profitOfCompany;
    }

    @Override
    public String toString() {
        return
                "profitOfCompany : " + profitOfCompany;
    }
}
