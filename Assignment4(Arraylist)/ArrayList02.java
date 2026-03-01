
/* 
Q2. Write a program to check whether a given element exists in an ArrayList of strings.
Explanation:
 You should use contains() to search. This helps practice searching without loops.
*/

	
	import java.util.*;
	
	public class ArrayList02 
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
			
			boolean b = lst.contains("Yogu"); // Case Sensitive 
			if(b)
			{
				System.out.println("\nElement is Present in ArrayList.");
			}
			else
			{
				System.out.println("\nElement Not Present in ArrayList");
			}
		}
	}
