package jul16th;

public class StudentName {

	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student.schoolName="Livetech";
				
		s1.studentName="Ram";
		s1.rollNo=123;
		s1.grade="Fifth";

		System.out.println("Student Name : "+ s1.studentName);
		System.out.println("Student Rollno : "+ s1.rollNo);
		System.out.println("Student Grade : "+ s1.grade);
		System.out.println("Student School : "+ Student.schoolName);
		
		Student s2=new Student();
		s2.studentName="Vedha";
		s2.rollNo=456;
		s2.grade="Second";
		
		System.out.println("Student Name : "+ s2.studentName);
		System.out.println("Student Rollno : "+ s2.rollNo);
		System.out.println("Student Grade : "+ s2.grade);
		System.out.println("Student School : "+ Student.schoolName);
		
		
	

	}

}
