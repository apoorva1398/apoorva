package hdcdemoclass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel {
  @Test
  public void f() throws IOException {
	  File myfl=new File("C:\\Users\\H2_9_19_User26\\Desktop\\EXCELSEL.xlsx");
	  FileInputStream fis= new FileInputStream(myfl); // for reading inputs
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  XSSFSheet sh =wb.getSheetAt(0);
	  int rows=sh.getLastRowNum();
	  for(int i=1;i<rows;i++)
	  {
		  String u_name=sh.getRow(i).getCell(0).getStringCellValue();
		  String pswd=sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("username is:"+u_name);
		  System.out.println("password is:"+pswd);
		  sh.getRow(i).createCell(2).setCellValue("succes");
		  FileOutputStream fout= new FileOutputStream("C:\\Users\\H2_9_19_User26\\Desktop\\EXCELSEL.xlsx");
		  wb.write(fout);
		  
	  }
wb.close();	  
  }
}
