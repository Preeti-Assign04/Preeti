package sep22.day13.TestNGPart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnStatic_Para {
 
  @Test
public void preCondition() {
	  
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("(//button[text()=' Login '])")).click();
		
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")).click();
		
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys("Preeti");
		
		
		
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys("iiiiii");
		
		driver.findElement(By.xpath("(//button[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])")).click();
		
		
		driver.findElement(By.xpath("(//i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon'])")).click();
		
		
		driver.findElement(By.linkText("Logout")).click();
		
	
		driver.close();
		
		
  }
  
  @DataProvider
  
  public String[][] fetchData()
  // we are not using void data type because it does not return the value
  //we are using string data type to return the valueh
  
  {
	  String[][] data= new String[6][2];
	  //that means in an excel where the data is stored, contains 6 rows and 2 columns
	  
	  data[0][0]="Preeti";
	  data[0][1]="Khanna";
	  data[1][0]="ABC";
	  data[1][1]="CDE";
	  data[2][0]="Ricky";
	  data[2][1]="K";
	  data[3][0]="Gunav";
	  data[3][1]="K";
	  data[4][0]="P";
	  data[4][1]="K";
	  data[5][0]="A";
	  data[5][1]="C";
	  
	  return data;
	  //to return the data
	  
  }
}
