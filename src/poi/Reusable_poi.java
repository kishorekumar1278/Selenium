package poi;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reusable_poi {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Reusable_poi(String ExclPath) {
		try {
			File file=new File(ExclPath);
			  fis=new FileInputStream(file);
			 wb=new XSSFWorkbook(fis);
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		}
	public String getdata(int sheetnum,int row,int column){
		sheet=wb.getSheetAt(sheetnum);
		String str=sheet.getRow(row).getCell(column).getStringCellValue();
		return str;
	}

}
