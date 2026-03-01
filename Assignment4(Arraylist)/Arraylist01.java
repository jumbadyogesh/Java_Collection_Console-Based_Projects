
/*
Q1.Write a Java program to create an ArrayList of integers, add 5 numbers, and display them.
Explanation:
 This checks your understanding of basic ArrayList operations: add() and iteration (for/for-each).
*/

import java.util.*;

public class Arraylist01 
{
	public static void main(String[] args) throws Exception 
	{
		ArraydList<Integer> lst = new ArrayList<>();
		lst.add(100);
		lst.add(200);
		lst.add(300);
		lst.add(400);
		lst.add(500);
		Iterator i = lst.iterator();
		while(i.hasNext()) 
		{
			Object obj = i.next();
			System.out.println(obj);
		}
		System.out.println("\nPrinting Using For Each Loop");
		for(Integer obj1:lst)
		{
			System.out.println(obj1);
		}
	}
}

