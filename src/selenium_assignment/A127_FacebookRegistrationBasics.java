//Launch facebook.com > click on create account > register yourself > Use name and ID locator

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A127_FacebookRegistrationBasics {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement createAccount = driver.findElement(By.id("u_0_0_1a"));
		createAccount.click();

	}

}
