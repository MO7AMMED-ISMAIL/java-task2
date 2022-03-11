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
public class SectionTask2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            teringle t1 = new teringle(10, 10);
            double area = t1.area();
            System.out.println("the area of teringle = "+area);
            System.out.println("----------------------------------------------");

             double raduis = 2.4;
             circle c1 = new circle(raduis);
             double r = c1.getRaduis();
             double circle_area = c1.area();
             System.out.println("the area of teringle = "+r);        
             System.out.println("the area of teringle = "+circle_area);
             System.out.println("----------------------------------------------");


             Account A1 = new Account(1, "Mohammed", 1000);
             int mybalance =A1.cridet(1000);
             int withdraw =A1.debit(1000);
             int tranfer = A1.tranferto(0,1000);
             System.out.println("the blance account is  = "+mybalance); 
             System.out.println("After withdraw an account the blance is = "+withdraw); 
             System.out.println("After withdraw an account the blance is = "+tranfer);


             System.out.println("----------------------------------------------");
             String[] course ={"ai","os2","sw","logic"};
             int[] grade = {100,100,100}; 
             student s1=new student("Mohamed", "Tanta",course ,grade);
             
             Teacher T1 = new Teacher("ahmed", "Egypt");
             boolean check =T1.addCourse(course[2]);
             
             
             if(check == false){
                 System.out.println("the course is aredy exsited");
             } else{
                 System.out.println("the course is added");
             }
             
             
             boolean check2 =T1.removeCourse(course[3]);
             
             if(check2 == true){
                 System.out.println("the course is remove");
             } else{
                 System.out.println("the course is not exsited");
             }
             
             s1.averageGrade(grade);
             
             
    }
}
    

