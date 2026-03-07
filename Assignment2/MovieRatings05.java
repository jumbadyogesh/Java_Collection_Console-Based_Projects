

/*
10] WAP to create a Movie class with id, name, and rating, store 10 movies in a Vector, and display 
	the movie(s) with the highest rating.
*/


	import java.util.*;
	
	class Movie
	{
		int id;
		String name;
		int rating;
		
		Movie()
		{
			
		}
		Movie(int id, String name, int rating)
		{
			this.id=id;
			this.name=name;
			this.rating=rating;
		}
	}
	public class MovieRatings05
	{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			Vector<Movie> mov = new Vector<>();
			
			 // Step 1: Input Movies Data :
			 
			System.out.println("Enter 10 Movies Data  : ");
			for (int i = 0; i < 3 ; i++)
			{
				System.out.println("\nMovie No "+(i+1)+ " : ");
				int id = sc.nextInt();
				String name = sc.next();
				int rating = sc.nextInt();
				mov.add(new Movie(id,name,rating) );
			}
			 // Step 2: Display the Highest Rated Movie:
			 
			System.out.println("\nHighest Rated Movie :  ");
			int max=-1;
			int ind=-1;
			boolean flag = false;
			System.out.println("------------------------------");
			for (int i = 0; i < mov.size() ; i++)
			{
				if(mov.get(i).rating > max)
				{
					max = mov.get(i).rating;
					ind = i;
					flag = true;			
				}
			}
			if(flag)
			{
				System.out.println("\nID       : "+mov.get(ind).id);
				System.out.println("Name     : "+mov.get(ind).name);
				System.out.println("Ratings  : "+mov.get(ind).rating);
				System.out.println("------------------------------");
				
			}
		}
	}