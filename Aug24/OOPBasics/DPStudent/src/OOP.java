import java.util.ArrayList;

public class OOP {

	ArrayList<Student> students = new ArrayList<Student>();
	
	public OOP()
	{
		System.out.println("Hello from my oop app");
		students.add(new Student("Bob",18,70.5));
		students.add(new Student("Mary",23,86.7));
		students.add(new Student("John",19,55.2));
		students.add(new FrenchStudent("Jaques",22,67.5));
		
        students.add(new ComputerStudent("Alice", 20, 92.0));
        students.add(new ComputerStudent("Eve", 21, 88.5));
			
		int sum =0;
		for(Student s : students)
		{
			sum = sum + s.getAge();
		}
		int mean = sum/students.size();
		
		System.out.print("the mean age is "+mean);

		double maxMark=0, minMark=100, averageMark;
		double sumMarks=0;
		for(Student s : students)
		{
			double mark=s.getMark();
			if(mark>maxMark)
				maxMark=mark;
			if(mark<minMark)
				minMark=mark;
			sumMarks+= mark;
		}
		double meanMark = sumMarks/(double)students.size();
		System.out.print("\t Mean Mark= "+meanMark + "\t MaxMark= "+maxMark+"\t MinMark= "+minMark+"\n");
		
		//add a for loop to the Oop class to call all the students’ speak() methods.
		for(Student s : students)
			s.speak();
	}
	
	public static void main(String[] args) {
		new OOP();
	}
}
