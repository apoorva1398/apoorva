	  package hdcdemoclass;

	  import org.openqa.selenium.By;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.WebElement;
	  import org.testng.annotations.Test;

	  public class Naukri
	  {
	    @Test
	    public void f() 
	    {
	  	  WebDriver dri;
	  	  dri = driver.getDriver("CRM");
	  	  dri.get("https://www.naukri.com/");
	  	WebElement c=  dri.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div/h3"));
	  	System.out.println(c.getText());
	  	  
	    }
	  
  }

