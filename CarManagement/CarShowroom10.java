

/* 
Q10. Car Showroom Inventory
👉 Create a Car POJO with fields: carId, model, price, year.
👉 Store multiple cars in ArrayList<Car>.
👉 Display cars whose year is after 2020 and price below 10 lakh.
Explanation:
 Tests filtering with multiple conditions on an ArrayList.
*/

	import java.util.*;
	
	class Car{
		private int id;
		private String model;
		private float price;
		private int year;
		
		Car(int id, String model, float price, int year)
		{
			this.id=id;
			this.model=model;
			this.price=price;
			this.year=year;
			
		}
		public float getPrice()
		{
			return price;
		}
		public int getYear()
		{
			return year;
		}
		@Override
		public String toString() {
			return id + "\t" + model + "\t" + price + "\t"+ year ;
		}
	}
	public class CarShowroom10
	{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\nEnter Number Of Car : ");
			int no = sc.nextInt();
			
			ArrayList <Car> list = new ArrayList<>();
			
			System.out.println("\nEnter Car Detail : ");
			for(int i=0; i<no; i++)
			{
				System.out.print("\nEnter Car Id    : ");
				int id =sc.nextInt();
				System.out.print("Enter Car Model  : ");
				String model =sc.next();
				System.out.print("Enter Car Price : ");
				float price =sc.nextFloat();
				System.out.print("Enter Car Year : ");
				int year =sc.nextInt();
				
				list.add(new Car(id,model,price,year));
			}
			
			System.out.println("\nList Of Car :");
			System.out.println("Id  ||  Model ||  Price  || Year ");
			System.out.println("-------------------------------------");
			for(Car cr: list)
			{
				System.out.println(cr);
			}
			System.out.println("-------------------------------------");
		
			boolean flag = false;
			
			System.out.println("\nCars whose year is after 2020 and price < 10 lakh. : ");
			System.out.println("Id  ||  Model ||  Price  || Year ");
			System.out.println("-------------------------------------");
			for(Car cr: list)
			{
				if(cr.getYear() > 2020 && cr.getPrice() < 1000000 )
				{
					System.out.println(cr);
					flag = true;
				}
			}
			System.out.println("-------------------------------------");
			
			if(!flag)
			{
				System.out.println("\n There Are No Car price < 1000000 and year > 2020 ! ");
			}
		
		}
	}