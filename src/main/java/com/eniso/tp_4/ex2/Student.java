/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp_4.ex2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ASUS
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student extends User {
    private Double average;
    private Classe classe;
    private Status status;

    public Student(String firstName, String lastName, String email, Long cin, Double average, Classe classe, Status status) {
        super(firstName, lastName, email, cin);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("FN:\t"+this.getFirstName() +"\n"+"LN:"+"\t"+this.getLastName() +"\n"+
                "AVG:\t"+this.average +"\n"+"CLS:\t"+this.classe +"\n"+"STATUS:\t"+this.status +"\n");
    }
    public void updateProfile(String firstName,String lastName,String email) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
      
        
    }
    @Override
      public boolean authenticate(){
        return true;
    }
    
}
