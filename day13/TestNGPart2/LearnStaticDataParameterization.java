package sep22.day13.TestNGPart2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnStaticDataParameterization extends BaseClassStaticParameterization {
	
	
  @Test
  public void staticDataParameterization() {
	 /* WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("(//button[text()=' Login '])")).click();
		
		*/
	  
		//Till above cose, we can make a common base class which can be used by every class 
		//No need to write the code again and again
		
		
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])")).click();
		//the above code is to select the "My Info" from the menu list
		
				
		driver.findElement(By.name("firstName")).clear();
		//the above code is to clear the default value added to the name field and add the new field
		
		driver.findElement(By.name("firstName")).sendKeys("Preeti");
		
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys("Khanna");
		
		driver.findElement(By.xpath("(//button[class='oxd-icon-button oxd-main-menu-button'])")).click();
		//above code is to save
		
		driver.findElement(By.xpath("(//i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon'])")).click();
		//To select the dropdown list for logout
		
		driver.findElement(By.linkText("Logout")).click();
		
		//driver.close();
		
		
		
		
		
		driver.findElement(By.name("lastName")).click();
		
  }
}
