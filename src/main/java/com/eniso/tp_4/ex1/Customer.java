/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp_4.ex1;

import java.util.ArrayList;


/**
 *
 * @author ASUS
 */


public class Customer {
   private String firstName;
   private String lastName;
   private ArrayList<BankAccount> accounts;
   public Double sum=0.0;
   public Customer(String firstName,String lastName){
       this.firstName=firstName;
       this.lastName=lastName;
       this.accounts = new ArrayList<BankAccount>();
   }
   
   public void addAccount(BankAccount compte){
       accounts.add(compte);
   }
   public void removeAccount(BankAccount compte){
       accounts.remove(compte);
   }
 
   public Double getTotalAccountBalance(){
       for(BankAccount compte: accounts){
           sum+=compte.balance;
       }
       return sum;
    }
   public void transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, Double amount){
       sourceAccount.balance-=amount;
       destinationAccount.balance+=amount;
   }
}
