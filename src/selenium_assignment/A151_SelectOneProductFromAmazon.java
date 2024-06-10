//Login to Amazon. After searching shoe, select the first shoe

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A151_SelectOneProductFromAmazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);

		WebElement firstShoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstShoe.click();
		driver.quit();

	}

}