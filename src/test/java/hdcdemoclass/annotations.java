package hdcdemoclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations {
  @Test
  public void Login() 
  {
	  System.out.println("5 lines;login");
  }
  @BeforeMethod
  public void Launch() 
  {
	  System.out.println("3 lines:launch");
  }
  @Test
  public void Register()
  {
	  System.out.println("10 lines:register");
  }
	  @AfterMethod
	  public void close()
	  {
		  System.out.println("20 lines:close");
	  }

	  @BeforeClass
	  public void Before() 
	  {
		  System.out.println("before");
	  }

	  @AfterClass
	  public void After() 
	  {
		  System.out.println("after");
	  }
  
}
