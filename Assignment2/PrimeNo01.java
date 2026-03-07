
/*6] WAP to store 7 integer values in a Vector and display only the prime numbers.*/

	
import java.util.*;

public class PrimeNo01 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        Vector<Integer> pm = new Vector<>();

        // Step 1: Input Product
      System.out.println("Enter 7 Integers : ");
        for (int i = 0; i < 7 ; i++) {
            pm.add(sc.nextInt());
        }
		
		// Step 2: Display Prime No 
		
        System.out.println("\nDisplay Prime Numbers Only :");
        
		for(int i=0; i<pm.size() ; i++)
		{
			int count=0;
			for(int j=1; j <= pm.get(i) ; j++)
			{
				if(pm.get(i) % j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(pm.get(i)+ "  ");
			}
		}
	}
}