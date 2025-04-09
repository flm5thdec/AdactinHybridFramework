package regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class TC106 extends BaseTest{
	
	@Test
	public void m1()
	{
		LoginPage lp=new LoginPage();
		lp.login();
	}
	
	

}
