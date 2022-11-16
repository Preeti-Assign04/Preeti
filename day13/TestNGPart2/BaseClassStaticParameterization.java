package sep22.day13.TestNGPart2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public static void BaseClassStaticParameterization
{
  //@Test
  //Base class can not have @Test
  //It has only @BeforeMethod that has preconditions
  
  
  public static ChromeDriver driver;
  
  @BeforeMethod
 
  @Parameters({"url","username","password"})
  
  public void preCondition(String url, String uname, String pword) {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//To understand the concept of parameterization
		
		driver.findElement(By.name("username")).sendKeys(uname);
		
		driver.findElement(By.name("password")).sendKeys(pword);
		
		//these above codes are script which does not have data
		//our data of username and password is in xml file
		//we are keeping data and script separate
		
		
		driver.findElement(By.xpath("(//button[text()=' Login '])")).click();
		
  }
  
  @AfterMethod
  public void postCondition()
  {
	  driver.close();
  }
}
