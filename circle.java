/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sectiontask2;

/**
 *
 * @author new
 */
public class circle {
   private double raduis = 1.0;
   private String color = "red";
    
    
    public circle(double raduis){
        this.raduis = raduis;        
    }
    public circle(){}
    
    public double getRaduis(){
        return this.raduis;
    }
    public String getColor(){
        return this.color;
    }
    
    public double area(){
        double area = 2*raduis*raduis;
        return area;
    }
    
    
    
}
