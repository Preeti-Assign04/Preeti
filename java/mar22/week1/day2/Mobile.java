package mar22.week1.day2;

public class Mobile {
	
	public String mobileModel = "iphone";
	public int mobileWeight = 10;
	public boolean isFullCharge = true;
	public double mobileCost = 32000.45;

	public static void main(String[] args) {
		
		Mobile MB = new Mobile();
		
		System.out.println("Mobile Model is: " +MB.mobileModel);
		
       //System.out.println(MB.mobileModel);
		//Both above statements are write but the only difference is in the way of printing
		
		System.out.println("Mobile Weight is: " +MB.mobileWeight);
		System.out.println("Is Mobile charged?: " +MB.isFullCharge);
		System.out.println("Mobile Cost is: " +MB.mobileCost);
	}

}
