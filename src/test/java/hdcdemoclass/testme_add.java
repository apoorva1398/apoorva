package hdcdemoclass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testme_add {
  @Test
  public void f() {
	  WebDriver dri;
	  dri = driver.getDriver("CRM");
	  dri.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  dri.findElement(By.xpath("//span[text()='AboutUs']")).click();
	  dri.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span")).click();
	  dri.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span")).click();
	  Set<String> windows=dri.getWindowHandles();
	  for(String s: windows)
	  {
		  dri.switchTo().window(s);
		 // String it_id= dri.getWindowHandle();
	  
	  }
	  dri.switchTo().frame(dri.findElement(By.name("main_page")));
	  WebElement first=dri.findElement(By.xpath("//address[@id='demo3']"));
	  System.out.println(first.getText());
	  dri.close();
	  
	  
  }
}
