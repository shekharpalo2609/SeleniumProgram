//Launch amazon.in select option as amazon fresh using keys functionality

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A144_DropdownHandleUsingKeys {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.id("searchDropdownBox"));
		searchBox.sendKeys(Keys.ARROW_DOWN);
		searchBox.sendKeys(Keys.ARROW_DOWN);
		searchBox.sendKeys(Keys.ARROW_DOWN);
		searchBox.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(2000);
		driver.close();

	}

}
