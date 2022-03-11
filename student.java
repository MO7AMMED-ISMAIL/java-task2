/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sectiontask2;

import java.util.*;

/**
 *
 * @author new
 */
public class student extends Person {
    ArrayList<String>Courses = new ArrayList<>();
    ArrayList<int[]>grades = new ArrayList<>();
    
    public student(String name ,String addres,String[] course , int[] grade){
        
        super(name, addres);
        this.name=name;
        this.addres=addres;
        this.Courses.addAll(Arrays.asList(course));
        this.grades.add(grade);  
    }
    
    public void addCouseGrade(String course[] , int grade[]){
        
       this.Courses.addAll(Arrays.asList(course));
       this.grades.add(grade);   
    }
    public void averageGrade(int[]grade){
        
        int i;
        int sum = 0;
        for ( i = 0; i < grades.size(); i++) {
            
            sum+=grade[i];
        }
        System.out.println("average grades = "+sum/grades.size());
          
    }
    
    
    

    
    
    
    
    
    
}
