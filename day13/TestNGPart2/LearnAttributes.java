package sep22.day13.TestNGPart2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAttributes {
	
	@Test(priority='2', dependsOnMethods="windowHandle")
  public void screenShot() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step1: Get the source screen shot as output file
		
		File sourceScreenShot = driver.getScreenshotAs(OutputType.FILE);
		
		

	}
  
  @Test(priority='1')
  public void windowHandle() {
		
		WebDriverManager.chromedriver().setup();
		//this line is removed in window handling
		//Because Selenium Manager will be used
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println(driver.getWindowHandle());
		//getWindowHandle is for first window 
		
		// This above method is used to get the reference of the window and print that reference in the console
		//Everytime we run this code, we get the same reference code
		
		driver.findElement(By.linkText("Click Here")).click();
		
		System.out.println(driver.getWindowHandles());
		//getWindowHandles is for multiple window handles
		// after we run then we will get multiple window references
		
		//to do pop up action on the second window
		
		Set<String> windowHandles = driver.getWindowHandles();
		//ctrl+2+L and coming to Set as it does not allow duplicate values that is why it automatically uses Set interface for unique values
		// with set, you can not get the data
		//set does not maintain the order and how would we know that which is first screen or second
		//for this purpose we need, list
		// to get the list of window reeferences in order the windows are pricesses, we need list
		//it will reference ids in the list
		
		List<String> windowHandle = new ArrayList<String>(windowHandles);
	    //now to get the window, we can use get() method in list
		
		//windowHandles.get(0);// get(0) referes to first window
		//press Ctrl+2+L and get the return type
		
		//String string = windowHandle.get(0);
		
		//we can change the string to any name which we want
		
		String firstWindow = windowHandle.get(0);
	    String secondWindow = windowHandle.get(1);
		
		driver.switchTo().window(secondWindow);
		//firstly, it will switch to new window i.e second window
		
		driver.findElement(By.name("emailid")).sendKeys("preeti@gmail.com");
		
		//Now, if I want to gp back to the first window, then again switchTo method is used
		
		driver.switchTo().window(firstWindow);
		System.out.println(driver.getTitle());
		
		
	}

}
