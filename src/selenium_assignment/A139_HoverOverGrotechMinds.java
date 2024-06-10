package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Demonstrate program on How to hover over https://grotechminds.com/hoverover/


public class A139_HoverOverGrotechMinds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		//1. Write A Code To Hoverover Demo 1 And Click On Practice 3
		WebElement demo1 = driver.findElement(By.xpath("(//div[@class='toolrip4'])[1]"));
		actions.moveToElement(demo1).perform();
		
		WebElement perform3 = driver.findElement(By.xpath("(//div[@class='popup4'])[3]"));
		perform3.click();
		
		
		//2. Write A Program To Hoverover Demo 4 And Click On Practice 10
		WebElement demo4 = driver.findElement(By.xpath("//div[@class='toolrip6']"));
		actions.moveToElement(demo4).perform();
		
		WebElement practice10 = driver.findElement(By.xpath("(//div[@class='popup6'])[10]"));
		practice10.click();
		
		
		
		//3. Write A Program To Hoverover Demo 5 And Click On Practice 1
		
		
		
		//4. Write A Program To Hoverover Demo 2 And Click On Practice 6
		
		
		
		//5. Write Codes Separately To Select QTP 9 And Energy 14 Using Select By Visible Text.
		
		
		
		//6. Write A Program To Hoverover Demo 2 And Click On Practice 8
		
		
		
		
		//7. Write A Program To Hoverover Demo 2 And Click On Practice 9
		
		
		
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("end");
	}

}
