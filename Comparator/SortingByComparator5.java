

/* 
Q5. Course Sorting by Duration
 👉 Create a Course POJO class with fields: courseId, courseName, duration.
 👉 Store at least 5 courses in an ArrayList<Course>.
 👉 Sort the courses by duration in ascending order and display them.
Explanation:
 Tests sorting objects stored in ArrayList using Comparator/Collections.sort().
 */
 
 	
	import java.util.*;
	
	class Course 
	{
		int id;
		String name;
		int duration;
		
		Course(int id, String name, int duration)
		{
			this.id=id;
			this.name=name;
			this.duration=duration;
		}
		public String toString() {
			return id + "\t" + name + "\t" + duration;
		}
		
	}
	
	class SortByDuration implements Comparator<Course> 
	{
		public int compare(Course c1, Course c2) 
		{
			return Integer.compare(c1.duration, c2.duration);  	// use compare when u are comparing integers and give Integer.
		}
	} 
	
	public class SortingByComparator5
	{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			ArrayList<Course> list = new ArrayList<>();
			
			System.out.print("\nEnter No OF Courses : ");
			int no = sc.nextInt();
			
			for(int i=0; i<no; i++)
			{
				System.out.print("\nEnter Course ID       : ");
				int id= sc.nextInt();
				System.out.print("Enter Course Name     : ");
				String name= sc.next();
				System.out.print("Enter Course duration : ");
				int duration= sc.nextInt();
				
				list.add(new Course(id,name,duration));
				
			}
		
			Collections.sort(list, new SortByDuration());		// Calling Comparision by duration ()
			
			System.out.println("\nSorting By Duration : ");
			System.out.println("ID  ||  Namae || duration  ");
			System.out.println("-------------------------------- ");
			
			for(Course c : list)
			{
				System.out.println( c );
			}
			System.out.println("-------------------------------- ");
			
		}
	}