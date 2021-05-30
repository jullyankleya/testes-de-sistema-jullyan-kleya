package org.automacao;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.automacao.Actions.lojasActions;
import org.automacao.Utils.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Set;

import static org.automacao.Utils.GenericMethods.waitPageLoad;

public class PesquisarLojaFisicaSteps extends lojasActions {


    @Dado("o usuário clica no menu {string}")
    public void oUsuárioClicaNoMenu(String text) throws Throwable {
        waitPageLoad();
        Assert.assertTrue(Hooks.driver.getTitle().contains("Óculos de Sol, Armações de Grau e Relógios | Loja Chilli Beans"));
        Hooks.driver.findElement(By.xpath("//*[contains(@class,'utilities__item')]/*/*[text()='" + text + "']")).click();
    }

    @Quando("o usuário seleciona o estado {string}")
    public void oUsuárioSelecionaOEstadoPernambuco(String text) throws Throwable {
        String MainWindow = Hooks.driver.getWindowHandle();
        Set<String> s1 = Hooks.driver.getWindowHandles();
        for (String ChildWindow : s1) {
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                Hooks.driver.switchTo().window(ChildWindow);
            }
        }
        waitPageLoad();
        Assert.assertTrue(Hooks.driver.getTitle().contains("Onde Encontrar"));
        selecionarEstado(text);
    }

    @E("o usuário seleciona a cidade {string}")
    public void oUsuárioSelecionaACidadeRecife(String text) throws Throwable {
        waitPageLoad();
        selecionarCidade(text);
    }

    @E("o usuário seleciona o bairro {string}")
    public void oUsuárioSelecionaOBairroRecife(String text) throws Throwable {
        waitPageLoad();
        selecionarBairro(text);
    }

    @Então("são exibidas lista das lojas")
    public void sãoExibidasListaDasLojas() throws Throwable {
        resultadoBuscarLojas();
    }

    @Dado("que o resultado da pesquisa por localização é exibido")
    public void queOResultadoDaPesquisaPorLocalizaçãoÉExibido() throws Throwable {
        String opcao = "encontre uma loja";
        String UF = "PE";
        String cidade = "RECIFE";
        String bairro = "CASA FORTE";
        oUsuárioClicaNoMenu(opcao);
        oUsuárioSelecionaOEstadoPernambuco(UF);
        oUsuárioSelecionaACidadeRecife(cidade);
        oUsuárioSelecionaOBairroRecife(bairro);
    }

    @Quando("o usuário clica na flag lojas que vendem lentes")
    public void oUsuárioClicaNaFlagLojasQueVendemLentes() throws Throwable {
        marcarFlagLentes();
    }

    @E("clica no botão buscar lojas")
    public void clicaNoBotãoBuscarLojas() throws Throwable {
        clicarBuscarLojas();
    }

    @Então("são exibidas as lojas que vendem lentes")
    public void sãoExibidasAsLojasQueVendemLentes() throws Throwable {
        resultadoBuscarLojas();
    }
}
