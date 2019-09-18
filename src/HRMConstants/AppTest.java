package HRMConstants;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends OrangeHRMConstants{

	@Test
	public void adminLoginCheck() {
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		lp.logiN("Admin","Qedge123!@#");
		
		AdminHomePage ahome = PageFactory.initElements(driver, AdminHomePage.class);
		
		boolean res = ahome.isWelcomeDisplayed();
		
		Assert.assertTrue(res);
		
		ahome.logOut();

	}

}
