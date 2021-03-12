import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broswers {

	

		public static void main(String[] args) {
			
					System.setProperty("webdriver.chrome.driver", "E:\\Sadhrika481\\drivers\\chromedriver.exe");
					WebDriver driver =new ChromeDriver(); 
				
			         driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS );
			       driver.manage().window().maximize();	
			       String baseurl="http://demo.guru99.com/test/newtours/register.php";        		
			         driver.get(baseurl);
			         
			         String FirstName ="firstName";
			         driver.findElement(By.name(FirstName)).sendKeys("sadhrika");
			         
			         String LastName="lastName";
			         driver.findElement(By.name(LastName)).sendKeys("kalamar");
			         
			         String Phone="phone";
			         driver.findElement(By.name(Phone)).sendKeys("7672026528");
			         
			         String Email="userName";
			         driver.findElement(By.name(Email)).sendKeys("sadhrikakalamar18.qa@gmail.com");
			         
			         String Address ="address1";
			         driver.findElement(By.name(Address)).sendKeys("Housingboard");
			         
			         String City ="city";
			         driver.findElement(By.name(City)).sendKeys("Anantapur");
			         
			         String StateProvince ="state";
			         driver.findElement(By.name(StateProvince)).sendKeys("AP");
			         
			         String PostalCode ="postalCode";
			         driver.findElement(By.name(PostalCode)).sendKeys("515661");
			         
			         String Country ="country";
			         driver.findElement(By.name(Country)).sendKeys("india");
			         
			         String UserName ="email";
			         driver.findElement(By.name(UserName)).sendKeys("sadhrika");
			         
			         String Password ="password";
			         driver.findElement(By.name(Password)).sendKeys("sadhrika12345");
			         
			         String ConfirmPassword ="confirmPassword";
			         driver.findElement(By.name(ConfirmPassword)).sendKeys("sadhrika12345");
		         
			         String Submit ="submit";
			         driver.findElement(By.name(Submit)).click();
			         driver.findElement(By.xpath("//*[text()=' sign-in ']")).click();
			         
			         String userName ="userName";
			         driver.findElement(By.name(UserName)).sendKeys("sadhrika");
			         
			         String password ="password";
			         driver.findElement(By.name(Password)).sendKeys("sadhrika12345");
			         String submit ="submit";
			         driver.findElement(By.name(Submit)).click();
			         
	}  
	}


