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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       float value = 2;
       Customer customer = new Customer("Selim", "Toker", new BankAccount(500));
       
       if(customer.makePayment(value)==1){
           System.out.println("Succesfull");
       }
       
       else if(customer.makePayment(value)==0){
           System.out.println("Not - Succesfull");
       }
       
       System.out.println(customer.getTotalAccountValue());
       
    }
    
}
