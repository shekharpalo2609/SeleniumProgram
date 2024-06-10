//Launch google.com and do the right click on Gmail

package selenium_assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Launch google.com and do the right click on Gmail
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A143_RightClickGmail {

	public static void main(String[] args) throws InterruptedException {
			
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		actions.contextClick(gmail).perform();
		
		Thread.sleep(1000);
		
	}

}
