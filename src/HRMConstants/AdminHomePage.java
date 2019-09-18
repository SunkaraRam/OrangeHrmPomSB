package HRMConstants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage {
	
	@FindBy(partialLinkText="Welcome") WebElement welcome;

	@FindBy(linkText="Logout") WebElement logout;
	
	public boolean isWelcomeDisplayed() {
		
		if (welcome.isDisplayed()) {
			
			return true;
			
		} else {
			
			return false;

		}
	
	}

	
	public void logOut() {
		
		welcome.click();
		logout.click();
		
	}
}
