//Launch flipcart.com and search for shoe with help of CSS selector: TN.CN[AN='AV']

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A159_CssSelector_TN_CN_AN_AV {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.cssSelector("input.Pke_EE[name='q']"));
		search.sendKeys("electonics");
		
		Thread.sleep(2000);
		driver.close();
	}

}
