package hdcdemoclass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class xmparam {
	@Parameters({"tester","location"})
  @Test
  public void f(String tester,String location) {
		System.out.println("name is:" +tester);
  }
	@Parameters({"tester","location"})
	  @Test
	  public void f1(String tester,String location) {
			System.out.println("location is:" +location);
	  }
}
