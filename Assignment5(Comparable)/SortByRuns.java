
/*
Q4. Sort Players by Runs
Create a Player class with name and runs.
Store players in an ArrayList.
Sort players in descending order of runs.

👉 Explanation:
 For descending order, you will return negative in compareTo() logic or reverse the sorting.
 */
 
	
import java.util.*;
import java.lang.Comparable;

class Player implements Comparable<Player>
{
   private String name;
   private int runs;
   
   public Player()
   {
	   
   }
   public Player(String name,int runs)
	{
		this.name=name;
		this.runs=runs;
	}
	
	public String getName()
	{ return name;
	}
	
	public int getRuns()
	{ return runs;
	}
	
	@Override
	public int compareTo(Player other) 		// on the plasse of next we cant take whatever(other)	
	{										  // next is variable take for accessing other object
		return  other.runs - this.runs ; 	// Sort by Runs (descending)
	}
}

public class SortByRuns4 
{
	public static void main(String[] args) 
	{
	   ArrayList<Player> list=new ArrayList<>();
	   
	   Scanner sc = new Scanner(System.in);
	   for (int i = 0; i < 3; i++) 
	   {
            System.out.print("Enter Name and Runs of Player: ");
            String name = sc.next();
            int runs = sc.nextInt();
            list.add(new Player(name, runs));
	   }
	   
	   System.out.println("\nPlayers Data before sorting");
	   for(Object obj:list) 
	   {
		    Player p=(Player)obj;
		    System.out.println( p.getName()+"\t"+p.getRuns());
	   }
	   
	   //Sort employees by Runs in Decending
	   Collections.sort(list);
	   
	   System.out.println("\nPlayers Data After sorting");
	   
	   for(Object obj:list) 
	   {	
		    Player p=(Player)obj;
		    System.out.println( p.getName()+"\t"+p.getRuns());
	   }
	   
	}
}

