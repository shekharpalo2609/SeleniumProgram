//Write a program on drag drop to original place(reverse of 141) https://grotechminds.com/drag-and-drop/

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A142_DragDropToOGGrotechminds {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		WebElement drop = driver.findElement(By.xpath("//div[@id = 'div2']"));

		// 1. Write a code to drag and drop JSON
		WebElement json = driver.findElement(By.id("drag11"));
		actions.dragAndDrop(json, drop).perform();
		WebElement dropJsonToOriginal = driver.findElement(By.xpath("(//div[@id = 'container'])[11]"));
		Thread.sleep(1000);
		actions.dragAndDrop(json, dropJsonToOriginal).perform();
		Thread.sleep(1000);

		// 2. Write a code to return GitHub to original position after drag and drop
		WebElement gitHub = driver.findElement(By.id("drag5"));
		actions.dragAndDrop(gitHub, drop).perform();
		Thread.sleep(1000);
		WebElement dropGithubToOriginal = driver.findElement(By.xpath("(//div[@id = 'container'])[5]"));
		actions.dragAndDrop(gitHub, dropGithubToOriginal).perform();
		Thread.sleep(1000);

		// 3 Write a code to drag and drop Selenium
		WebElement selenium = driver.findElement(By.id("drag6"));
		actions.dragAndDrop(selenium, drop).perform();
		Thread.sleep(1000);
		WebElement dropSeleniumToOriginal = driver.findElement(By.xpath("(//div[@id = 'container'])[6]"));
		actions.dragAndDrop(selenium, dropSeleniumToOriginal).perform();
		Thread.sleep(1000);

		// 4 Write a code to drag and drop Cucumber
		WebElement cucumber = driver.findElement(By.id("drag1"));
		actions.dragAndDrop(cucumber, drop).perform();
		Thread.sleep(1000);
		WebElement dropCucumberToOriginal = driver.findElement(By.xpath("(//div[@id = 'container'])[1]"));
		actions.dragAndDrop(cucumber, dropCucumberToOriginal).perform();
		Thread.sleep(1000);

		// 5 Write a code to drag and drop Eclipse
		WebElement eclipse = driver.findElement(By.id("drag4"));
		actions.dragAndDrop(eclipse, drop).perform();
		Thread.sleep(1000);
		WebElement dropEclipseToOriginal = driver.findElement(By.xpath("(//div[@id = 'container'])[4]"));
		actions.dragAndDrop(eclipse, dropEclipseToOriginal).perform();
		Thread.sleep(1000);

		// 6 Write a code to drag and drop Jenkins
		WebElement jenkins = driver.findElement(By.id("drag3"));
		actions.dragAndDrop(jenkins, drop).perform();
		Thread.sleep(1000);
		WebElement dropJenkinsToOriginal = driver.findElement(By.xpath("(//div[@id = 'container'])[3]"));
		actions.dragAndDrop(jenkins, dropJenkinsToOriginal).perform();
		Thread.sleep(1000);

		// 7 Write a code to drag and drop Spring Boot
		WebElement springBoot = driver.findElement(By.id("drag10"));
		actions.dragAndDrop(springBoot, drop).perform();
		Thread.sleep(1000);
		WebElement dropSpringBootToOriginal = driver.findElement(By.xpath("(//div[@id = 'container'])[10]"));
		actions.dragAndDrop(springBoot, dropSpringBootToOriginal).perform();
		Thread.sleep(1000);

		// 8 Write a code to drag and drop SQL
		WebElement sql = driver.findElement(By.id("drag9"));
		actions.dragAndDrop(sql, drop).perform();
		Thread.sleep(1000);
		WebElement dropSQLToOriginal = driver.findElement(By.xpath("(//div[@id = 'container'])[9]"));
		actions.dragAndDrop(sql, dropSQLToOriginal).perform();
		Thread.sleep(1000);

		driver.close();
		System.out.println("end");
	}

}
