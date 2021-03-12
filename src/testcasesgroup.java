import org.testng.annotations.Test;

public class testcasesgroup {
	@Test (groups ="Sales")
	  public void Test1() {
		  System.out.println("Sales Team");}
		  
	@Test (groups ="Sales")
	  public void Test2() {
		  System.out.println("Sales Team");
		
	  
	  }
	@Test (groups="Auditors")
	  public void Test3() {
		  System.out.println("Auditors Team");
	}


	@Test (groups="Marketing")
	  public void Test4() {
		  System.out.println("Markteing Team");
}
	}
	
