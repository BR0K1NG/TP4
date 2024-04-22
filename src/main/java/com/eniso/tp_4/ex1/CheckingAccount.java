/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp_4.ex1;



/**
 *
 * @author ASUS
 */


public class CheckingAccount extends BankAccount {
    private Double overdraftAllowed = 200.0;

    public CheckingAccount(Integer accountNumber, Double balance) {
        super(accountNumber, balance);
    }
    
    public void setOverdraftAllowed(Double overdraftAllowed) {
        this.overdraftAllowed=overdraftAllowed;
    }
    public Double getOverdraftAllowed() {
        return this.overdraftAllowed;
    }
    @Override
    public void withdraw(double montant) {  
        if ((montant- super.balance)<= this.overdraftAllowed){   
         super.balance-=(montant);
     }
         else {System.out.println("REFUSED REACHED THE LIMIT "); }
    }
    
}
