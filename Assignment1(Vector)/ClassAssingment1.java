
// WAP to Perform CURD(Create, Read, Update, Delete) Operation ?

import java.util.*;


class Employee 
{ 
   private int id;
   private String name;
   private int sal;
   
   public Employee()
   {
   }
   public Employee(String name,int id,int sal)
   {  
	  this.name=name;
      this.id=id;
	  this.sal=sal;
   }
   public void setId(int id)
   {  this.id=id;
   }
   public int getId()
   { return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }
   public void setSal(int sal)
   { this.sal=sal;
   }
   public int getSal()
   {
		return sal;
   }
   /*
    @Override
    public String toString() {
        return id + "\t" + name + "\t" + sal;
    }
	*/
}

public class ClassAssingment1  
{ 
  public static void main(String x[])
	{ 
		Scanner sc = new Scanner(System.in);
	
		Vector<Employee> v = new Vector<>();
		
		
		while(true)
		{
			System.out.println("\n   --------- Menu ---------");
			System.out.print("1: Add\n2:Update\n3:Delete\n4:Display\nEnter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice){
				
				case 1: 
				
					System.out.println("Enter name id and salary");
					sc.nextLine();
					String name=sc.next();
					int id=sc.nextInt();
					int sal=sc.nextInt();
					
					Employee emp=new Employee(name,id,sal);
					v.add(emp);
					
				break;
				case 2:
					System.out.print("enter the id : ");
					int checkId = sc.nextInt();
					
					for (int i = 0; i < v.size(); i++) {
					Employee e = (Employee) v.get(i);  // assuming you store Employee objects
						if (e.getId() == checkId) {
							System.out.println("Enter name id and salary:");
							name = sc.next();
							id = sc.nextInt();
							sal = sc.nextInt();
						
							e.setName(name);
							e.setId(id);
							e.setSal(sal);
						}
					}
					
				break;
				case 3:
					System.out.print("enter the id : ");
					checkId = sc.nextInt();
					for (int i = 0; i < v.size(); i++) {
					   // assuming you store Employee objects
						if (v.get(i).getId() == checkId) {
							
						v.remove(i);
						}
					}
				break;
				case 4:
				System.out.println("\n--ID -- Name --- Salary ----");
				Iterator i = v.iterator();
				while(i.hasNext())
				{   Object obj = i.next();
					Employee e=(Employee)obj;
					System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
					System.out.println("------------------------------------");
				}
				break;
				/*
				case 4: // Display
                    System.out.println("\n--ID -- Name --- Salary ----");
                    for (Employee e : v) {
                        System.out.println(e); // calls toString() automaticaly
                    }
                    System.out.println("------------------------------------");
                    break;
				*/
			}
			
		}	
	}
}
