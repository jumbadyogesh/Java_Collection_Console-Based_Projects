

import java.util.*;

public class Demo  
{  
	public static void main(String x[])
	{  
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		
		//int no;
		System.out.print("\nEnter 5 Integers : ");
		for(int i=0; i<5; i++)
		{
			v.add(sc.nextInt());
		}
		Iterator i = v.iterator();
		
		while(i.hasNext())
		{  
			Object obj = i.next();
			
			System.out.print(obj+ "  ");
		}
	}
}