package org.automacao.Actions;

import org.automacao.Pages.sacolaPage;
import org.automacao.Utils.GenericMethods;
import org.automacao.Utils.Hooks;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class sacolaActions extends sacolaPage {

    GenericMethods genericMethods = new GenericMethods();

    public void verificarItemSacola() {
        genericMethods.waitForVisibleElement(sacolaTitutlo);
        Assert.assertEquals(qtdItemSacola.getAttribute("min"), "1");
    }

    public void clicarComprarMaisProdutos() {
        genericMethods.waitForClickableElement(botaoComprarMaisProdutos);
        ((JavascriptExecutor) Hooks.getDriver()).executeScript("arguments[0].scrollIntoView(true);", botaoComprarMaisProdutos);
        botaoComprarMaisProdutos.click();
    }

    public void verificarQtdsItemSacola() {
        List<WebElement> rows = tabelaCompras;
        String count = String.valueOf(rows.size());
        for (WebElement e : rows) {
            Assert.assertEquals("2", count);
        }
    }
}
