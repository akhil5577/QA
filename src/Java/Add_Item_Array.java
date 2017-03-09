package Java;


/*33) write code to add items to integer, string*/
public class Add_Item_Array {
	public static void main(String[] args) {
		String value =  "Akhil"; // gets already created value
		// there is no append method. 
	     value = value+" Lakma"; //creates a new reference in the heap as it is immutable
	     System.out.println("using String: "+value);
	     StringBuffer value1 = new StringBuffer("appended ");
	     value1.append("using append method"); // mutable
	     System.out.println(" using string Buffer: "+value1);
	     
	     
	     // using StringBuilder
	     StringBuilder value2 = new StringBuilder("appended ");
	     value2.append("using append method ");
	     System.out.println("using StringBuilder: "+value2);
	}


}
