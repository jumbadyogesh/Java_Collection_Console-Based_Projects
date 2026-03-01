

/* 
Q11. Write a Java program to find the maximum and minimum numbers from an ArrayList of integers.
Explanation:
 Use Collections.max(list) and Collections.min(list) OR write logic manually with iteration.
 It builds confidence in applying algorithms to ArrayList.
*/


	import java.util.*;
	
	public class ArrayList11 
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
			
			int max = list.get(0);
			int min = list.get(0);
			
			for (int i = 1; i < list.size(); i++) {
				int current = list.get(i);
			
				if (current > max)
				{
					max = current;
				}			
				if (current < min) 
				{
					min = current;
				}
			}
			
			System.out.println("\nMax Element : "+max);
			
			System.out.println("\nMin Element : "+min);
			
		}
	}
