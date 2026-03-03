

/*
Q1. Employee Management (Add & Display Employees)
 👉 Create a Employee POJO class with fields: id, name, salary.
 👉 In the main class, use an ArrayList<Employee> to:
 👉 Add at least 5 employees.
 👉 Display all employees.

Explanation:
 Tests how to create a POJO, store objects in ArrayList, and iterate over them using loops.
 */
 
		import java.util.*;
	

	class Employee 
	{
		private int id;
		private String name;
		private int salary;
		
		Employee(int id, String name, int salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
		}
		public int getSalary()
		{
			return salary;
		}
		
		@Override
		public String toString() {
			return " id = " + id + ",\t name = " + name + ",\t salary = " + salary ;
		}
	}
	
	public class EmployeeManagementSystem1 
	{	
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Employee> list = new ArrayList<>();
			
			System.out.print("Enter No Of Employee : " );
			int no = sc.nextInt();
			
			for(int i=0; i<no; i++)
			{
				System.out.print("Enter Employee Id, name And Salary : ");
				int id= sc.nextInt();
				String name= sc.next();
				int salary= sc.nextInt();
				
				list.add(new Employee(id,name,salary));
			}
			
			 System.out.println("\nAll Employees:");
			if (list.isEmpty()) {
				System.out.println("\nNo employees to show.");
			} else {
				System.out.println("\n-------------------------------");
				for (Employee e : list) {
					System.out.println(e);
				}
				System.out.println("\n-------------------------------");
			
			}			
		}
	}