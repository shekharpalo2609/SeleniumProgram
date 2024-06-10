//Take the data from the excel sheet and write the Data Driven Test program using method chaining concept.

package selenium_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A176_DDT_UsingMethodChaining {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream input = new FileInputStream(
				"C:\\Users\\91809\\eclipse-workspace\\GrotechMinds\\GrotechMinds\\MyEntireJavaProgram\\Selenium\\TestData\\selenium_test.xlsx");

		Workbook workbook = WorkbookFactory.create(input);

		String cellValue1 = workbook.getSheet("credentials").getRow(0).getCell(1).getStringCellValue();
		System.out.println(cellValue1);

		String cellValue2 = workbook.getSheet("names").getRow(2).getCell(1).getStringCellValue();
		System.out.println(cellValue2);
	}

}
