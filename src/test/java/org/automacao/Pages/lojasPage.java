package org.automacao.Pages;

import org.automacao.Utils.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lojasPage {

    public lojasPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    @FindBy(css = "#estado")
    protected WebElement selectEstado;

    @FindBy(css = "#cidade")
    protected WebElement selectCidade;

    @FindBy(css = "#bairro")
    protected WebElement selectBairro;

    @FindBy(css = ".Search_store__button__2zHbK")
    protected WebElement botaoBuscarLojas;

    @FindBy(css = "#resultadoBusca")
    protected WebElement resultadoBuscaLoja;

    @FindBy(css = "#lentes")
    protected WebElement flagLentes;
}
