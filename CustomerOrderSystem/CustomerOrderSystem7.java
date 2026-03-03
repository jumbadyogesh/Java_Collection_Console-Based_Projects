
/*
Q7. Customer Order System
 👉 Create a Customer POJO with fields: id, name, city.
 👉 Create an ArrayList<Customer> and store multiple customers.
 👉 Display all customers belonging to a specific city (take input).
Explanation:
 Checks filtering ArrayList objects using string comparison.
*/

		import java.util.*;
	
	class Customer{
		private int id;
		private String name;
		private String city;
		
		Customer(int id, String name, String city)
		{
			this.id=id;
			this.name=name;
			this.city=city;
		}
		public int getId()
		{
			return id;
		}
		public void setId(int id)
		{
			this.id=id;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public String getCity()
		{
			return city;
		}
		public void setCity(String cityc)
		{
			this.city=city;
		}
		@Override
		public String toString() {
			return id + "\t" + name + "\t" + city;
		}
	}
	public class CustomerOrderSystem7
	{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Number Of Customers : ");
			int no = sc.nextInt();
			
			ArrayList<Customer> list = new ArrayList<>();
			
			System.out.println("Enter Book Ddetail : ");
			for(int i=0; i<no; i++)
			{
				System.out.print("\nEnter Customer Id    : ");
				int id =sc.nextInt();
				System.out.print("Enter Customer Name  : ");
				String name =sc.next();
				System.out.print("Enter Customers City : ");
				String city =sc.next();
				
				list.add(new Customer(id,name,city));
			}
			
			System.out.println("\nList Of Customers : ");
			System.out.println("Id ||  Name  || City ");
			System.out.println("--------------------------------");
			for(Customer cos: list)
			{
				System.out.println(cos);
			}
			System.out.println("--------------------------------");
			
			System.out.print("\nEnter City : ");
			String city = sc.next();
			boolean flag= false;
			
			for(Customer cos: list)
			{
				if(cos.getCity().equalsIgnoreCase(city))
				{
					System.out.println("\nId ||  Name  || City ");
					System.out.println("--------------------------------");
					System.out.println(cos);
					System.out.println("--------------------------------");
					flag = true;
				}
			}
			if(!flag)
			{
				System.out.println("Theerer Is No Customer Belongs To : "+city);
			}
			
		}
	}