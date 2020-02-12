package hdcdemoclass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class google1 {
  @Test(enabled=false)
  public void accenture() throws InterruptedException {
	  WebDriver dri;
	  dri = driver.getDriver("CRM");
	  dri.get("http://www.google.com");
	  WebElement sb=dri.findElement(By.name("q"));//sendKeys("accenture");
	  Actions act=new Actions(dri);
	  act.keyDown(sb,Keys.SHIFT).sendKeys("accentureh").keyDown(Keys.SHIFT).build().perform();
	  Thread.sleep(2000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
  }	  
	  @Test(enabled=false)
	  public void spicejet() throws InterruptedException {
		  WebDriver dri;
		  dri = driver.getDriver("CRM");
		  dri.get("http://www.google.com"); 
		  dri.get("https://www.spicejet.com/default.aspx");
		  WebElement el2=dri.findElement(By.xpath("//a[@id='highlight-addons']"));
		  Actions act2=new Actions(dri);
		  act2.moveToElement(el2).build().perform();
		  Thread.sleep(2000);
		  dri.findElement(By.xpath("//a[text()='MyFlexiPlan']")).click();
	  }
		  @Test(enabled=false)
		  public void gmail() throws InterruptedException
		  {
			  WebDriver dri;
			  dri = driver.getDriver("CRM");
			  dri.get("http://www.google.com");
			WebElement el3=  dri.findElement(By.xpath("//a[text()='Gmail']"));
			  Actions act3=new Actions(dri);
			  act3.contextClick(el3).build().perform();
		  }
		  @Test
		  public void dnd() throws InterruptedException
		  {
			  WebDriver dri;
			  dri = driver.getDriver("CRM");
			  dri.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
			  dri.manage().window().maximize();
			  WebElement src =dri.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
			  WebElement  des =dri.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
			  Actions act4=new Actions(dri);
			  act4.dragAndDrop(src, des).build().perform();
			  //act5.clickAndHold(src).release(dst).build().perform();
			  WebElement s1=  dri.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tfoot/tr/td[2]"));
			 Thread.sleep(2000);
			  String E_val="$0";
			  String A_val=s1.getText();
			  Assert.assertNotSame(A_val, E_val);
			  System.out.println("drag and drop is succes");
		  
		  }	
		  
		  
}
