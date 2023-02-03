package com.tia.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tia.cucumber.drivers.DriverSingleton;

public class DashboardPage {

	private WebDriver driver;

    public DashboardPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement menuDashboard;
    
    @FindBy(xpath = "//p[normalize-space()='Quick Launch']")
    WebElement txtQuickLaunch;
    
    public void clickMenuDashboard() {
    	menuDashboard.click();
    }
    
    public String getTxtQuickLaunch() {
    	return txtQuickLaunch.getText();
    }
}
