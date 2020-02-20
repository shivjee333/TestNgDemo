import org.testng.annotations.Test;

public class WithoutPriorityDemo {
	@Test
	public void a_method()
	{
		System.out.println(" a method is executing..");
	}
	@Test(priority=2)
	public void b_method()
	{
		System.out.println("b method is executing..");
	}
	@Test(priority=1)
	public void c_method()
	{
		System.out.println("c method is executed..");
	}
	@Test(priority=0)
	public void d_method()
	{
		System.out.println("d method is executed..");
	}

}
