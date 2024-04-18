package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".top-card:nth-child(3)")
    WebElement alertsFrameWindows;
    public SidePanel getAlertsFrameWindows() {
        clickJS(alertsFrameWindows,0,300);
        return new SidePanel(driver);
    }

    @FindBy(css=".top-card:nth-child(4)")
    WebElement widgets;

    public SidePanel getWidgets(){
        clickJS(widgets,0,300);
        return new SidePanel(driver);
    }

    @FindBy(css=".top-card:nth-child(2)")
    WebElement forms;
    public SidePanel getForms() {
        clickJS(forms,0,300);
        return new SidePanel(driver);
    }

    @FindBy(css = ".top-card:nth-child(5)")
    WebElement interactions;
    public SidePanel getInteractions() {
        clickJS(interactions,0,300);
        return  new SidePanel(driver);
    }

    @FindBy(css = ".top-card:nth-child(1)")
    WebElement elements;
    public SidePanel getElements() {
        clickJS(elements,0,300);
        return  new SidePanel(driver);
    }
}
