

//Q.1] WAP to store 5 values in Vector and arrange in ascending without using sort() methods of Collections



	import java.util.*;

public class AscendingOrder1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        Vector v = new Vector();

        // Step 1: Input 5 values
        System.out.println("Enter 5 values: ");
        for (int i = 0; i < 5; i++)
		{
            v.add(sc.nextInt());
        }

        // Step 2: Manual sorting (Bubble Sort)
        for (int i = 0; i < v.size(); i++) 
		{
            for (int j = i + 1; j < v.size(); j++) 
			{
                if ((int)v.get(i) > (int)v.get(j)) 
				{
                    // Swap
                    int temp = (int)v.get(i);
                    v.set(i,v.get(j));
                    v.set(j, temp);
                }
            }
        }

        // Step 3: Display sorted vector
        System.out.println("\nAscending Order: " + v);
    }
}


