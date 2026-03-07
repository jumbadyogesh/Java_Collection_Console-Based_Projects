

/*
9] WAP to create an Employee class with id, name, and salary, store 10 employees in a Vector, and 
	display employees with salary above a given amount.
*/

	import java.util.*;
	class Employee
	{
		int id;
		String name;
		int salary;
		
		Employee()
		{
			
		}
		Employee(int id, String name, int salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
	}
	public class Employee09
	{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			Vector<Employee> emp = new Vector<>();
			
			 // Step 1: Input Employee Data :
			 
			System.out.println("Enter 10 Employee Data  : ");
			for (int i = 0; i < 3 ; i++)
			{
				System.out.println("\nEmployee No "+(i+1)+ " : ");
				int id = sc.nextInt();
				String name = sc.next();
				int salary = sc.nextInt();
				emp.add(new Employee(id,name,salary) );
			}
			 // Step 2: Display the Employee Whos Salary Is More Than 50000 :
			 
			System.out.println("Employee Whoes Salary is > 50000Rs. : ");
			boolean flag = false;
			
			System.out.println("------------------------------");
			for (int i = 0; i < 3 ; i++)
			{
				if(emp.get(i).salary > 50000)
				{
					System.out.println("\nID      : "+emp.get(i).id);
					System.out.println("Name    : "+emp.get(i).name);
					System.out.println("Salary  : "+emp.get(i).salary);
					System.out.println("------------------------------");
					flag = true;			
				}
			}
			if(!flag)
			{
				System.out.println("There Are No Employee Whoes Salary Is > 50000Rs. ");
			}
		}
	}