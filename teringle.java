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
public class teringle implements shap {
    
    int width;
    int higth;
    
    public teringle(int x,int y){
        this.width=x;
        this.higth=y;
    }
    
    @Override
    public void print() {
         System.out.println("the shap is teringle");
    }

    @Override
    public double area() {
        int area = width * higth;
        return area;
    }
}
    
    
    

