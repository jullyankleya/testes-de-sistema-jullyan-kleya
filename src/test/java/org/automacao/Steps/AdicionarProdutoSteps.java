package org.automacao;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.automacao.Actions.produtoActions;
import org.automacao.Actions.resultadoBuscaActions;
import org.automacao.Actions.sacolaActions;

public class AdicionarProdutoSteps extends resultadoBuscaActions {

    produtoActions ProdutoActions = new produtoActions();
    sacolaActions SacolaActions = new sacolaActions();
    PequisarProdutoSteps pequisarProdutoSteps = new PequisarProdutoSteps();

    @Quando("o usuário clica no nome do primeiro produto da lista")
    public void oUsuárioClicaNoNomeDoPrimeiroProdutoDaLista() throws Throwable {
        selecionarPrimeiroItemLista();
    }

    @Então("são exibidas as informações detalhadas do produto escolhido")
    public void sãoExibidasAsInformaçõesDetalhadasDoProdutoEscolhido() throws Throwable {
        ProdutoActions.verificarEspecificaoesProduto();
    }

    @Quando("clica no botão comprar")
    public void clicaNoBotãoComprar() throws Throwable {
        ProdutoActions.clicarBotaoComprar();
    }

    @Então("o produto é adicionado a sacola de compras")
    public void oProdutoÉAdicionadoASacolaDeCompras() throws Throwable {
        SacolaActions.verificarItemSacola();
    }

    @Dado("que foi adicionado um {string} na sacola de compras do site Chillibeans")
    public void queFoiAdicionadoUmNaSacolaDeComprasDoSiteChillibeans(String text) throws Throwable {
        pequisarProdutoSteps.queOsResultadosDePesquisaDoSiteChillibeansParaSãoExibidos(text);
        oUsuárioClicaNoNomeDoPrimeiroProdutoDaLista();
        clicaNoBotãoComprar();
        oProdutoÉAdicionadoASacolaDeCompras();
    }

    @E("o navegador está na página inicial do site Chillibeans")
    public void oNavegadorEstáNaPáginaInicialDoSiteChillibeans() throws Throwable {
        SacolaActions.clicarComprarMaisProdutos();
        pequisarProdutoSteps.queONavegadorEstáNaPáginaInicialDoSiteChillibeans();

    }

    @Quando("o usuário insere um segundo {string} na sacola de compras")
    public void oUsuárioInsereUmSegundoProdutoNaSacolaDeCompras(String text) throws Throwable {
        pequisarProdutoSteps.oUsuárioDigitaNoCampoDeBusca(text);
        pequisarProdutoSteps.clicaNoBotãoDeLupa();
        oUsuárioClicaNoNomeDoPrimeiroProdutoDaLista();
        clicaNoBotãoComprar();
    }

    @Então("os dados da compra são exibidos")
    public void osDadosDaCompraSãoExibidos() throws Throwable {
        SacolaActions.verificarQtdsItemSacola();
    }
}
