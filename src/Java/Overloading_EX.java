package Java;
/*29) implement method overloading?*/
public class Overloading_EX {

	  void sum(int a,int b)
	  {
		  System.out.println(a+b);
		  }  
	  void sum(int a,int b,int c)
	  {
		  System.out.println(a+b+c);
		  }  
	  
	  public static void main(String args[]){  
		  Overloading_EX obj=new Overloading_EX();  
	  obj.sum(10,10,10);  
	  obj.sum(20,20);  
	  
	  }  


}
