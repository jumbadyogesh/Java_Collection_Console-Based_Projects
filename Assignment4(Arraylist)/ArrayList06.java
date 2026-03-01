
/* 
Q6. Store 7 strings in an ArrayList and display them in reverse order.
Explanation:
 Two ways:
Use Collections.reverse(list).
Iterate manually from last index to 0.
*/

	
	import java.util.*;
	
	public class ArrayList06 
	{
		public static void main(String[] args) throws Exception 
		{
			Scanner sc = new Scanner(System.in);
			
			ArrayList<String> list = new ArrayList<>();
			
			for(int i=0; i<7; i++)
			{
				list.add(sc.next());
			}
			
			System.out.println("\nPrinting Using For Each Loop");
			for(String obj1:list)
			{
				System.out.println(obj1);
			}
		
			Collections.reverse(list);
			
			System.out.println("\nPrinting After Setting new Element ");
			for(String obj1:list)
			{
				System.out.println(obj1);
			}
		}
	}
