package org.automacao.Actions;

import org.automacao.Pages.resultadoBuscaPage;
import org.automacao.Utils.GenericMethods;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class resultadoBuscaActions extends resultadoBuscaPage {

    GenericMethods genericMethods = new GenericMethods();
    homeActions HomeActions = new homeActions();

    public void verificarListaProduto() {
        genericMethods.waitForVisibleElement(listaProduto);
        if (HomeActions.aceitarCookie.isDisplayed()) {
            HomeActions.aceitarCookie.click();
        }
        listaProduto.isDisplayed();
    }

    public void ordernarListarMenorPreco() {
        Select combo = new Select(ordenarPorCombo);
        combo.selectByVisibleText("Menor preço");
    }

    public void verificarListaMenorPreco() {
        Select combo = new Select(ordenarPorCombo);
        String selectedValue = combo.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedValue, "Menor preço");
    }

    public void selecionarPrimeiroItemLista() {
        genericMethods.waitForClickableElement(primeiroItemLista);
        primeiroItemLista.click();
    }
}
