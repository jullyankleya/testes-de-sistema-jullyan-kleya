package org.automacao.Actions;

import org.automacao.Pages.lojasPage;
import org.automacao.Utils.GenericMethods;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class lojasActions extends lojasPage {

    GenericMethods genericMethods = new GenericMethods();

    public void selecionarEstado(String text) {
        Select combo = new Select(selectEstado);
        combo.selectByVisibleText(text);
        String selectedValue = combo.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedValue, text);
    }

    public void selecionarCidade(String text) {
        genericMethods.waitForTextToBePresentInElement(selectCidade, text);
        Select combo = new Select(selectCidade);
        combo.selectByVisibleText(text);
        String selectedValue = combo.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedValue, text);
    }

    public void selecionarBairro(String text) {
        genericMethods.waitForTextToBePresentInElement(selectBairro, text);
        Select combo = new Select(selectBairro);
        combo.selectByVisibleText(text);
        String selectedValue = combo.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedValue, text);
    }

    public void clicarBuscarLojas() {
        botaoBuscarLojas.click();
    }

    public void resultadoBuscarLojas() {
        genericMethods.waitForVisibleElement(resultadoBuscaLoja);
    }

    public void marcarFlagLentes() {
        flagLentes.click();
    }
}
