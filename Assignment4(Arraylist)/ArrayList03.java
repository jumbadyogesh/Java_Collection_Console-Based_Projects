
/* 
Q3. Create an ArrayList of 10 numbers. Remove the element at index 4 and print the updated list.
Explanation:
 Here you practice the remove(index) method. Important for deletion operations.
*/

		
	import java.util.*;
	
	public class ArrayList03 
	{
		public static void main(String[] args) throws Exception 
		{
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Integer> list = new ArrayList<>();
			System.out.println("Enter 10 Integersc : ");
			for(int i=0; i<10; i++)
			{
				list.add(sc.nextInt());
			}
			/*
			System.out.println("\nPrinting Using For Each Loop");
			for(Object obj1:list)
			{
				System.out.println(obj1);
			}
			*/
			System.out.println(list);
			
			list.remove(list.get(2));
			
			System.out.println("\nAfter Removing index 2 :\n");
			
			System.out.println(list);
		}
	}
