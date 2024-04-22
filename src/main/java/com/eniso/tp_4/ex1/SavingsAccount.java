/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp_4.ex1;


/**
 *
 * @author ASUS
 */
public class SavingsAccount extends BankAccount {
    private Double interestRate;
    public  Double penalty; 

    public SavingsAccount(Integer accountNumber, Double balance) {
        super(accountNumber, balance);
    }
     
    public Double calculateInterest(){
        return super.balance*this.getInterestRate();
    }
    public Double getInterestRate(){
        return this.interestRate;
    }
    @Override
    public void withdraw(double montant){
         if (montant>= balance/2){   
         super.balance-=(montant+penalty);
     }
         else {super.balance-=montant; }
    }
    
}
