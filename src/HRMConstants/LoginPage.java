package HRMConstants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends OrangeHRMConstants{

		@FindBy(id = "txtUsername") WebElement uid;

		@FindBy(id = "txtPassword") WebElement pwd;
		
		@FindBy(id ="btnLogin") WebElement login;

		//Functions  
		
		public void logiN(String uname,String pword) {
			
			uid.sendKeys(uname);
			
			pwd.sendKeys(pword);
			
			login.click();
		}
			
		
}
