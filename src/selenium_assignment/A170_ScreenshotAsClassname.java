//Launch google, search Mumbai and take a screenshot with a name as class name

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

public class A170_ScreenshotAsClassname {

	public static void main(String[] args) throws IOException, InterruptedException {

		A170_ScreenshotAsClassname className = new A170_ScreenshotAsClassname();
		String className1 = className.toString();
		System.out.println(className1);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement searchBar = driver.findElement(By.cssSelector(".gLFyf")); // .classNameValue
		searchBar.sendKeys("Mumbai");
		searchBar.sendKeys(Keys.ENTER);
		
		TakesScreenshot screenshot = driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91809\\OneDrive\\Desktop\\gtm_screenshot\\google_".concat(className1) + ".png");
		FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("END");
	}

}
