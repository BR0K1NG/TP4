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


public class Bank {
    private ArrayList<Customer> clients = new ArrayList<Customer>();
    public Double sum=0.0;
    public void addCustomer(Customer client){
       clients.add(client);
   }
    public void removeCustomer(Customer client){
       clients.remove(client);
   }
     public Double getTotalBalance(){
       for(Customer client: clients){
           sum+=client.getTotalAccountBalance();
       }
       return sum;
    }
}
