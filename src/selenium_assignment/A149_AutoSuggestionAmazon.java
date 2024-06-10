//Launch amazon.in type shoe, & Auto_select the 5th suggestion.

package selenium_assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A149_AutoSuggestionAmazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(1000);
		
		List<WebElement> autoSuggest = driver
				.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = autoSuggest.size();
		autoSuggest.get(4).click();
		Thread.sleep(1000);
		driver.close();
		System.out.println(count);
	}

}
