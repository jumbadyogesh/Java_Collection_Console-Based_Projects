
/*
Q2. Sort Employees by Salary
Create an Employee class with fields: id, name, salary.
Insert employees into an ArrayList.
Sort by salary (ascending order).
Display top 3 highest paid employees.

👉 Explanation:
 Checks usage of ArrayList with objects, implementing compareTo() based on salary, 
 and list traversal after sorting.
 */
 
 
import java.util.*;
import java.lang.Comparable;

class Employee implements Comparable<Employee>
{
   private int id;
   private String name;
   private int salary;
   
   public Employee()
   {
	   
   }
   public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
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
	public  void setSalary(int salary)
	{ this.salary=salary;
	}
	public int getSalary()
	{ return salary;
	}
	@Override
	public int compareTo(Employee next) 		// on the plasse of next we cant take whatever(other)	
	{										  // next is variable take for accessing other object
		return this.salary - next.salary; 	// Sort by salary (ascending)
	}
}

public class SortBySalary02 
{
	public static void main(String[] args) 
	{
	   ArrayList<Employee> list=new ArrayList<>();
	   
	   Scanner sc = new Scanner(System.in);
	   for (int i = 0; i < 5; i++) {
            System.out.print("Enter Id, Name and Salary of Employee: ");
            int id = sc.nextInt();
            String name = sc.next();
            int salary = sc.nextInt();
            list.add(new Employee(id, name, salary));
	   }
	   
	   System.out.println("Employee Data before sorting");
	   for(Object obj:list) 
	   {
		    Employee e=(Employee)obj;
		    System.out.println(e.getId()+ "\t"+ e.getName()+"\t"+e.getSalary());
	   }
	   
	   //Sort employees by salary
	   Collections.sort(list);
	   
	   System.out.println("\nEmployee Data After sorting");
	   
	   for(Object obj:list) 
	   {
			Employee e=(Employee)obj;
		    System.out.println(e.getId()+ "\t"+ e.getName()+"\t"+e.getSalary());
	   }
	   System.out.println("\nTop 3 Highest Salary Employee : ");
	    for (int i = list.size()-1; i > 1; i--) 
		{
			 Employee e = list.get(i);
			 System.out.println(e.getId()+ "\t"+ e.getName()+"\t"+e.getSalary());
		}
	  
	}
}

