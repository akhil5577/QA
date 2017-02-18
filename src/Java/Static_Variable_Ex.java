package Java;



/*15) Creating startic property.*/

class Static_Variable_EX{  
	   int rollno;  
	   String name;  
	   static String college ="ITS";  //initializing variables
	     
	   Static_Variable_EX(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 void display (){System.out.println(rollno+" "+name+" "+college);}  //printing
	  
	public static void main(String args[]){  
		Static_Variable_EX s12 = new Static_Variable_EX(111,"Akhil");  //creating object
		Static_Variable_EX s3 = new Static_Variable_EX(222,"Srujan");  //creating object
	   
	 s12.display();  //calling object
	 s3.display(); //calling object 
	}  
	} 

