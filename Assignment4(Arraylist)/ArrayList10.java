
/*
Q10. Write a program to traverse an ArrayList of 5 elements using an Iterator.
Explanation:
 Instead of a for loop, use Iterator and its methods: hasNext() and next(). 
 Important for interview-level practice.
*/
import java.util.*;
	
public class Arraylist10 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<5; i++)
		{
			list.add(sc.nextInt());
		}
	
		Iterator i = list.iterator();
		while(i.hasNext()) 
		{
			Object obj = i.next();
			System.out.print(obj+ "  ");
		}
	}
}
