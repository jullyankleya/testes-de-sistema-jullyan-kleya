package org.automacao.Pages;

import org.automacao.Utils.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    public homePage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    @FindBy(css = ".search__text")
    protected WebElement campoBuscaHome;

    @FindBy(css = ".search__submit")
    protected WebElement botaoLupa;

    @FindBy(css = "#acceptCookie")
    public WebElement aceitarCookie;

}
