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
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Long cin ;
    
    public void displayInfo(){
        System.out.println("FN:\t"+this.firstName +"\n"+"LN:\t"+this.lastName +"\n"+"Email:\t"+this.email +"\n"+"CIN:\t"+this.cin +"\n" );
    }
    public void updateProfile(String firstName,String lastName,String email,Long cin ){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setCin(cin);
    }
    public boolean authenticate(){
        return true;
    }
}
