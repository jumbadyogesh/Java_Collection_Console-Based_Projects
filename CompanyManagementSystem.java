 

/*Task :- You are required to design a Company Management Application in Java using classes, ArrayList, and Generics. The system should handle Company, Department, and Employee entities. Implement the following specifications:
Classes:
Company
Fields: companyId, companyName, location, List<Department> departments
Department
Fields: deptId, deptName, List<Employee> employees
Employee
Fields: empId, empName, designation, salary
Tasks / Operations to Implement (10):

1. Add a new Department to a Company.
2. Add a new Employee to a specific Department.
3. Display all Departments of a Company.
4. Display all Employees of a Department.
5. Search for an Employee by ID across all Departments.
6. Update an Employee’s salary by ID.
7. Delete an Employee from a Department.
8. Display all Employees earning above a given salary.
9. Sort all Employees in a Department by salary using generics.
10 Display the Department with the highest number of Employees.

Additional Constraints:
Use ArrayList to manage Departments and Employees.
Use Generics for sorting, searching, and other list-based operations.
Implement all functionalities inside a menu-driven main class.

*/

import java.util.*;

	// Fields: empId, empName, designation, salary
class Employee {
    private int empId;
    private String empName;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(int empId, String empName, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Fields: deptId, deptName, List<Employee> employees
class Department {
    private int deptId;
    private String deptName;
    private List<Employee> employees;

    public Department() {
    }

    public Department(int deptId, String deptName, List<Employee> employees) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employees = employees;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}

// Fields: companyId, companyName, location, List<Department> departments
class Company {
    private int companyId;
    private String companyName;
    private String location;
    private List<Department> departments;
	
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

}
// Driver Class 

public class CompanyManagementSystem
{
	static Scanner sc = new Scanner(System.in);
	static Company c = new Company();
	
	public static void main(String x[])
	{
		System.out.print("\nEnter Company id   : ");
		int id = sc.nextInt();
		c.setCompanyId(id);
		
		System.out.print("Enter Company name : ");
		String name = sc.next();
		c.setCompanyName(name);
		
		System.out.print("\nEnter Company Location : ");
		String loc = sc.next();
		c.setLocation(loc);
		
		System.out.print("\nEnter Company Department: ");
		List<Department> depts = new ArrayList<>();
		c.setDepartments(depts);
		
		
		
		System.out.println("\n Comany StartUp Successfully !");
		
		while(true)
		{
			System.out.println("\n case 1: Add a new Department to a Company.");
			System.out.println(" case 2: Display All Department Data. ");
			System.out.println(" case 3: Add a new Employee to a specific Department.");
			System.out.println(" case 4: Display all Departments of a Company.");
			System.out.println(" case 5: Display all Employees of a Department.");
			System.out.println(" case 6: Search for an Employee by ID across all Departments.");
			System.out.println(" case 7: Update an Employee’s salary by ID.");
			
			
			System.out.print("\nEnter Your Choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					depts.add(addNewDepartment());
				break;	
				
				case 2:
					displayAllCompanyDetails();
				break;
				
				case 3:
					System.out.println("Department List: ");
                    for (int i = 0; i < depts.size(); i++) {
                        System.out.println(i + " : " + depts.get(i).getDeptName());
                    }

                    System.out.print("Enter the choice from above listed departments in which you want to add new employee: ");
                    int idx = sc.nextInt();
                    Department selected = depts.get(idx);

                    Employee fresher = addNewEmployee();
                    selected.getEmployees().add(fresher);
				break;
			}
		}
	}
	public static Department addNewDepartment() 
	{
        // taking input of Fields: deptId, deptName, List<Employee> employees
        System.out.print("Enter deptId: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter deptName");
        String name = sc.nextLine();

        List<Employee> emps = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            Employee emp = addNewEmployee();
            emps.add(emp);
        }

        return new Department(id, name, emps);
    }
	
    public static Employee addNewEmployee() // taking of Fields: empId, empName, designation, salary
	{
        System.out.print("Enter employee id");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee name");
        String name = sc.nextLine();

        System.out.print("Enter Employee designation");
        String designation = sc.nextLine();

        System.out.print("Enter employee salary");
        double salary = sc.nextDouble();

        return new Employee(id, name, designation, salary);
    }
	public static void displayAllCompanyDetails() 
	{
        System.out.println("Company name: " + c.getCompanyName());
        System.out.println("Company location: " + c.getLocation());

        for (Department dept : c.getDepartments()) 
		{
            System.out.println("-------------------------");
            System.out.print("Department Name: " + dept.getDeptName());
			
            System.out.println("All employees: ");
			
            for (Employee emp : dept.getEmployees()) 
			{
                System.out.println(emp.getEmpId() + ",\t" + emp.getEmpName() + ",\t" + emp.getDesignation() + ",\t"
                        + emp.getSalary());
            }
        }
    }
	
}