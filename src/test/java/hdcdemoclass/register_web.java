package hdcdemoclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class register_web {
  @Test(dataProvider = "dp")
  public void f(String a, String b, String c, String d, String e) {
	  WebDriver dri;
	  dri = driver.getDriver("CRM");
	  dri.get("http://demowebshop.tricentis.com/");
	  dri.findElement(By.xpath("//a[text()='Register']")).click();
	  dri.findElement(By.xpath("//*[@id=\"gender-female\"]"));
	  dri.findElement(By.id("FirstName")).sendKeys(a);
	  dri.findElement(By.id("LastName")).sendKeys(b);
	  dri.findElement(By.name("Email")).sendKeys(c);
	  dri.findElement(By.id("Password")).sendKeys(d);
	  dri.findElement(By.id("ConfirmPassword")).sendKeys(e);
	  dri.findElement(By.id("register-button")).click();
	  String A_title=dri.getTitle();
	String  E_title ="Demo Web Shop. Register";
	 Assert.assertEquals(A_title, E_title);
	 System.out.println("registration succes");
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "shravya", "ganga","ganga.shravya@gmail.com","ganga@12","ganga@12" },
      new Object[] { "ravali", "nalgonda","ravali.nalginda@gmail.com","ravali@12","ravali@12"},
      new Object[] { "apoorva", "arugonda","apoorva.arugonda@gmail.com","apoorva@12","apoorva@12" },
    };
  }
}
