package jul22.week1.day1.assignments;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
        int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		
		System.out.println("The first number is:" +firstNum);
		
		for (int i=1; i<=8; i++)
			
		{
			sum=firstNum+secNum;
			
			System.out.println("The number is:" +sum);
			
			firstNum=secNum;
			secNum=sum;
		}
		
	}

}


