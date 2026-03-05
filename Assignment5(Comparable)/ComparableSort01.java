
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

class Student implements Comparable<Student>
{
   private String name;
   private int marks;
   
   public Student()
   {
	   
   }
   public Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
   public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }
   public  void setMarks(int marks)
   { this.marks=marks;
   }
   public int getMarks()
   { return marks;
   }
   @Override
    public int compareTo(Student next) 		// on the plasse of next we cant take whatever(other)	
	{										  // next is variable take for accessing other object
        return this.marks - next.marks; // Sort by Marks (ascending)
    }
}

public class ComparableSort01 
{
	public static void main(String[] args) 
	{
	   ArrayList list=new ArrayList();
	   
	   list.add(new Student("Yogesh",100));
	   list.add(new Student("Ramesh",148));
	   list.add(new Student("Aakash",205));
	   list.add(new Student("Aniket",29));
	   list.add(new Student("Gaurav",99));
	   
	   System.out.println("Student Data before sorting");
	   for(Object obj:list) 
	   {
		    Student s=(Student)obj;
		    System.out.println(s.getName()+"\t"+s.getMarks());
	   }
	   Collections.sort(list);
	   
	   System.out.println("\nStudent Data After sorting");
	   
	   for(Object obj:list) 
	   {
		    Student s=(Student)obj;
		    System.out.println(s.getName()+"\t"+s.getMarks());
	   }
	  
	}
}

