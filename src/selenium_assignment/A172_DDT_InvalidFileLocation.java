//Which exception will come if user provide wrong excel file location

package selenium_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A172_DDT_InvalidFileLocation {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream input = new FileInputStream(
				"L:\\Users\\91809\\eclipse-workspace\\GrotechMinds\\GrotechMinds\\MyEntireJavaProgram\\Selenium\\TestData\\selenium_test.xlsx");

		// java.io.FileNotFoundException

		Workbook workbook = WorkbookFactory.create(input);

		String cellValue1 = workbook.getSheet("credentials").getRow(0).getCell(1).getStringCellValue();
		System.out.println(cellValue1);
	}

}
