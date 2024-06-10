//Create an account in amazon.in using DDT (No need to click on Register button)

package selenium_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A178_DDT_AmazonRegistration {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String credSheet = "details";
		FileInputStream file = new FileInputStream("C:\\Users\\91809\\eclipse-workspace\\GrotechMinds\\Selenium\\TestData\\Amazon login.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		
		WebElement signInHover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(signInHover).perform();
		
		WebElement signInButton = driver.findElement(By.xpath("(//span[@class = 'nav-action-inner'])[1]"));
		signInButton.click();
		Thread.sleep(1000);
		
		WebElement createAccount = driver.findElement(By.partialLinkText("Create your Amazon"));
		createAccount.click();
		
		WebElement name = driver.findElement(By.id("ap_customer_name"));
		String nameCell = workbook.getSheet(credSheet).getRow(1).getCell(3).getStringCellValue();
		name.sendKeys(nameCell);
		
		System.out.println("END");
	}

}
