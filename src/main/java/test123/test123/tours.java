package test123.test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver appu;
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe" );
		   appu = new ChromeDriver();
		   appu.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		   appu.manage().window().maximize();
		   WebElement sp=appu.findElement(By.linkText("SignUp"));
		   sp.click();
		 //  WebElement des=appu.findElement(By.xpath("(//span[text()='destination'])[1]"));
		  WebElement ps=appu.findElement(By.id("securityQuestion"));	
		  Select s =new Select(ps);
		  s.selectByValue("411012");
		  

	}

}
