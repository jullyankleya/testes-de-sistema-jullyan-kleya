package org.automacao.Actions;

import org.automacao.Pages.homePage;
import org.automacao.Utils.GenericMethods;

public class homeActions extends homePage {

    GenericMethods genericMethods = new GenericMethods();

    public void inserirTxtCampoBusca(String text) {
        if (aceitarCookie.isDisplayed()) {
            aceitarCookie.click();
        }
        genericMethods.waitForClickableElement(campoBuscaHome);
        campoBuscaHome.click();
        campoBuscaHome.clear();
        campoBuscaHome.sendKeys(text);
    }

    public void clicarBotaoLupa() {
        genericMethods.waitForClickableElement(botaoLupa);
        botaoLupa.click();
    }
}
