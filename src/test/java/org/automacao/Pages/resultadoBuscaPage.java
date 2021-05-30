package org.automacao.Pages;

import org.automacao.Utils.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resultadoBuscaPage {

    public resultadoBuscaPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    @FindBy(css = ".neemu-products-container")
    protected WebElement listaProduto;

    @FindBy(css = ".neemu-order-filter-container > select:nth-child(2)")
    protected WebElement ordenarPorCombo;

    @FindBy(xpath = "(//*[contains(@id,\"nm-product\")])[1]")
    protected WebElement primeiroItemLista;
}
