


//8] WAP to store 15 integer values in a Vector and separate even and odd numbers into two different Vectors.


import java.util.*;

public class EvenOdd03 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        Vector<Integer> Ev = new Vector<>();
        Vector<Integer> Evn = new Vector<>();

        // Step 1: Input Integers
		System.out.println("Enter 15 Integers : ");
        for (int i = 0; i < 15 ; i++) {
            Ev.add(sc.nextInt());
        }
		
		// Step 2: Seperating Even Numbers in another Vector And Removing it from First Vector
		
		for(int i=0; i<Ev.size() ; i++)
		{
			if(Ev.get(i) % 2 == 0)
			{
				Evn.add(Ev.get(i));
				Ev.remove(Ev.get(i));
			}
		}
		System.out.println("\nEven Numbers : "+Evn);
		System.out.println("\nOdd Numbers : "+Ev);
	}
}