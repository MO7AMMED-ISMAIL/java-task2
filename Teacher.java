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
public class Teacher extends Person{
    int numCourse =0;
    String[]courses ={"ld","ai","os","sw","assembly"};

    public Teacher(String name, String addres) {
        super(name, addres);
        this.name = name;
        this.addres = addres;
    }
    
    public boolean addCourse(String course){
    
       boolean check = false;
        for (String cou : courses) {
           if(cou.equals(course)){
                check=false;
                break;
            }else{
                check=true;
            }
        }
        return check;
    }
    
    public boolean removeCourse(String course){
        boolean check = false ;
        for (String cou : courses) {
           if(cou.equals(course)){
                check=true;
                break;
            }else{
                check=false;
            }
        }
        
        return check;
    }
    
    
    
    
   
}
