package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US9_Page {
    public US9_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Dashboard']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
//    public WebElement dashboardPage;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement fileModules;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actionIcon;

    @FindBy(xpath = "//li[@class=' action-details-container']")
    public WebElement detailOptions;

    @FindBy(xpath ="//span[@class='app-sidebar-tabs__tab-icon icon-comment']" )
    public WebElement postMessage;
}

