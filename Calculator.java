package sep22.day6.Assignment;

public class Calculator {
            
	public double add (int a, int b)
	{
	    int sum=a+b;
	    return sum;
	    
	}
	
	public double add (int a, int b, int c)
	{
	    int sum=a+b+c;
	    return sum;
	    
	}
	
	public double mul (int a, int b)
	{
	    int output=a*b;
	    return output;
	    
	}
	
	public double mul (int a, double b)
	{
		int output=a*b;
	    return output;
	    
	}
	
	public double sub (int a, int b)
	{
		int output=a-b;
	    return output;
	    
	}
	
	public double sub (double a, double b)
	{
		int output=(int) (a-b);
	    return output;
	    
	}
	
	public double div (int a, int b)
	{
		int output=a/b;
	    return output;
	    
	}
	
	public double div (double a, int b)
	{
		int output=(int) (a/b);
	    return output;
	    
	}
	
	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		System.out.println(cl.add(2, 4));
		System.out.println(cl.sub(2.3, 3.4));
		System.out.println(cl.mul(3, 5));
		System.out.println(cl.div(2.4, 2));
		

	}

}
