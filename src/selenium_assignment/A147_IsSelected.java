//Demonstrate a program methods of WebElement Interface Use JSAM HTML

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A147_IsSelected {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91809/OneDrive/Documents/learningHTML1.html");
		driver.manage().window().maximize();

		WebElement boyCheckbox = driver.findElement(By.id("123"));
		boolean answer = boyCheckbox.isSelected();
		if (answer == true) {
			System.out.println("Selected");
		} else {
			System.out.println("Not selected");
			boyCheckbox.click();
			System.out.println("I have selected it now");
		}

		Thread.sleep(1000);
		driver.close();
	}

}
