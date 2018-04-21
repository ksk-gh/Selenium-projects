package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
@Before
	public void before(Scenario sc)
	{
		startResult();
		startTestModule("Lead", "Merge lead");	
		test = startTestCase("leads");
		test.assignCategory("smoke");
		test.assignAuthor("sankar");
		startApp("chrome");		

		
	}
	@After
	public void after()
	{
		endResult();
		closeAllBrowsers();
		
	}
	
}