package jul22.week1.day1.assignments;

public class Calculator {

	//void methods do not return a value
	 public double add(int a, int b) 
	 {
		 
	       int output = a+b;
	       return output;
	 }
	 
	 public double sub(double a, double b) 
	 {
		 
	       double output = a-b;
	       return output;
	 }
	 
	 public double mul(double a, double b) 
	 {
		 
	       double output = a*b;
	       return output;
	 }
	 
	 public double div(double a, double b) 
	 {
		 
	       double output = a/b;
	       return output;
	 }
	public static void main(String[] args) {
        
		Calculator db = new Calculator();
		
		System.out.println("The sum of two numbers is:" +db.add(2, 4));
		System.out.println("The sub of two numbers is:" +db.sub(2.2, 1.4));
		System.out.println("The multiplication of two numbers is:" +db.mul(2.33, 4.456));
		System.out.println("The division of two numbers is:" +db.div(2.04, 1.04));

	
	}

}
