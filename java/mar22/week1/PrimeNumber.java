package jul22.week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
                     
		int input = 13;
		boolean flag = false;
		
		for(int i=2; i<=input/2; i++)
		{
			if (input%2==0)
			{
				 flag = true;
			     break;
			}
		}
		
		if (flag==false)
		{
			System.out.println("The number is a Prime number");

		}
		
		else
		{
		
		System.out.println("The number is not a Prime number");
		}
		
	}

}
