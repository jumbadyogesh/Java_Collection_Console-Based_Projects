
/*
Q.4] WAP to create Player class and store player id,name ,run in Vector class and and sort
	player data using its run as well as find the list of player whose run is same 
*/

import java.util.*;

class Player {
    int id;
    String name;
    int runs;
	
	Player() 
	{
       
    }

    Player(int id, String name, int runs) {
        this.id = id;
        this.name = name;
        this.runs = runs;
    }

    public String toString() {
        return "ID : " + id + ", Name  : " + name + ", Runs  : " + runs;
    }
}

public class CricketPlayer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Player> players = new Vector<>();

        // Step 1: Input players
        System.out.println("Enter ID, Name and Runs of 2 Players:");
        for (int i = 0; i < 2; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int runs = sc.nextInt();
            players.add(new Player(id, name, runs));
        }
		
		 // Step 2: Sort by runs
        for(int i=0; i<players.size()-1 ; i++)
		{
			for(int j=i+1; j<players.size() ; j++)
			{
				if(players.get(i).runs > players.get(j).runs )
				{
					Player temp = players.get(i);
					players.set(i, players.get(j));
					players.set(j, temp);
				}
			}
		}

        // Step 3: Display sorted list
        System.out.println("\nPlayers sorted by runs:");
        for (Player p : players) {
            System.out.println(p);
        }

        // Step 4: Find duplicates (same runs)
        System.out.println("\nPlayers with same runs:");
        for (int i = 0; i < players.size() - 1; i++) {
            if (players.get(i).runs == players.get(i + 1).runs) {
                System.out.println(players.get(i) + " AND " + players.get(i + 1));
            }
        }
		// find max run player
		 Player mrplayer=new Player();
		 //mrplayer.runs=0;
         for(Player p:players) //smart for loop
		 {
			if(p.runs >mrplayer.runs)
			{
				mrplayer=p;
			}
		 }
		System.out.println("\nMax run player is :");
		System.out.println( mrplayer.toString());
		
    }
}