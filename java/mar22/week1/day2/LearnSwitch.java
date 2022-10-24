package mar22.week1.day2practice;

public class LearnSwitch {

	public static void main(String[] args) {
		
		int day = 4;
		
		
		//we use switch statements to avoid multiple if else conditions
        // we are writing program to print weekdays and weekends
		// in if else, it goes to the loop even if the condition is met
		// in switch statement, it will break the loop if the condition is met
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			
			break;
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
			default:
				System.out.println("Invalid");
		}
	}

}
