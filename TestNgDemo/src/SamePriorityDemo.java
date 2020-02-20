import org.testng.annotations.Test;

public class SamePriorityDemo {
	@Test(priority=3)
	public void test_a()
	{
		System.out.println("a is executed..");
	}
	@Test(priority=2)
	public void test_b()
	{
		System.out.println("b is executed..");
	}
	@Test(priority =2)
	public void test_c()
	{
		System.out.println("c is executed..");
	}
	@Test(priority=0)
	public void test_d()
	{
		System.out.println("d is executed..");
	}

}
