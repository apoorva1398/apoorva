package hdcdemoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPayment {
  @Test
  public void TestMe() throws InterruptedException {
	  WebDriver appu;
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe" );
	   appu = new ChromeDriver();
	   appu.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  WebElement ab= appu.findElement(By.linkText("SignIn"));
	  ab.click();
	   WebElement un=appu.findElement(By.name("userName"));
	   WebElement ps=appu.findElement(By.name("password"));
	   un.sendKeys("lalitha");
	   ps.sendKeys("password123");
	   WebElement sb=appu.findElement(By.name("Login")); //login
	   sb.click();
	  
		/*  String actual=appu.getTitle();
		  Assert.assertEquals(actual, expected);
		  System.out.println("Login success");
		   }
}*/
      appu.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click(); //allcat
	   appu.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click(); //electronics
	   appu.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[2]/a/span")).click(); //headphone
	  appu.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	  appu.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
    
	  appu.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  appu.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	  appu.findElement(By.xpath("//*[@id=\"swit\"]/div[6]/div/label/i"));
	  appu.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	  appu.findElement(By.xpath(""));
	//  appu.findElement(By.xpath(""))
	//  String expected="Redirecting to Payment Gateway";
	//  String actual=appu.getTitle();
	 // Assert.assertEquals(actual, expected);
	    appu.close();
	  // appu.findElement(By.xpath("")).click();
	   
	  // sb.click();
  }
}
	   
	  
  

