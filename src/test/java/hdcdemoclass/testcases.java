package hdcdemoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testcases {
  @Test
  public void computer_web() throws InterruptedException {
	  WebDriver dri;
	  dri = driver.getDriver("CRM");
	  dri.get("http://demowebshop.tricentis.com/");
	  dri.manage().window().maximize();
	  WebElement sb=dri.findElement(By.xpath("//input[@name='q']"));//sendKeys("accenture");
	  Actions act=new Actions(dri);
	  act.keyDown(sb,Keys.ALT).sendKeys("computer").keyDown(Keys.ALT).build().perform();
	  Thread.sleep(2000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
  }
}
