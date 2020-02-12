package runpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="C:\\Users\\Training1\\eclipse-workspace\\test123\\week4\\TestMeCart.feature",glue="TestDemo1")

@CucumberOptions(features="week4",glue="TestDemo1",tags= {"@Regression, @Sanity"})
public class Runcu {

}
