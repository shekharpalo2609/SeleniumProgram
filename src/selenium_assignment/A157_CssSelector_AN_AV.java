//Demonstrate CSS locator program on [AN='AV']

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A157_CssSelector_AN_AV {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search =  driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']"));
		search.sendKeys("mobile");
		
		driver.close();
	}

}
