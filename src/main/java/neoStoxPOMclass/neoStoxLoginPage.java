package neoStoxPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class neoStoxLoginPage

{
@FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement mobNumberField;
@FindBy(id="lnk_signup1")private WebElement signIn;

public neoStoxLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void enterMobileNumber(WebDriver driver, String mobNum)
{
	
	mobNumberField.sendKeys(mobNum);
}

public void clickOnSignInButton(WebDriver driverj		)
{
	signIn.click();
}

}
