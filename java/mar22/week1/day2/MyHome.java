package mar22.week1.day2;

import mar22.week1.day2.PublicPark;

public class MyHome {

	private String bed = "queen";
	
	public void bedroom()
	
	{
	 System.out.println("bed");
	 System.out.println("swing");
	 System.out.println("palyground");
	}
	
	public static void main(String[] args) {
		
		PublicPark Park = new PublicPark();
		
		MyHome Home = new MyHome();
		
	  Home.bedroom();
		
	
		
		

	}

}
