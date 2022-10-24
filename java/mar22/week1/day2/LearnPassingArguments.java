package mar22.week1.day2practice;

public class LearnPassingArguments {
	
	public void sum(int a, int b)
	{
		int add = a + b;
		System.out.println(add);
	}
   
	public void student(String name, int roll_no, char sex)
	{
		
		System.out.println("Student name is: "+name    + "Roll No is: "+roll_no    + "Student sex is:" +sex);
	}
	public static void main(String[] args) {
		 LearnPassingArguments lpa = new LearnPassingArguments();
		 
		 lpa.sum(11, 22);
		 lpa.sum(20, 20);
		 
		 lpa.student("Gunav", 1234, 'M');

	}

}
