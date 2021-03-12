package Freecrm.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Sadhrika481\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
	
         driver.get("https://classic.crmpro.com/login.cfm");
 		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		driver.findElement(By.name("username")).sendKeys("batchautomation");
 		driver.findElement(By.name("password")).sendKeys("Test@12345");
 		driver.findElement(By.xpath("//input[@type='submit']")).click();
 		Thread.sleep(3000);
         
         driver.switchTo().frame("mainpanel");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
 		Thread.sleep(3000);
 		WebElement selectele = driver.findElement(By.name("cs_status"));
 		Select sc = new Select(selectele);
 		sc.selectByVisibleText("Active");
 		WebElement selectelet = driver.findElement(By.name("cs_category"));
 		Select sc1 = new Select(selectelet);
 		sc1.selectByVisibleText("Friend");
 		driver.findElement(By.xpath("//input[@name='cs_name']")).sendKeys("sadhrika");
 		driver.findElement(By.xpath("//input[@name='cs_company_name']")).sendKeys("Wipro");
 		driver.findElement(By.xpath("//input[@name='cs_email']")).sendKeys("sadhrikakalamar18.qa@gmail.com");
 		driver.findElement(By.xpath("//input[@name='cs_extended']")).sendKeys("Healthcare");
		
 		driver.findElement(By.xpath("//input[@name='cs_notes']")).sendKeys("aaaaa");
 		driver.findElement(By.xpath("//input[@name='cs_industry']")).sendKeys("service");
 		
// 	     driver.switchTo().frame("datalistrow");
// 		WebElement selecteleo = driver.findElement(By.name("by_user"));
// 		Select sc2 = new Select(selecteleo);
// 		sc1.selectByVisibleText("Demo User");
 		driver.findElement(By.xpath("//input[@name='tag']")).sendKeys("service");
 		 
   
 		driver.findElement(By.xpath("//input[@name='cs_address']")).sendKeys("Housing Board");
 		
 		
// 		WebElement selectelea =
 				driver.findElement(By.name("cs_address_type")).sendKeys("Billing");
// 		Select sc3 = new Select(selectelea);
// 		sc1.selectByVisibleText("Billing");
 		
// 		WebElement selectelev = 
 				driver.findElement(By.name("view_id")).sendKeys("Default view");
// 		Select sc4 = new Select(selectelev);
// 		sc1.selectByVisibleText("Default view");
 		WebElement selectelei = driver.findElement(By.name("cs_saved_search_id"));
 		Select sc5 = new Select(selectelei);
 		sc1.selectByVisibleText("india ");
 		
	}

}
