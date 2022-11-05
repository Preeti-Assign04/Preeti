package sep22.day6.Assignment;

public class Desktop  implements Hardware, Software{
	
	public void desktopModel()
	{
		System.out.println("This is a desktop model");
	}
	
	public void hardwareResources()
	{
		System.out.println("This is hardware");
	}
	
	public void softwareResources()
	{
		System.out.println("This is software");
	}
	
	

	public static void main(String[] args) {
		
		Desktop dk = new Desktop();
		 dk.desktopModel();
		 dk.softwareResources();
		 dk.hardwareResources();
		

	}


}
