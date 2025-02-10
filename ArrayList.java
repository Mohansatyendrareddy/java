package arraylistprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Arraylist1 {
	
	
  public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		    for(int i=1;i<=10;i++)
		    	list.add(i);
	   // display object
		     System.out.println(list);
		     
		     
		// using iterator
		          Iterator itr=list.iterator();
		          while(itr.hasNext()) {
		        	  System.out.print(itr.next()+" ");
		          }
		          System.out.println();
		// using list iterator
		             ListIterator litr= list.listIterator();
		             while(litr.hasNext()) {
			        	  System.out.print(litr.next()+" ");
			          }
		             System.out.println();
		             // by using for each loop
		   for(Object i:list) {
			   System.out.print(i+" ");
		   }
		   System.out.println();
		   // by using for loop
		    for(int i=0;i<list.size();i++) {
		    	System.out.print(list.get(i)+" ");
		    }
		    System.out.println();
		    // by using for each method
		    list.forEach((n)->{ System.out.print(n+" ");});
		    System.out.println();
		    // by using array
		           Object[] a=  list.toArray();
		           for(int i=0;i<a.length;i++) {
		        	   System.out.print(a[i]+" ");
		           }

	}

}