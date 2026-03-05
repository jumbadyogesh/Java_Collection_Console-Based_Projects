
/* 
Q3. Product Sorting by Price
Create a Product class with fields: productId, productName, price.
Store 5 products in an ArrayList.
Sort by price (lowest to highest).
Display sorted list.

👉 Explanation:
 Tests sorting real-world entities and demonstrates Comparable with numerical fields.
 */
 
	
import java.util.*;
import java.lang.Comparable;

class Product implements Comparable<Product>
{
   private int id;
   private String name;
   private int price;
   
   public Product()
   {
	   
   }
   public Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{ this.name=name;
	}
	public String getName()
	{ return name;
	}
	public  void setPrice(int price)
	{ this.price=price;
	}
	public int getPrice()
	{ return price;
	}
	
	@Override
	public int compareTo(Product other) 		// on the plasse of next we cant take whatever(other)	
	{										  // next is variable take for accessing other object
		return this.price - other.price; 	// Sort by salary (ascending)
	}
}

public class SortByPrice03 
{
	public static void main(String[] args) 
	{
	   ArrayList<Product> list=new ArrayList<>();
	   
	   Scanner sc = new Scanner(System.in);
	   for (int i = 0; i < 3; i++) 
	   {
            System.out.print("Enter Id, Name and Price of Product: ");
            int id = sc.nextInt();
            String name = sc.next();
            int price = sc.nextInt();
            list.add(new Product(id, name, price));
	   }
	   
	   System.out.println("\nProduct Data before sorting");
	   for(Object obj:list) 
	   {
		    Product e=(Product)obj;
		    System.out.println(e.getId()+ "\t"+ e.getName()+"\t"+e.getPrice());
	   }
	   
	   //Sort employees by salary
	   Collections.sort(list);
	   
	   System.out.println("\nProduct Data After sorting");
	   
	   for(Object obj:list) 
	   {	
		    Product e=(Product)obj;
		    System.out.println(e.getId()+ "\t"+ e.getName()+"\t"+e.getPrice());
	   }
	   
	}
}

