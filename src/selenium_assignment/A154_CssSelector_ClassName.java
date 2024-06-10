//Launch flipkart.com and search for shoe with help of CSS selector using className value: .ClassNameValue

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A154_CssSelector_ClassName {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searhBox = driver.findElement(By.cssSelector(".Pke_EE"));
		searhBox.sendKeys("shoe");

		driver.close();
		
	}

}
