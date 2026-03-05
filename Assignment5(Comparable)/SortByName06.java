
/* 
Q6. Sort Employees by Name
Create an Employee class with fields: id, name, and department.
Store employees in an ArrayList.
Sort them alphabetically by name.

👉 Explanation:
 Useful for practicing string sorting using compareTo().
*/

	
import java.util.*;
import java.lang.Comparable;

class Employee implements Comparable<Employee>
{
   private int id;
   private String name;
   private String department;
   
   public Employee()
   {
	   
   }
   public Employee(int id,String name,String department)
	{
		this.id=id;
		this.name=name;
		this.department=department;
	}
	public int getId()
	{ return id;
	}
	
	public String getName()
	{ return name;
	}
	
	public String getDepartment()
	{ return department;
	}
	
	@Override
	public int compareTo(Employee other) {
        return this.name.compareToIgnoreCase(other.name); // ✅ alphabetical order
    }
}

public class SortByName06 
{
	public static void main(String[] args) 
	{
	   ArrayList<Employee> list=new ArrayList<>();
	   
	   Scanner sc = new Scanner(System.in);
	   for (int i = 0; i < 3; i++) 
	   {
            System.out.print("Enter id , name and Department of Employee: ");
			int id= sc.nextInt();
            String name = sc.next();
            String department= sc.next();
            list.add(new Employee(id, name, department));
	   }
	   
	   System.out.println("\nEmployee Data before sorting");
	   for(Object obj:list) 
	   {
		    Employee emp=(Employee)obj;
		    System.out.println( emp.getId()+"\t"+ emp.getName()+"\t"+emp.getDepartment());
	   }
	   
	   //Sort Employee by their Name
	   Collections.sort(list);		// Calls CompareTo() method internaly till it does not gwt Sorted
	   
	   System.out.println("\nEmployee Data After sorting");
	   
	   for(Object obj:list) 
	   {	
		    Employee emp=(Employee)obj;
		    System.out.println(emp.getId()+"\t"+ emp.getName()+"\t"+ emp.getDepartment());
	   }
	   
	}
}


