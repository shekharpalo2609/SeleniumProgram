//Which exception will come when you fetch value from empty cell

package selenium_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A173_DDT_EmptyCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream input = new FileInputStream(
				"C:\\Users\\91809\\eclipse-workspace\\GrotechMinds\\GrotechMinds\\MyEntireJavaProgram\\Selenium\\TestData\\selenium_test.xlsx");

		Workbook workbook = WorkbookFactory.create(input);

		String cellValue1 = workbook.getSheet("credentials").getRow(60).getCell(42).getStringCellValue(); // java.lang.NullPointerException
		System.out.println(cellValue1);

	}

}
