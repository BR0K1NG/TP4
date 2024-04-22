/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp_4.ex2;

import java.util.ArrayList;
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
public class StaffMember extends User {
    private String qualification;
    private Integer experience;
    private ArrayList<String> tasks;

    public StaffMember( String firstName, String lastName, String email, Long cin,String qualification, Integer experience, ArrayList<String> tasks) {
        super(firstName, lastName, email, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }

    
    @Override
    public void displayInfo() {
        System.out.println("FN:\t"+this.getFirstName() +"\n"+"LN:\t"+this.getLastName() +"\n"+
                "QUAL:\t"+this.qualification +"\n"+"EXP:\t"+this.experience +"\n"+"TASKS:\t"+this.tasks +"\n");
    }
    public void updateProfile(String qualification,Integer experience,ArrayList<String> tasks) {
        this.setQualification(qualification);
        this.setExperience(experience);
        this.setTasks(tasks);
                }
    @Override
      public boolean authenticate(){
        return true;
    }
      public void finishTask(String fintask){
          for(String task : tasks) {
              if (task.equals(fintask)){
                  tasks.remove(task);
              }
             
          }
      } 
}
