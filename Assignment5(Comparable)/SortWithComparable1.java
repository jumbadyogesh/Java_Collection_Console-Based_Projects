

/*
Q1. Store and Sort Student Marks
Create a Student class with fields: name and marks.
Store multiple students in an ArrayList.
Sort them by marks using Comparable.
Print the sorted list.

👉 Explanation:
 This tests your ability to:
Implement Comparable<Student> for sorting.
Use Collections.sort(list) on an ArrayList of objects.
*/

	import java.util.*;
	import java.lang.Comparable;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	public Employee() {
		
	}
	public Employee(String name,int id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	private int sal;
	
	// compareTo method to sort by ID
    @Override
    public int compareTo(Employee other) {
        return this.id - other.id; // Sort by id (ascending)
    }
}
public class SortWithComparable1 {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("Ram",1,10000));
		list.add(new Employee("Shyam",3,5000));
		list.add(new Employee("Ganesh",2,90000));
		list.add(new Employee("Rajesh",5,8000));
		list.add(new Employee("Mangesh",4,9000));
		
		System.out.println("Display employee data before sorting");
		for(Object obj:list) {
			Employee emp=(Employee)obj;
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
		}
		
		Collections.sort(list);
		
		System.out.println("Display employee data After sorting");
		for(Object obj:list) {
			Employee emp=(Employee)obj;
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
		}
	}
}
