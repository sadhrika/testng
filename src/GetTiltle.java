import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTiltle {
	 WebDriver driver;	
		
	  @Test
	  public void Test() {
	  
		String Tit=driver.getTitle();
	  	System.out.println(Tit); 	  
	  	driver.findElement(By.id("text-input-what")).sendKeys("London");
	  	driver.findElement(By.id("text-input-where")).sendKeys("Amersham Station");
	  	driver.findElement(By.xpath(".//button[@type='submit']")).click();
		String Tit1= driver.getTitle();
		System.out.println(Tit1);
		System.out.println(Tit1);
		
		
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();  
		driver.get("https://www.indeed.co.uk/");
		driver.manage().window().maximize();
	  
	  }
	  @AfterTest
	  public void afterTest() {
		
		  driver.close(); 
}
}
