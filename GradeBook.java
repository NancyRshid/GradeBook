
package test.java;


public class GradeBook {
    
  double subject1 ;  
  double subject2 ;   
  double subject3 ;  
  double total;  
    public GradeBook( double Gradesubject1 ,  double Gradesubject2 ,  double Gradesubject3){
        
     subject1= Gradesubject1;
     subject2= Gradesubject2;
     subject3= Gradesubject3;
        
    }   
        
        
     public void print(){
         System.out.println("subject1 :"  + subject1);       
         System.out.println("subject2 :"  + subject2);
         System.out.println("subject3 :"  + subject3);
         
     }   
    
    
    
    
    public void total(){
      total =   subject1+ subject2+ subject3; 
       System.out.println("The TOTal :"  + total) ;
    }  
        
        
    
    
    public void rate(){
        double rate = (total/300)*100;
        if (rate>=85){
         System.out.println("The Rate = A+");    
        }
        else if (rate>=75){
          System.out.println("The Rate =B");  
        }
        else{
        System.out.println("The Rate =F");
    }
       
        
    }    
        
        
    
    
    
    
    
    
    
    
    
    
}
