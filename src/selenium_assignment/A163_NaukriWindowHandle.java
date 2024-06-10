//Launch naukari.com registration, click on login with google, move control to child window and enter email address

package selenium_assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A163_NaukriWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement google = driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> parentChildID = s1.iterator();
		
		String parentId = parentChildID.next();
		String childId = parentChildID.next();
		
		driver.switchTo().window(childId);
		Thread.sleep(2000);
		driver.close();
		System.out.println("END");
	}

}
