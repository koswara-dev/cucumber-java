package com.tia.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tia.cucumber.drivers.DriverSingleton;

public class LoginPage {

	private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement inputUsername;
    
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement inputPassword;
    
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement txtDashboard;
	
	public void login(String username, String password) {
		inputUsername.sendKeys(username);
		inputPassword.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	public String getTxtDashboard() {
		return txtDashboard.getText();
	}
	
}
