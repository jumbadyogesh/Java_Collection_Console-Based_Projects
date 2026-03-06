

//Q.3] WAP to store 10 values in Vector and remove duplicated values 



	
	import java.util.*;

public class RemoveDuplicate3 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        Vector v = new Vector();

        // Step 1: Input 10 values
        System.out.println("Enter 10 values: ");
        for (int i = 0; i < 10; i++)
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
		
		System.out.print("\nDuplicate Values Are : " );
		
		// Step 4: Remove Duplicate
		for (int i = 0; i < v.size();) 
		{
			int n=0;
			for (int j = i ; j < v.size(); j++) 
			{
				if((int)v.get(i) == (int)v.get(j) )
				{
					n++;
				}  
			}
			
			System.out.print(v.get(i)+ "  ");
			
			i= i + n;
		}
    }
}



