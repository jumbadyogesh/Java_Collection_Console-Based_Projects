
/* 
Q5. Write a program to store 6 integers in an ArrayList and sort them in ascending order.
Explanation:
 Use Collections.sort(list) to perform sorting. This is a common real-life operation.
*/

	
		
	import java.util.*;
	
	public class ArrayList05 
	{
		public static void main(String[] args) //throws Exception 
		{
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Integer> list = new ArrayList<>();
			System.out.println("Enter 6 Integersc : ");
			for(int i=0; i<6; i++)
			{
				list.add(sc.nextInt());
			}
			
			System.out.println("\nPrinting Using For Each Loop");
			for(Object obj1:list)
			{
				System.out.println(obj1);
			}
			
			Collections.sort(list);
			
			System.out.println("\nAfter Sorting in Ascending Order : ");
			
			System.out.println(list);
			
		}
	}
