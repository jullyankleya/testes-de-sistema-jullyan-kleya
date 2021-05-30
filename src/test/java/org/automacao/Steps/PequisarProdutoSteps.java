package org.automacao;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.automacao.Actions.homeActions;
import org.automacao.Actions.resultadoBuscaActions;
import org.automacao.Utils.Hooks;
import org.junit.Assert;

import static org.automacao.Utils.GenericMethods.waitPageLoad;

public class PequisarProdutoSteps extends homeActions {

    resultadoBuscaActions ResultadoBuscaAction = new resultadoBuscaActions();

    @Dado("que o navegador está na página inicial do site Chillibeans")
    public void queONavegadorEstáNaPáginaInicialDoSiteChillibeans() throws Throwable {
        waitPageLoad();
        Assert.assertTrue(Hooks.driver.getTitle().contains("Óculos de Sol, Armações de Grau e Relógios | Loja Chilli Beans"));
    }

    @Quando("o usuário digita {string} no campo de busca")
    public void oUsuárioDigitaNoCampoDeBusca(String text) throws Throwable {
        inserirTxtCampoBusca(text);
    }

    @E("clica no botão de lupa")
    public void clicaNoBotãoDeLupa() throws Throwable {
        clicarBotaoLupa();
    }

    @Então("é exibida uma lista de produtos")
    public void éExibidaUmaListaDeProdutos() throws Throwable {
        ResultadoBuscaAction.verificarListaProduto();
    }

    @Dado("que os resultados de pesquisa do site Chillibeans para {string} são exibidos")
    public void queOsResultadosDePesquisaDoSiteChillibeansParaSãoExibidos(String text) throws Throwable {
        queONavegadorEstáNaPáginaInicialDoSiteChillibeans();
        oUsuárioDigitaNoCampoDeBusca(text);
        clicarBotaoLupa();
        ResultadoBuscaAction.verificarListaProduto();
    }

    @Quando("o usuário escolhe ordenar por menor preço")
    public void oUsuárioEscolheOrdenarPorMenorPreço() throws Throwable {
        ResultadoBuscaAction.ordernarListarMenorPreco();
    }

    @Então("é exibida uma lista de produtos com menor faixa de preço")
    public void éExibidaUmaListaDeProdutosComMenorFaixaDePreço() throws Throwable {
        ResultadoBuscaAction.verificarListaMenorPreco();
    }


}
