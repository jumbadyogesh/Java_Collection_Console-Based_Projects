
/* 
Q9. Create two ArrayLists of integers and merge them into a single ArrayList.
Explanation:
 Use addAll(list2) method. This is important for combining lists.
*/

			
	import java.util.*;
	
	public class ArrayList09 
	{
		public static void main(String[] args) //throws Exception 
		{
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Integer> list1 = new ArrayList<>();
			System.out.println("Enter 6 Integers : ");
			for(int i=0; i<6; i++)
			{
				list1.add(sc.nextInt());
			}
			
			ArrayList<Integer> list2 = new ArrayList<>();
			System.out.println("Enter 6 Integers : ");
			for(int i=0; i<6; i++)
			{
				list2.add(sc.nextInt());
			}
			
			list1.addAll(list2);
			
			System.out.println("\nAfter Mearging two listes : ");
			
			System.out.println(list1);
			
		}
	}
