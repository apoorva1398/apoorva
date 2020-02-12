package hdcdemoclass;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 2, dependsOnMethods="m1")
  public void flipkart() {
	  System.out.println("code for flipkart");
  }
  @Test
  public void m1() 
  {
	  int a=5;
	  int b=0;
	  int c=a/b;
	  System.out.println("5 lines;login");
  }
  @Test
  public void Login() 
  {
	  System.out.println("login");
  }
}
