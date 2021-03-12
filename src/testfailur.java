import org.testng.Assert;
import org.testng.annotations.Test;

public class testfailur extends Baseclass {
	
		
		@Test
		public void doLogin() {
			
			Assert.fail("Failing the login test");
			System.out.println("Capture Screenshot");
		}

}
