package Java;


/*16) creating static method?
			17)calling method with void*/
public class Static_Method_EX {
	
	int rollno;  
    String name;  
    static String college = "ITS";  
     
    static void change(){  // creating static method
    college = "BBDIT";  
    }  
 
    Static_Method_EX(int r, String n){ //creating constructor 
    rollno = r;  
   name = n;  
 }  
 //creating method neme display
   void display (){
System.out.println(rollno+" "+name+" "+college);}  

  public static void main(String args[]){  
	  Static_Method_EX.change();  
 //creating objects
	  Static_Method_EX s1 = new Static_Method_EX (111,"Akhil");  
	  Static_Method_EX s2 = new Static_Method_EX (222,"raju");  
	  Static_Method_EX s3 = new Static_Method_EX (333,"srujan");  
 
  s1.display();  //calling method 
  s2.display();  
   s3.display();  
   } 

}

