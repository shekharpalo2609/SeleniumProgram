//Which exception will come when you try to fetch mobile number from excel sheet

package selenium_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A174_DDT_MobileNumber {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream input = new FileInputStream(
				"C:\\Users\\91809\\eclipse-workspace\\GrotechMinds\\GrotechMinds\\MyEntireJavaProgram\\Selenium\\TestData\\selenium_test.xlsx");
		
		Workbook workbook = WorkbookFactory.create(input);
		
		String cellValue1 = workbook.getSheet("credentials").getRow(1).getCell(0).getStringCellValue(); 
		System.out.println(cellValue1);
	}

}
