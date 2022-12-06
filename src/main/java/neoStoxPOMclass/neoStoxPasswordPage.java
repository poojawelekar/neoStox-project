package neoStoxPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class neoStoxPasswordPage
{
@FindBy(id="txt_accesspin")private WebElement passwordField;
@FindBy(id="lnk_submitaccesspin")private WebElement submittButton;


public neoStoxPasswordPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void neoStoxPasswordPage( WebDriver driver, String password)
{
	passwordField.sendKeys(password);
	
}

public void neoStoxPasswordPage (WebDriver driver)
{
	submittButton.click();
}
}

