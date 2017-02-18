package Java;


/*14) creating method with return data type and parameter*/
public class ParameterizedConstructor {
	 
    int id;  
    String name;  //declaring variables
      
    ParameterizedConstructor(int i,String n){ //parameterized constructor 
    id = i;  
    name = n;  //assigning values
    }  
    void display()
    {
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[]){  
    	ParameterizedConstructor s1 = new ParameterizedConstructor(111,"AKhil");  
    	ParameterizedConstructor s2 = new ParameterizedConstructor(222,"karthik");  
    s1.display();  //calling objects
    s2.display();  
   }  
} 

