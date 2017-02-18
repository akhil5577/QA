package Java;


/*25) write code to handle exceptions with try/catch/finally?*/
public class ExceptionHandling {
void test(){
     
      try   {
      int x=0,y=8;
      int num=y/x;
      System.out.println(num);
 
}catch(Exception e){
     
      System.out.println("Exception Occoured " +e);
}
      finally{
            System.out.println("This is finally block ");
      }
}
 
public static void main(String[] args) {
	ExceptionHandling eh=new ExceptionHandling();
      eh.test();
}
     
     
}

