package selenium_assignment;

//Goto Amazon.in locate shoe with relative xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A133_RelativeXpathAmazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=155259813113&hvpone=&hvptwo=&hvadid=674842289479&hvpos=&hvnetw=g&hvrand=10941065062317175544&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301513&hvtargid=kwd-304880464215&hydadcr=14450_2316420&gad_source=1");
		driver.manage().window().maximize();
		
		WebElement shoes = driver.findElement(By.xpath("(//a)[74]"));
		shoes.click();
		
		driver.close();
	}

}
