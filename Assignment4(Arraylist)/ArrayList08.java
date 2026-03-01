
/* 
Q8. Write a Java program to remove duplicate elements from an ArrayList of strings.
Explanation:
 Convert ArrayList to a LinkedHashSet (to maintain order) and back to ArrayList. Tests your ability 
 to use collection conversion.
*/


	import java.util.*;
	
	public class ArrayList08 
	{
		public static void main(String[] args) throws Exception 
		{
			ArrayList<String> lst = new ArrayList<>();
			lst.add("Yogu");
			lst.add("Aaku");
			lst.add("Yogu");
			lst.add("Ammu");
			lst.add("Yogu");
			
			System.out.println("\nPrinting Using For Each Loop");
			for(String obj1:lst)
			{
				System.out.print(obj1 + "  ");
			}
			
			// Step 2: Convert to LinkedHashSet to remove duplicates and keep order
			LinkedHashSet<String> set = new LinkedHashSet<>(lst);

			// Step 3: Convert back to ArrayList
			ArrayList<String> uniqueNames = new ArrayList<>(set);

			// Step 4: Print the result
			System.out.println("\n\nList after removing duplicates:\n");
			System.out.println(uniqueNames);
		}
	}
