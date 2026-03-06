
/* 
Q.5] WAP to create class name as Product with id,name ,price and store 10 product detail 
	vector and search product by using its id 
*/



import java.util.*;

class Product{
    int id;
    String name;
    int price;
	
	Product() 
	{
       
    }

    Product(int id, String name, int price)
	{
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString()
	{
		System.out.println("----------------------------------------");
        return "ID : " + id + ", Name  : " + name + ", Price  : " + price;
    }
}

public class ProductData5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Product> p1 = new Vector<>();

        // Step 1: Input Product
      
        for (int i = 0; i < 10; i++) {
			System.out.println("Enter ID, Name and Price of Product:");
            int id = sc.nextInt();
            String name = sc.next();
            int price = sc.nextInt();
            p1.add(new Product(id, name, price));
        }
		
		// Step 2: Display Products
        System.out.println("\nDisplay Products :");
        for (Product p : p1) {
            System.out.println(p);
        }
		
		 // Step 3: Search By Product ID
		 System.out.print("Enter Product ID : ");
		 int check = sc.nextInt();
		 boolean flag= false;
		 
        for(int i=0; i<p1.size() ; i++)
		{
			if(p1.get(i).id == check )
			{
				System.out.println(p1.get(i));
				flag = true;
				break;
			}	
		}
		if(!flag)
		{
			System.out.println("No Id Found !");
		}
    }
}