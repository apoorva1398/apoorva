package test123.test123;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver appu;
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe" );
		   appu = new ChromeDriver();
		   appu.get("http://demowebshop.tricentis.com/");
		   appu.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		   // works like exist in UFT and applicable to complete program
		   //WebDriverWait wait1=new WebDriverWait(appu,60); 
		   //60 sec
		   //wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));
		   appu.manage().window().maximize();
	List<WebElement> t_links = appu.findElements(By.tagName("a"));
	int n_links=t_links.size();
		 System.out.println(n_links);  
		 for(int i=0;i<n_links;i++)
		 {
			 String l_linkname=t_links.get(i).getText();
			 System.out.println("The"+i+"th"+" link is: "+l_linkname);
			 
		 }
	}

}
