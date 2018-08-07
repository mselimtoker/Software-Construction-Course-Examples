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
public class BankAccount {
    private float value;

    public float getTotalValue() {
        return value;
    }

    public void setTotalValue(float value) {
        this.value = value;
    }
    
    public void addMoney(float deposit){
        value+=deposit;
    }
    
    public void subMoney(float debit){
        value-=debit;
    }

    public BankAccount(float value) {
        this.value = value;
    }
    
}
