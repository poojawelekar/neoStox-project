package neoStoxPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class neoStoxHomePage 

{
@FindBy(id="lbl_username") private WebElement userName;

@FindBy(id="lbl_curbalancetop") private WebElement balance;

@FindBy(xpath="//span[text()='Logout']") private WebElement logout;

public neoStoxHomePage( WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public String getUserName()
{
	String actualUserName = userName.getText();
	
	return actualUserName;
}

public String getBalance() 
{
	String actualBalance = balance.getText();
	return actualBalance;
}

public void logOutFromApplication(WebDriver driver)
{
	userName.click();
	
	logout.click();
}
}
