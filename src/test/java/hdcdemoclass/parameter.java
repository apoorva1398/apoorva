package hdcdemoclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class parameter {
  @Test(dataProvider = "credentials")
  public void f(String name, String pass) {
	  WebDriver appu;
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe" );
	   appu = new ChromeDriver();
	   appu.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  WebElement ab= appu.findElement(By.linkText("SignIn"));
	  ab.click();
	   WebElement un=appu.findElement(By.name("userName"));
	   un.sendKeys(name);
	   WebElement ps=appu.findElement(By.name("password"));
	   ps.sendKeys(pass);
	   appu.findElement(By.name("Login")).click();
  System.out.println("usename:"+name);
  System.out.println("password:"+pass);
  String E_title= "Home";
  String A_title= appu.getTitle();
  Assert.assertEquals(A_title, E_title);
  }

  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] { "lalitha", "password123" },
      new Object[] { "sravya", "GANGA" },
      new Object[] { "ramya", "ramya12" }
    };
  }
}
