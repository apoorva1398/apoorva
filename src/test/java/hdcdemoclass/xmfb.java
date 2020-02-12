package hdcdemoclass;

import org.testng.annotations.Test;

public class group
{
  @Test(groups= {"sanity","unit"})
  public void Login()
  {
	  System.out.println("hello");
  }
  
  @Test(groups= {"sanity"})
  public void Regestration() 
  {
	  System.out.println("hello");
  }
  
  @Test(groups= {"unit"})
  public void Logout() 
  {
	  System.out.println("hello");
  }
}
