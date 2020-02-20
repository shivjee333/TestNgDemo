import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	@Test
	public void positivecredential2()
	{
		System.out.println("positive credential 2 is running");
		
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method is running");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method is running");
	}
	@Test
	public void positivecrential1()
	{
		System.out.println("Positive credential 1 is rinning");
	}
	

}
