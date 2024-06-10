package batch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class NumberToStringConverter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream input = new FileInputStream(
				"C:\\Users\\91809\\eclipse-workspace\\GrotechMinds\\GrotechMinds\\MyEntireJavaProgram\\Selenium\\TestData\\selenium_test.xlsx");

		Workbook workbook = WorkbookFactory.create(input);

		String cellValue1 = NumberToTextConverter.toText(workbook.getSheet("credentials").getRow(1).getCell(0).getNumericCellValue());
		System.out.println(cellValue1);
	}

}
