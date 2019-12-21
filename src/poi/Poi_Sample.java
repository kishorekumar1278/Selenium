package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi_Sample {
	
	FileInputStream fis;
	XSSFWorkbook wb;
	public Object m1() throws Exception{
		File file=new File("D:\\Kishore\\TM_HRM_Automation1\\TM_HRM_Automation1\\TestData\\HRM.xlsx");
			 fis=new FileInputStream(file);
			 wb=new XSSFWorkbook(fis);
			
			XSSFSheet sheet=wb.getSheetAt(1);
			int rowcount=sheet.getLastRowNum();
          Row r1=
			for(int i=0;i<rowcount;i++){
			for(int j=0;j<3;j++){
			String str=sheet.getRow(i).getCell(j).getStringCellValue();
			 
			System.out.println("row count is "+str);
			}
			}
			wb.close();
			return null;
		}

	
}
