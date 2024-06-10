//Demonstrate CSS locator using Tag name and class name value program on google.in and search India use: TagName.ClassNameValue

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A156_CssSelector_TagName_ClassNameValue {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement searchBox = driver.findElement(By.cssSelector("textarea.gLFyf"));
	searchBox.sendKeys("India");
	
	Thread.sleep(2000);
	driver.close();
	}
}
