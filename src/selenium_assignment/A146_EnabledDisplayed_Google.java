/* Demonstrate a program three methods of WebElement Interface Use google.co.in page and type india in search using isDisplayed() 
and isEnabled().
 */

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A146_EnabledDisplayed_Google {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("q"));
		if(search.isDisplayed() && search.isEnabled()) {
			search.sendKeys("India");
		}
		
		
		
		
	}

}
