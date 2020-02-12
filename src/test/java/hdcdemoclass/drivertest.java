package hdcdemoclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class drivertest {
  @Test
  public void f() 
  {
	  WebDriver dri;
	  dri = driver.getDriver("CRM");
	  dri.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  dri.close();
  }
}
