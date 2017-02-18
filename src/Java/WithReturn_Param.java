package Java;

/*20) calling method with return and parameter
*/
public class WithReturn_Param {
	  
		   int id;  
		   String name;  
		      
		   WithReturn_Param(int i,String n)//parameterized constructor
		{  
		    id = i;  
		    name = n;  //assigning values
		    }  
		    void display(){
		System.out.println(id+" "+name);}    
		public static void main(String args[]){  
			WithReturn_Param s1 = new WithReturn_Param(111,"Akhil");  //creation of objects and paasing values
			WithReturn_Param s2 = new WithReturn_Param(222,"Raja");  
		   s1.display();  //calling method
		   s2.display();  
		  }  

}
