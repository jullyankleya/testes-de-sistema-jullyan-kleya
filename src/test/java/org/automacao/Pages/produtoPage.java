package org.automacao.Pages;

import org.automacao.Utils.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class produtoPage {

    public produtoPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    @FindBy(css = ".specifications__right")
    protected WebElement especificacoesProduto;

    @FindBy(css = ".buy-button")
    protected WebElement botaoComprar;
}
