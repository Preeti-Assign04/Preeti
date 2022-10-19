package mar22.week1.day1;

//Syntax for class is: accessspecifier class ClassName

public class Car {
	
	//normal method should be written outside the main method
	
	//accessSpecifier returnType methodName()
	
	//anything written in purple is java keyword
	
	public void applyBrake()
	
	{
	 System.out.println("To apply brake");
	}
	
	public void applyHonk()
	
	{
		System.out.println("To apply Honk");
	}

	//main method
	public static void main(String[] args) {
		System.out.println("This is my first class");
		
		//Object should be created under a main method
		
		// Syntax: ClassName ObjectName = new ClassName();
		
		Car BMW = new Car();
		Car Honda = new Car();
		
		//ObjectName.methodName();
		
		BMW.applyBrake();
		
		Honda.applyHonk();
	}

}
