#language: pt
Funcionalidade: Pesquisar lojas físicas no site Chillibeans
  Como usuário do site
  Eu quero realizar buscas por lojas físicas
  para que eu possa visitá-las em outro momento.

  @encontrar-loja-por-localizacao
  Cenário: Teste T06 - Pesquisar lojas físicas informando a localização
    Dado o usuário clica no menu "encontre uma loja"
    Quando o usuário seleciona o estado "PE"
    * o usuário seleciona a cidade "RECIFE"
    * o usuário seleciona o bairro "CASA FORTE"
    E clica no botão buscar lojas
    Então são exibidas lista das lojas


  @encontrar-lojas-que-vendem-lentes
  Cenário: Teste T07 - Pesquisar lojas físicas informando o cep
    Dado que o resultado da pesquisa por localização é exibido
    Quando o usuário clica na flag lojas que vendem lentes
    E clica no botão buscar lojas
    Então são exibidas as lojas que vendem lentes