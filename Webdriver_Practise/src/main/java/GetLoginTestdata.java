import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class GetLoginTestdata {
	
	static String TESTDATA_SHEET_PATH = "D:\\GIT PROJECTS\\Webdriver_Practise\\src\\main\\java\\TestData.xlsx";	
	static Workbook book;
	static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println(sheet.getLastRowNum() + "--------" +
		sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				switch(sheet.getRow(i+1).getCell(k).getCellTypeEnum()){
				case STRING:
					data[i][k] = sheet.getRow(i + 1).getCell(k).getStringCellValue();	
					break;
				case NUMERIC:
					data[i][k] = sheet.getRow(i + 1).getCell(k).getNumericCellValue();
					break;
				case BOOLEAN:
					data[i][k] = sheet.getRow(i + 1).getCell(k).getBooleanCellValue();
					break;
				case FORMULA:
					data[i][k] = sheet.getRow(i + 1).getCell(k).getCellFormula();
					break;
				default:
					System.out.println("no matching enum data type found");
					break;
				
				}
				
				
				
				//data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				System.out.println(data[i][k]);
			}
		}
		return data;
	}
}
