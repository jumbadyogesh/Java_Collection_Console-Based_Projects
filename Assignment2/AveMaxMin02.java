
//7] WAP to store 10 floating-point values in a Vector and calculate the average, maximum, and minimum.

		
import java.util.*;

public class AveMaxMin02 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        Vector<Float> amm = new Vector<>();

        // Step 1: Input 10 Floating point no
      
		System.out.println("Enter 10 Floating point Numbers : ");
        for (int i = 0; i < 10 ; i++) 
		{
            amm.add(sc.nextFloat());
        }
		
		// Step 2: Find Average
		float sum = 0;
		
		for (int i = 0; i < amm.size() ; i++)
		{
           sum = sum + amm.get(i);
        }
		System.out.println("Average of given Numbers : "+sum/amm.size());
		
		float max = amm.get(0);;
		
		for (int i = 0; i < amm.size() ; i++)
		{
           if(amm.get(i) > max)
		   {
			   max = amm.get(i);
		   }
        }
		System.out.println("Max of given Numbers : "+max);
		
		float min = amm.get(0);
		
		for (int i = 0; i < amm.size() ; i++)
		{
          if(amm.get(i) < min)
		   {
			   min = amm.get(i);
		   }
        }
		System.out.println("Min of given Numbers : "+min);
    }
}
/*
for (float num : amm) {
    if (num > max) max = num;
    if (num < min) min = num;
}
System.out.println("Max: " + max);
System.out.println("Min: " + min);
*/