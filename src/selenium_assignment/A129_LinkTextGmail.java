//Demonstrate a code for linktext locator use google application and click gmail linktext

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A129_LinkTextGmail {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		gmail.click();

	}

}
