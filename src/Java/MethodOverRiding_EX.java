package Java;


/*30) implement method overriding*/
public class MethodOverRiding_EX {
	void run(){
		System.out.println("Vehicle is running");}  
		}  
		class Bike2 extends MethodOverRiding_EX{  // method overriding
		void run()
		{System.out.println("Bike is running safely");}  
		  
		public static void main(String args[]){  
			MethodOverRiding_EX obj = new MethodOverRiding_EX();  
		obj.run();  
		}  

}

