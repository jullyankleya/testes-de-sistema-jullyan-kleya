package org.automacao.Actions;

import org.automacao.Pages.produtoPage;
import org.automacao.Utils.GenericMethods;
import org.automacao.Utils.Hooks;
import org.openqa.selenium.JavascriptExecutor;

public class produtoActions extends produtoPage {

    GenericMethods genericMethods = new GenericMethods();

    public void verificarEspecificaoesProduto() {
        genericMethods.waitForVisibleElement(especificacoesProduto);
        ((JavascriptExecutor) Hooks.getDriver()).executeScript("arguments[0].scrollIntoView(true);", especificacoesProduto);
    }

    public void clicarBotaoComprar() {
        genericMethods.waitForClickableElement(botaoComprar);
        botaoComprar.click();
    }
}
