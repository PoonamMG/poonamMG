package helper_Attribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningInvocationCount {
@Test(invocationCount=3,priority=0)
public void lanch() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(2000);
	driver.close();
}
@Test(invocationCount=2,priority=1)
public void demo() {
	Reporter.log("testng", true);
}

@Test(invocationCount=2,priority=-1)
public void test() {
	Reporter.log("Demo",true);
}
}
