package Java;


import java.util.HashSet;
import java.util.Iterator;
public class HashSet_EX {
	public static void main(String[] args) {
		 
	    //create object of HashSet
	    HashSet hSet = new HashSet();
	   
	    //add elements to HashSet object
	    hSet.add(new Integer("1"));
	    hSet.add(new Integer("2"));
	    hSet.add(new Integer("3"));
	   
	    //get the Iterator
	    Iterator itr = hSet.iterator();
	   
	    System.out.println("HashSet contains : ");
	    while(itr.hasNext())
	      System.out.println(itr.next());
	  }

}

