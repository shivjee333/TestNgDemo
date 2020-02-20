import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class MagentoTestNgDemo {

	@Test
	public void privatecredential1()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("ihassan395@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome@123");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
		
	}
	@Test
	public void privatecredential2()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("ihassan395@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome@123");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
		
	}


}
