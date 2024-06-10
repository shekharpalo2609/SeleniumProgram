//Launch google, search Mumbai and take a screenshot and save to shekhar.png

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

public class A168_ScreenshotFromGoogle {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Mumbai");
		searchBox.sendKeys(Keys.ENTER);
		
		//1. upcasting driver to takeScreenShot()
		TakesScreenshot screenshot = driver;

		//2. utilize its abstract method: getScreenshotAs(OutputType.FILE)
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		//3. File destination = new File("file_location where it need to be save");
		File destination = new File("C:\\Users\\91809\\OneDrive\\Desktop\\gtm_screenshot\\google.png");
		
		//4. use static method: copy(source,destination)
		FileHandler.copy(source,destination);
		
	}

}
