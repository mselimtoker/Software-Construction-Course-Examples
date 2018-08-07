/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author selimtoker
 */
public class employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private address address;

    public employee(String firstName, String lastName, double monthlySalary, address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        this.address = address;
    }
    
    public String getAddress(String v){
        if(v=="city"){
          return address.getCity();  
        }
       
        else if(v=="street"){
            return address.getStreet();
        }
        
        else if(v=="zip"){
            return address.getZip();
        }
        else{
          return null;    
        }
          
    }
    
    public void setAdress(String street, String city, String zip){
        address.setStreet(street);
        address.setCity(city);
        address.setZip(zip);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary<=0){
          System.out.println("Geçersiz maaş");
        }
        
        else{
            
          this.monthlySalary = monthlySalary;  
        
        }   
    }
    
    public void setRaise(double percantage){
        if(percantage>0){
          this.monthlySalary += (this.monthlySalary*percantage/100);  
        } 
    }
    
    double getYearlySalary(){
        return this.monthlySalary*12; 
    }

    @Override
    public String toString() {
        return "employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", monthlySalary=" + monthlySalary + ", address=" + address + '}';
    }   
}
