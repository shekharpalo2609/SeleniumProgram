//Open Grotechminds website and handle java script pop up:  https://grotechminds.com/javascript-popup/

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A166_Popup_Grotechminds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(2000);
		
		WebElement okButton = driver.findElement(By.cssSelector("button.btnjs"));
		okButton.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.close();
		System.out.println("END");
	}

}
