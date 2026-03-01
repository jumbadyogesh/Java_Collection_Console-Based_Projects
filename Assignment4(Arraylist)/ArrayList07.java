

/*
Q7. Write a Java program to find the largest and smallest number from an ArrayList of integers.
Explanation:
 Use Collections.max(list) and Collections.min(list) for quick implementation.
*/

			
	import java.util.*;
	
	public class ArrayList07 
	{
		public static void main(String[] args) //throws Exception 
		{
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Integer> list = new ArrayList<>();
			System.out.println("Enter 6 Integers : ");
			for(int i=0; i<6; i++)
			{
				list.add(sc.nextInt());
			}
			
			System.out.println("\nPrinting Using For Each Loop");
			for(Object obj1:list)
			{
				System.out.print(obj1 + "  ");
			}
			
			System.out.print("\n\nMax Element : "+ Collections.max(list));
			
			
			System.out.print("\n\nMin Element : "+ Collections.min(list));
			
			
		}
	}
