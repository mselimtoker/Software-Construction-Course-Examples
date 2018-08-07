/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lawdemeter;

/**
 *
 * @author selimtoker
 */
public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount ba;
    
    int result;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getBankAccount() {
        return ba;
    }
    
    public float makePayment (float value){
        if(ba.getTotalValue()>= value){
            ba.subMoney(value);
            result=1;
            return result;
        }
        
        else{
            result=0;
            return result;
        }       
    }
    
    public float getTotalAccountValue(){
        
        return ba.getTotalValue();
    
    }

    public Customer(String firstName, String lastName, BankAccount ba) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.ba = ba;
    
    }
}
