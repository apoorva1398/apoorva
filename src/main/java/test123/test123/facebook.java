package test123.test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver appu;
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe" );
		   appu = new ChromeDriver();
		   appu.get("https://www.facebook.com");
		  WebElement fn= appu.findElement(By.name("firstname"));
		   WebElement ln=appu.findElement(By.name("lastname"));
			  WebElement mb= appu.findElement(By.name("reg_email__"));
			  WebElement ps= appu.findElement(By.name("reg_passwd__"));
			  WebElement bm=appu.findElement(By.xpath("//*[@id=\"month\"]"));
			  WebElement bd=appu.findElement(By.xpath("//*[@id=\"day\"]"));
			  WebElement by=appu.findElement(By.xpath("//*[@id=\"year\"]"));
			  appu.findElement(By.xpath("//*[@id=\"u_0_z\"]/span[1]/label")).click();

			//  appu.close();  
           fn.sendKeys("lalitha");
		   ln.sendKeys("lalli");
		   mb.sendKeys("9553571296");
		   ps.sendKeys("pass@012");
		   bm.sendKeys("feb");
		   bd.sendKeys("29");
		   by.sendKeys("1993");
		   

			 WebElement sg= appu.findElement(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]"));
			 sg.click();
		/*   WebElement sb=appu.findElement(By.name("Login"));
		   sb.click();
		   Thread.sleep(3000);*/
	}

}
