#language: pt
Funcionalidade: Pesquisar produtos no site Chillibeans

  Como usuário do site
  Eu quero poder realizar pesquisa dos produtos
  para que eu possa saber as informações sobre os mesmos

  @pesquisar-produto-nome
  Cenário: Teste T01 - Pesquisar produto por nome
    Dado que o navegador está na página inicial do site Chillibeans
    Quando o usuário digita "CHILLI BEANS NEW SPORT FOSCO" no campo de busca
    E clica no botão de lupa
    Então é exibida uma lista de produtos

  @pesquisar-produto-menor-faixa-preco
  Cenário: : Teste T02 - Ordenar produtos pela menor faixa de preço
    Dado que os resultados de pesquisa do site Chillibeans para "CHILLI BEANS NEW SPORT FOSCO" são exibidos
    Quando o usuário escolhe ordenar por menor preço
    Então é exibida uma lista de produtos com menor faixa de preço