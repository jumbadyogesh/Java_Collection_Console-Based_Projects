
/*
Q5. Sort Books by Title (Alphabetically)
Create a Book class with id, title, and author.
Store books in an ArrayList.
Sort them alphabetically by title.

👉 Explanation:
 This shows how to sort strings (lexicographically) using compareToIgnoreCase().
 
*/

import java.util.*;
import java.lang.Comparable;

class Book implements Comparable<Book>
{
   private int id;
   private String title;
   private String author;
   
   public Book()
   {
	   
   }
   public Book(int id,String title,String author)
	{
		this.id=id;
		this.title=title;
		this.author=author;
	}
	public int getId()
	{ return id;
	}
	
	public String getTitle()
	{ return title;
	}
	
	public String getAuthor()
	{ return author;
	}
	
	@Override
	 public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title); // ✅ alphabetical order
    }
}

public class SortByTitle05 
{
	public static void main(String[] args) 
	{
	   ArrayList<Book> list=new ArrayList<>();
	   
	   Scanner sc = new Scanner(System.in);
	   for (int i = 0; i < 3; i++) 
	   {
            System.out.print("Enter id , title and Author of Book: ");
			int id= sc.nextInt();
            String title = sc.next();
            String author= sc.next();
            list.add(new Book(id, title, author));
	   }
	   
	   System.out.println("\nBook Data before sorting");
	   for(Object obj:list) 
	   {
		    Book b=(Book)obj;
		    System.out.println( b.getId()+"\t"+ b.getTitle()+"\t"+b.getAuthor());
	   }
	   
	   //Sort Books by their Title
	   Collections.sort(list);		// Calls CompareTo() method internaly till it does not gwt Sorted
	   
	   System.out.println("\nBook Data After sorting");
	   
	   for(Object obj:list) 
	   {	
		    Book bk=(Book)obj;
		    System.out.println(bk.getId()+"\t"+ bk.getTitle()+"\t"+bk.getAuthor());
	   }
	   
	}
}


