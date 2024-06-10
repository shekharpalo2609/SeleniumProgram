//Launch google.co.in type India and select 5th auto suggestion.

package selenium_assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class A148_AutoSuggestionGoogle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");

		Thread.sleep(1000);
		List<WebElement> autoSuggestion = driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
		int count = autoSuggestion.size();
		System.out.println(count);
		autoSuggestion.get(4).click();
		Thread.sleep(1000);
		driver.close();
	}

}
