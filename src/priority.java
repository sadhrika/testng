import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priority {
	
WebDriver driver =new ChromeDriver();
@Test (priority = 1)
public void closebroswer() {
	driver.close();
	System.out.println("close the chrome broswer");
	
}
@Test (priority = 0)
public void openbroswer() {
	driver.get("http://www.myntra.com");
	System.out.println("launching url the chrome broswer");
}


}
