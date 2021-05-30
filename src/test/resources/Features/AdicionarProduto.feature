#language: pt
Funcionalidade: Adicionar Produto na sacola de compras do site Chillibeans
  Como usuário do site
  Eu quero adicionar os itens a minha sacola de compras
  Para que eu possa realizar a compra futuramente

  @consultar-detalhe-produto
  Cenário: Teste T03 - Consultar os detalhes do produto
    Dado que os resultados de pesquisa do site Chillibeans para "CHILLI BEANS NEW SPORT FOSCO" são exibidos
    Quando o usuário clica no nome do primeiro produto da lista
    Então são exibidas as informações detalhadas do produto escolhido

  @adicionar-produto-no-carrinho
  Cenário: Teste T04 - Adicionar produto no carrinho
    Dado que os resultados de pesquisa do site Chillibeans para "CHILLI BEANS NEW SPORT FOSCO" são exibidos
    Quando o usuário clica no nome do primeiro produto da lista
    E clica no botão comprar
    Então o produto é adicionado a sacola de compras

  @adicionar-outro-produto-na-sacola
  Cenário: Teste T05 - Adicionar outro produto na sacola de compras
    Dado que foi adicionado um "CHILLI BEANS NEW SPORT FOSCO" na sacola de compras do site Chillibeans
    E o navegador está na página inicial do site Chillibeans
    Quando o usuário insere um segundo "Relógio Analógico Masculino Chilli Beans Metal Dourado" na sacola de compras
    Então os dados da compra são exibidos