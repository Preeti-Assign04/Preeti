package sep22.day6.Assignment;
//Overriding concept
public class SmartPhone extends AndroidPhone{
	
	public void takeVideo()
	{
		System.out.println("Take the video by smart phone");
	}

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		sp.takeVideo();
		
		AndroidPhone ap = new AndroidPhone();
		ap.takeVideo();
		

	}

}
