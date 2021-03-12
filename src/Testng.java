import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {
	WebDriver driver;
	@Test
	public void Login_Page() {
		
	WebDriverManager.chromedriver().setup();

	
	driver= new ChromeDriver();
	driver.get("http://www.myntra.com");
   			
	
	
	
	
	}
}
