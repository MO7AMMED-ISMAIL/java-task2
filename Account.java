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
public class Account {
    
   private int id,blance;
   private  String name;
    
    public Account(int id , String name){
       
        this.name = name;
        this.id = id;       
    }
    public Account(int id , String name,int blance){
       
        this.name = name;
        this.id = id;
        this.blance=blance;
    }
    
    public int cridet(int amount ){
        
        this.blance +=amount;
        return blance;
    }
    public int debit(int amount ){
        
        if(blance >= amount){
            blance -=amount;
            System.out.print("the operation are executed and blance is ");
            
        }else{
            System.out.print("Your blance is not engouh for cridet amount,blance ");
        }   
        return blance;
    }
    public int tranferto(int account,int amount){
        
          if(blance >= amount){
            blance -=amount;
            account=amount;
            System.out.println("the transefer is executed");
        }else{
            System.out.println("Your blance is not engouh for transfer this amount");
        }
        return blance;   
    }
    
    
    
    
}
    
    
    

