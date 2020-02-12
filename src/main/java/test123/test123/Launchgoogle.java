package test123.test123;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchgoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver appu;
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe" );
   appu = new ChromeDriver();
   appu.get("http://www.google.com");
   WebElement un=appu.findElement(By.name("email"));
   WebElement ps=appu.findElement(By.id("pass"));
   un.sendKeys("apoorva");
   ps.sendKeys("apoorva13");
   WebElement sb=appu.findElement(By.id("u_0_b"));
   sb.click();
   
 /*  appu.manage().window().maximize();
   Dimension d  = new Dimension(400,400);
   appu.manage().window().setSize(d);
   Thread.sleep(2000);
   Point p= new Point(300,500);
   appu.manage().window().setPosition(p);
   Thread.sleep(2000);
   // appu.navigate().to("");
   String E_title="Google";
   String A_title=appu.getTitle();
   if (A_title.equals(E_title))
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
