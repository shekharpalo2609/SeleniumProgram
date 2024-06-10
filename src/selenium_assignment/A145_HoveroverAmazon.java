//Launch the Amazon.india and click the Account List & Click the Sign in Button & Login Using Hover Over

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class A145_HoveroverAmazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement accountAndLists = driver.findElement(By.xpath("//span[@class = 'nav-line-2 ']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(accountAndLists).perform();
		
		WebElement signInButton = driver.findElement(By.xpath("(//span[@class = 'nav-action-inner'])[1]"));
		signInButton.click();
		
		WebElement signInTextBox = driver.findElement(By.xpath("//input[@type = 'email']"));
		signInTextBox.sendKeys("shekhar123@gmail.com");
		signInTextBox.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("end");
	}

}
