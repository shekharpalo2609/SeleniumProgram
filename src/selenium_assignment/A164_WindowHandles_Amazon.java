//Launch Amazon search for shoe, click on first shoe, click on add to wishlist, login to the application, click add to cart and buy now.

package selenium_assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A164_WindowHandles_Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.cssSelector("[id = 'twotabsearchtextbox']"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);
		
		WebElement firstShoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstShoe.click();
		
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("Parent and child window handle Ids: "+s1);
		Iterator<String> parentChildId = s1.iterator();
		String parentId = parentChildId.next();
		String childId = parentChildId.next();
		
		System.out.println("Parent Id: " + parentId);
		System.out.println("Child Id: " +  childId);
		Thread.sleep(2000);
		
		driver.switchTo().window(childId);
		WebElement wishList = driver.findElement(By.linkText("Add to Wish List"));
		wishList.click();
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("paloskr26@gmail.com");
		email.sendKeys(Keys.ENTER);
		
		
	}

}
