//Take a screenshot but provide a wrong location, find exception name

package selenium_assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A171_ScreenshotInvalidLocation {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement searchBar = driver.findElement(By.cssSelector("textarea[aria-owns='Alh6id']")); // tagName[AN = 'AV']
		searchBar.sendKeys("Mumbai");
		searchBar.sendKeys(Keys.ENTER);
		
		TakesScreenshot screenshot =driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination  = new File("L:\\Users\\91809\\OneDrive\\Desktop\\gtm_screenshot\\google.png");
		FileHandler.copy(source, destination);
	}

}
