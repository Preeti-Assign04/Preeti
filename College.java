package sep22.day6.Assignment;

public class College extends University

{
	@Override
	public void ug() 
	{
		System.out.println("This is a UG method");
		
	}

	public static void main(String[] args) {
		
		College clg = new College();
		clg.ug();
		clg.pg();
	}

	

}
