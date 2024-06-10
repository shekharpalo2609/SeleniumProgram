//Launch any Pharmacy ecomm site, type  Diclo And select 5th Auto Suggestion

package selenium_assignment;

import java.util.List;
//Launch any Pharma ecomm site, type  Diclo And select 5th Auto Suggestion

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A150_AutoSuggestionPharmacy {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		searchBox.sendKeys("Diclo");
		Thread.sleep(2000);

		List<WebElement> autoSuggest = driver.findElements(By.xpath("//div[@id='ProductSearch']/div/a"));
		autoSuggest.get(4).click();
		Thread.sleep(4000);
		
		int count = autoSuggest.size();
		driver.close();
		System.out.println(count);

	}

}
