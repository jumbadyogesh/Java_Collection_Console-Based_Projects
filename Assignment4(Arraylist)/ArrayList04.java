
/* 
Q4. Create an ArrayList of names. Update the 2nd element with a new name and display the list.
Explanation:
 Tests knowledge of set(index, element) method.
*/

	import java.util.*;
	
	public class ArrayList04 
	{
		public static void main(String[] args) throws Exception 
		{
			ArrayList<String> lst = new ArrayList<>();
			lst.add("Yogu");
			lst.add("Aaku");
			lst.add("Aanu");
			lst.add("Ammu");
			lst.add("Raju");
			
			System.out.println("\nPrinting Using For Each Loop");
			for(String obj1:lst)
			{
				System.out.println(obj1);
			}
			
			lst.set( 1 , "Aakash");
			
			System.out.println("\nPrinting After Setting new Element ");
			for(String obj1:lst)
			{
				System.out.println(obj1);
			}
		}
	}
