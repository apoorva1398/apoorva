package test123.test123;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testme {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		   WebElement sb=appu.findElement(By.name("Login"));
		   sb.click();
		   Thread.sleep(3000);
		   /*if (A_title.equals(E_title))
		   {
			   System.out.println("PAGE OPENED");
		   }
		   else
		   {
			   System.out.println("page not opened");
		   }*/
		   appu.close();
		   //appu.quit();

	}

}
