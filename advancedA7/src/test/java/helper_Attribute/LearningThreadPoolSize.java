package helper_Attribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LearningThreadPoolSize {
	@Test(invocationCount=3,threadPoolSize=3)
	public void launch() throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(2000);
	driver.close();
}
}
