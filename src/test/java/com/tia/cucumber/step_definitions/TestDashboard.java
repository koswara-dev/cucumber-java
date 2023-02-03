package com.tia.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tia.cucumber.pages.DashboardPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDashboard {

	private static WebDriver driver;
	private static ExtentTest extentTest;
    private DashboardPage dashboardPage = new DashboardPage();

    public TestDashboard() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
    // Test Case One
    @When("User click menu Dashboard")
    public void user_click_menu_dashboard() {
        dashboardPage.clickMenuDashboard();
        extentTest.log(LogStatus.PASS, "User click menu Dashboard");
    }
    
    @Then("User on dashboard page")
    public void user_on_dashboard_page() {
    	Assert.assertEquals(dashboardPage.getTxtQuickLaunch(), "Quick Launch");
    	extentTest.log(LogStatus.PASS, "User on dashboard page");
    }
}
