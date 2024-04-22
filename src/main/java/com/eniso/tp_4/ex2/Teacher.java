/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp_4.ex2;

import java.util.List;
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
public class Teacher extends User {
 private Long hIndex;
 private List<Course> courses ;

    public Teacher(String firstName, String lastName, String email, Long cin,Long hIndex, List<Course> courses){
        super(firstName, lastName, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }

    public Teacher(Long hIndex, List<Course> courses) {
        this.hIndex = hIndex;
        this.courses = courses;
    }
 
 @Override
 public void displayInfo() {
        System.out.println("FN:\t"+this.getFirstName() +"\n"+"LN:"+"\t"+this.getLastName() +"\n"+
                "HINDEX:\t"+this.hIndex +"\n"+"COURSES:\t"+this.courses +"\n");
    }
  public void updateProfile(Long hIndex,List<Course> courses) {
        this.setHIndex(hIndex);
        this.setCourses(courses);
    }
 @Override
    public boolean authenticate(){
        return true;
    }
    public void displayCoursesContent(){
      this.courses.forEach(System.out::println);
    }
}
