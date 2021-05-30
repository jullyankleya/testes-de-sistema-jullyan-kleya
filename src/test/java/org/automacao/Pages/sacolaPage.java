package org.automacao.Pages;

import org.automacao.Utils.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class sacolaPage {

    public sacolaPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    @FindBy(css = "#cart-title")
    protected WebElement sacolaTitutlo;

    @FindBy(xpath = "//input[contains(@id,'item-quantity')]")
    protected WebElement qtdItemSacola;

    @FindBy(xpath = "(//*[text()='Comprar mais produtos'])[1]")
    protected WebElement botaoComprarMaisProdutos;

    @FindBy(xpath = "//*[@class='table cart-items']/tbody/tr")
    protected List<WebElement> tabelaCompras;
}
