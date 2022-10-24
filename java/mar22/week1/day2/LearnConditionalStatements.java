package mar22.week1.day2practice;

public class LearnConditionalStatements {
	
	public void greaterThan(int a, int b)
	
	{
		if (a<b)
			System.out.println(a +"is lesser than"+ b);
		
		else if (a>b)
			System.out.println(a +"is greater than"+ b);
		
		else
			System.out.println(a     +"is equal to"   + b);
			
			
		
	}

	public static void main(String[] args) {
		
		LearnConditionalStatements lcs = new LearnConditionalStatements();
		    lcs.greaterThan(20, 20);
		    lcs.greaterThan(12, 21);
	}

}
