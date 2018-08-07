/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxrate;

import java.util.Scanner;

/**
 *
 * @author selimtoker
 */
public class TaxRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter monthly earnings: ");
        Scanner scanner = new Scanner(System.in);
        int monthlySalary = scanner.nextInt();
        System.out.println("Your total tax: "+calculateTax(monthlySalary)+" TL");
    
    }
    
    public static float calculateTax(int monthlySalary){
        
        final int NUMBER_OF_CALCULATED_MONTH = 12;
        
        final float GROUP_A_TAX_RATE =  0.15f;
        final float GROUP_B_TAX_RATE =  0.20f;
        final float GROUP_C_TAX_RATE =  0.27f;
        final float GROUP_D_TAX_RATE =  0.35f;
        
        final int GROUP_A_UP_TO = 11000;
        final int GROUP_B_UP_TO = 27000;
        final int GROUP_C_UP_TO = 97000;
        
        int yearlySalary = monthlySalary * NUMBER_OF_CALCULATED_MONTH;
        float calculatedTax;
        
        if(yearlySalary <=GROUP_A_UP_TO){
            calculatedTax=yearlySalary * GROUP_A_TAX_RATE;
        }
        
        else if(yearlySalary<=GROUP_B_UP_TO){
            calculatedTax= 1650 + ((yearlySalary-GROUP_A_UP_TO)*GROUP_B_TAX_RATE);
            //return calculatedTax;
        }
        
        else if(yearlySalary<=GROUP_C_UP_TO){
            calculatedTax= 4850 + ((yearlySalary-GROUP_B_UP_TO)*GROUP_C_TAX_RATE);  
        }
        
        else{
            calculatedTax= 23750 + ((yearlySalary-GROUP_C_UP_TO)*GROUP_D_TAX_RATE);
        }
        
        return calculatedTax;
     
    }  
}
