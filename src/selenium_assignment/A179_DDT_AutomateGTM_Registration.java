//Automate using DDT: https://grotechminds.com/registeration-form/   

package selenium_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A179_DDT_AutomateGTM_Registration {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\Users\\91809\\eclipse-workspace\\GrotechMinds\\Selenium\\TestData\\GTM_Registration.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		String firstNameCell = workbook.getSheet("details").getRow(1).getCell(3).getStringCellValue();
		firstName.sendKeys(firstNameCell);

		Thread.sleep(1000);
		WebElement lastName = driver.findElement(By.id("lastName"));
		String lastNameCell = workbook.getSheet("details").getRow(0).getCell(1).getStringCellValue();
		lastName.sendKeys(lastNameCell);
		
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.cssSelector("#email"));
		String emailCell = workbook.getSheet("details").getRow(5).getCell(0).getStringCellValue();
		email.sendKeys(emailCell);
		
		Thread.sleep(1000);
		WebElement phone = driver.findElement(By.id("phone"));
		String phoneCell = NumberToTextConverter.toText(workbook.getSheet("details").getRow(3).getCell(1).getNumericCellValue());
		phone.sendKeys(phoneCell);
		
		Thread.sleep(1000);
		WebElement gender = driver.findElement(By.name("gender"));
		Select selectGender = new Select(gender);
		selectGender.selectByVisibleText("Male");
		
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.name("state"));
		Select selectState = new Select(state);
		selectState.selectByIndex(16);
		
		Thread.sleep(1000);
		WebElement aadhar = driver.findElement(By.cssSelector("#aadhaar"));
		String aadharCell = NumberToTextConverter.toText(workbook.getSheet("details").getRow(7).getCell(2).getNumericCellValue());
		aadhar.sendKeys(aadharCell);
		
		Thread.sleep(1000);
		WebElement pan = driver.findElement(By.name("pan"));
		String panCell = workbook.getSheet("details").getRow(3).getCell(2).getStringCellValue();
		pan.sendKeys(panCell);
		
		Thread.sleep(1000);
		WebElement agree = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		agree.click();
		
		Thread.sleep(1000);
		WebElement register = driver.findElement(By.name("Submit"));
		register.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
		System.out.println("END");
		
	}

}
