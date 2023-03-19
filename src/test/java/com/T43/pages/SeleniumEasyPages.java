package com.T43.pages;

import com.T43.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumEasyPages {

    public SeleniumEasyPages()  {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"navbar-collapse\"]/nav/ul/li[4]/a")
    public WebElement maven;





}
