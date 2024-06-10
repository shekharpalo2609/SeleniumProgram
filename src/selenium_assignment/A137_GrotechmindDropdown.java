package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Demonstrate a program on dropdown for whole page : https://grotechminds.com/dropdown/

public class A137_GrotechmindDropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();

		Thread.sleep(1000);

		//1. Write A Code To Select Demo2 Using Select By Visible Text.
		WebElement selectChoice1 = driver.findElement(By.id("Choice1"));
		Select demo2 = new Select(selectChoice1);
		demo2.selectByVisibleText("Demo2");
		Thread.sleep(1000);

		//2. Write A Code To Select SQL 15 Using Select By Value.
		WebElement selectChoice9 = driver.findElement(By.id("Choice9"));
		Select sql15 = new Select(selectChoice9);
		sql15.selectByValue("SQL15");
		Thread.sleep(1000);
		
		//3. Explain The Procedure Of Selecting Night 10 Dropdown?
		WebElement selectChoice6 = driver.findElement(By.id("Choice6"));
		Select night10 = new Select(selectChoice6);
		night10.selectByIndex(9);
		Thread.sleep(1000);
		
		//4. Write Codes Separately To Select QTP 10 And Energy 15 Using Select By Visible Text.
		WebElement selectChoice8 = driver.findElement(By.id("Choice8"));
		Select qtp10 = new Select(selectChoice8);
		qtp10.selectByVisibleText("QTP10");
		Thread.sleep(1000);
		
		WebElement selectChoice4 = driver.findElement(By.id("Choice4"));
		Select energy15 = new Select(selectChoice4);
		energy15.selectByVisibleText("Energy15");
		Thread.sleep(1000);
		
		//5. Write Codes Separately To Select QTP 9 And Energy 14 Using Select By Visible Text.
		Select qtp14 = new Select(selectChoice8);
		qtp14.selectByVisibleText("QTP9");
		Thread.sleep(1000);
		
		Select energy14 = new Select(selectChoice4);
		energy14.selectByVisibleText("Energy14");
		Thread.sleep(1000);
		
		
		//6. Write Codes Separately To Select QTP 8 And Energy 13 Using Select By Visible Text.
		Select qtp8 = new Select(selectChoice8);
		qtp8.selectByVisibleText("QTP8");
		Thread.sleep(1000);
		
		Select energy13 = new Select(selectChoice4);
		energy13.selectByVisibleText("Energy13");
		Thread.sleep(1000);
		
		
		//7. Write Codes Separately To Select QTP 7 And Energy 12 Using Select By Visible Text.
		Select qtp7 = new Select(selectChoice8);
		qtp7.selectByVisibleText("QTP7");
		Thread.sleep(1000);
		
		Select energy12 = new Select(selectChoice4);
		energy12.selectByVisibleText("Energy12");
		Thread.sleep(1000);
		
		//8. Write Codes Separately To Select QTP 6 And Energy 11 Using Select By Visible Text.
		Select qtp6 = new Select(selectChoice8);
		qtp6.selectByVisibleText("QTP6");
		Thread.sleep(1000);
		
		Select energy11 = new Select(selectChoice4);
		energy11.selectByVisibleText("Energy11");
		Thread.sleep(1000);

		System.out.println("end");
	}

}
